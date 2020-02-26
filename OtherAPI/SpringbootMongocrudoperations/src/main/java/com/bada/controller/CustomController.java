package com.bada.controller;


import com.bada.model.UNE_SEANCE;
import com.bada.model.UN_ENSEIGNEMENT;
import com.bada.model.UN_GRADE;
import com.bada.model.UN_GROUPES;
import com.bada.model.utils.UNE_RESSOURCE;
import com.bada.model.utils.forFront.CustomSeance;
import com.bada.service.LES_PARAMETRES_GENERAUX_SERVICE;
import com.bada.service.UNE_SEANCE_SERVICE;
import com.bada.service.UN_ENSEIGNEMENT_SERVICE;
import com.bada.service.UN_GROUPES_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value= "/api/mongo/customcontroller")
public class CustomController {


    @Autowired
    UN_GROUPES_SERVICE groupes_service;

    @Autowired
    UNE_SEANCE_SERVICE seance_service;

    @Autowired
    UN_ENSEIGNEMENT_SERVICE enseignement_service;


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
    public String getSeance(@RequestParam(required = false) String value) throws Exception {

        List<UN_GROUPES> finalGroup = new ArrayList<>();
        List<UNE_SEANCE> finalSeance = new ArrayList<>();
        List<UN_ENSEIGNEMENT> finalEnseignement = new ArrayList<>();

        Collection<UN_GROUPES> colGroupe = groupes_service.getAllUN_GROUPES();
        Collection<UN_ENSEIGNEMENT> colEnsei = enseignement_service.getAllUN_ENSEIGNEMENT();

        List<CustomSeance> customseance = new ArrayList<>();

        for(UNE_SEANCE seance: seance_service.getAllUNE_SEANCE()){
            CustomSeance q = new CustomSeance(seance.getDATE(), seance.getHEURE(), seance.getDUREE());
            for(UNE_RESSOURCE res: seance.getLES_RESSOURCES()){
                if(res.getTYPE().equals("SALLE")){
                    q.setSalle(res.getCODE_RESSOURCE());

                }
                if( res.getTYPE().equals("GROUPE") ){
                    q.setGroupe(res.getCODE_RESSOURCE());
                }
                if( res.getTYPE().equals("PROF") ){
                    q.setProf(res.getCODE_RESSOURCE());
                }
            }

            customseance.add(q);
        }

        return "";
    }
}
