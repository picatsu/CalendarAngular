package com.bada.controller;


import com.bada.model.*;
import com.bada.model.utils.UNE_RESSOURCE;
import com.bada.model.utils.forFront.CustomSeance;
import com.bada.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@RestController
@RequestMapping(value= "/api/mongo/customcontroller")
public class CustomController {


    @Autowired
    UN_GROUPES_SERVICE groupes_service;

    @Autowired
    UNE_SEANCE_SERVICE seance_service;

    @Autowired
    UN_ENSEIGNEMENT_SERVICE enseignement_service;

    @Autowired
    UNE_SALLE_SERVICE salle_service;

    @Autowired
    UN_PROFESSEUR_SERVICE professeur_service;

    @Autowired
    MongoTemplate mongoTemplate;


    @GetMapping("/getelodie")
    @CrossOrigin
    public List<UNE_SEANCE> getAllDb(@RequestParam(required = false) String value) throws Exception {

     List<UN_GROUPES> finalGroup = new ArrayList<>();
     List<UNE_SEANCE> finalSeance = new ArrayList<>();
     for(UN_GROUPES grp : groupes_service.getAllUN_GROUPES()){
         if(grp.getALIAS().equals(value)) {
             finalGroup.add(grp);
         }
     }

     for(UNE_SEANCE seance : seance_service.getAllUNE_SEANCE()){
         for(UN_GROUPES grp: finalGroup){
             if( seance.checkLesRessources(grp.getCODE()) ){
                 finalSeance.add(seance);
             }
         }
     }

     return finalSeance;
    }

    @GetMapping("/loadseance")
    @CrossOrigin
    public List<CustomSeance> getLoadSeance() throws Exception {
        mongoTemplate.dropCollection(CustomSeance.class);
        List<CustomSeance> customseance = new ArrayList<>();

        for(UNE_SEANCE seance: seance_service.getAllUNE_SEANCE()){
            CustomSeance q = new CustomSeance(seance.getDATE(), seance.getHEURE(), seance.getDUREE());
            if(seance.getCODE_PROPRIETAIRE() != null &&
                    seance.getCODE_PROPRIETAIRE().equals("2")){
                q.setIsProf("yes");
            } else {
                q.setIsProf("no");
            }
            for(UNE_RESSOURCE uneressource: seance.getLES_RESSOURCES()){

                try{
                    if(uneressource.getTYPE().equals("SALLE")) {
                        q.setIdSalle(uneressource.getCODE_RESSOURCE());
                    }
                }catch( Exception e ){

                }
                try{
                    if( uneressource.getTYPE().equals("GROUPE")) {
                        q.setIdGroupe(uneressource.getCODE_RESSOURCE());
                    }
                }catch( Exception e ){

                }
                try{
                    if( uneressource.getTYPE().equals("PROF")){
                        q.setIdProf(uneressource.getCODE_RESSOURCE());
                    }
                }catch( Exception e ){

                }

                q.setIdEnseignement( seance.getENSEIGNEMENT()  );
            }

            customseance.add(q);
        }

        //// G RECUPERER SEANCE => GO CHERCHER LES SALLES
            for(CustomSeance seance: customseance){

                UNE_SALLE salle = mongoTemplate.findOne(new Query(where("CODE").is(seance.getIdSalle())), UNE_SALLE.class);
                    if (  salle != null ){
                    seance.setNomSalle(salle.getNOM());
                }

                UN_GROUPES groupe = mongoTemplate.findOne(new Query(where("CODE").is(seance.getIdGroupe())), UN_GROUPES.class);
                if (  groupe != null   ){
                    seance.setNomFiliere(groupe.getALIAS());
                   // seance.setListEtudiants(groupe.getLES_ETUDIANTS_DU_GROUPE());
                }


                UN_PROFESSEUR prof = mongoTemplate.findOne(new Query(where("CODE").is(seance.getIdProf())), UN_PROFESSEUR.class);
                if ( prof != null){
                    seance.setNomProf( prof.getNOM() );
                    seance.setPrenomProf( prof.getPRENOM() );
                    seance.setPrenomProf2( prof.getPRENOM2() );


                }

                UN_ENSEIGNEMENT enseignement = mongoTemplate.findOne(new Query(where("CODE").is(seance.getIdEnseignement())), UN_ENSEIGNEMENT.class);

                if ( enseignement != null ){
                    seance.setNomMatiere( enseignement.getNOM());


                }





                /////////////
            }




        mongoTemplate.insert(customseance, CustomSeance.class);
        return customseance;


    }

    @GetMapping("/getseance")
    @CrossOrigin
    public List<CustomSeance> getseance(@RequestParam(required = false) String value,
                                        @RequestParam(required = false) String nomprof) throws Exception {
        Query query = new Query();
        if(nomprof != null ){

            List<CustomSeance> seance = new ArrayList<>() ;
            System.out.println("  affichage  "+nomprof+ " and : "+ mongoTemplate.findAll(CustomSeance.class).size());

            for(CustomSeance s : mongoTemplate.findAll(CustomSeance.class)) {
                if( s.getIsProf() != null &&
                        (s.getNomProf()+s.getPrenomProf()).toUpperCase().replace(" ", "").equals(nomprof) ){
                    seance.add(s);

                }
            }

            return seance;
        }
        query.addCriteria(Criteria.where("nomFiliere").is(value) );
        // List<CustomSeance> seance = mongoTemplate.find(query, CustomSeance.class);
        return mongoTemplate.find(query, CustomSeance.class) ;

    }

    private List<String> transfom(String[] old){
        List<String> aa = new ArrayList<>();
        System.out.println("old : "+old.length);

        for(int i=0; i < old.length; i++){
            aa.add( old[i] );
        }
        return aa;
    }
}
