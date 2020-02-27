package com.bada.controller;


import com.bada.model.*;
import com.bada.model.utils.UNE_RESSOURCE;
import com.bada.model.utils.forFront.CustomSeance;
import com.bada.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

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

    @GetMapping("/getseance")
    @CrossOrigin
    public List<CustomSeance> getSeance(@RequestParam(required = false) String value) throws Exception {



        Collection<UN_GROUPES> colGroupe = groupes_service.getAllUN_GROUPES();
        Collection<UN_ENSEIGNEMENT> colEnsei = enseignement_service.getAllUN_ENSEIGNEMENT();

        List<CustomSeance> customseance = new ArrayList<>();

        for(UNE_SEANCE seance: seance_service.getAllUNE_SEANCE()){

            CustomSeance q = new CustomSeance(seance.getDATE(), seance.getHEURE(), seance.getDUREE());
            for(UNE_RESSOURCE uneressource: seance.getLES_RESSOURCES()){

                    q.setSalle(new UNE_RESSOURCE("emptytype",uneressource.getCODE_RESSOURCE()));
                    q.setGroupe( new UNE_RESSOURCE("emptytype", uneressource.getCODE_RESSOURCE()) );
                    q.setProf( new UNE_RESSOURCE("emptytype", uneressource.getCODE_RESSOURCE()) );
            }

            customseance.add(q);
        }
            //// G RECUPERER SEANCE => GO CHERCHER LES SALLES
            for(CustomSeance seance: customseance){

                if(seance.
                        getSalle().
                        getTYPE().
                        equals("emptytype")) {
                    for(UNE_SALLE salle : salle_service.getAllUNE_SALLE()){
                        if(salle.getCODE().equals(seance.getSalle().getCODE_RESSOURCE())){
                            seance.getSalle().setTYPE(salle.getALIAS());
                            // NOM SALLES  from  SEANCE
                        }
                    }
                }

                if(seance.getGroupe().getTYPE().equals("emptytype")){
                    for(UN_GROUPES grp:  groupes_service.getAllUN_GROUPES()){
                        if(grp.getCODE().equals(seance.getGroupe().getCODE_RESSOURCE())){
                            seance.getGroupe().setTYPE( grp.getALIAS()  );
                            if( grp.getLES_ETUDIANTS_DU_GROUPE() != null  ){
                                seance.setListeEtudiant(this.transfom(grp.getLES_ETUDIANTS_DU_GROUPE()) );
                            }

                            // Alias group from POUR SEANCE.liste etudiants
                        }
                    }
                }

                if(seance.getProf().getTYPE().equals("emptytype")){
                    for(UN_PROFESSEUR grp: professeur_service.getAllUN_PROFESSEUR()){
                        if(grp.getCODE().equals(seance.getProf().getCODE_RESSOURCE())){
                            seance.getProf().setTYPE("validprof");
                            seance.setNomprof( grp.getNOM()  );
                            seance.setPrenomprof( grp.getPRENOM() );
                            seance.setPrenomprof( grp.getPRENOM2() );
                            //  infos prof POUR CHAQUE SEANCE from UN_PROFESSEUR
                        }
                    }
                }

            }

        List<CustomSeance> customseanceRES = new ArrayList<>();

            for(CustomSeance c : customseance){
                if(c.getGroupe().getTYPE().equals(value) ){
                    customseanceRES.add(c);
                }
            }

        return customseanceRES;
    }


    private List<String> transfom(String[] old){
        List<String> aa = new ArrayList<>();
        System.out.println("old : "+old.length);

        for(int i=0; i<old.length; i++){
            System.out.println("old : "+old[i]);
            aa.add( old[i] );
        }
        return aa;
    }
}
