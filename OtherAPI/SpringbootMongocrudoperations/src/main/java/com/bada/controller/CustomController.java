package com.bada.controller;


import com.bada.model.UNE_SEANCE;
import com.bada.model.UN_GROUPES;
import com.bada.service.LES_PARAMETRES_GENERAUX_SERVICE;
import com.bada.service.UNE_SEANCE_SERVICE;
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
    UN_GROUPES_SERVICE groupServ;

    @Autowired
    UNE_SEANCE_SERVICE seanceServ;


    @GetMapping("/getelodie")
    @CrossOrigin
    public List<UNE_SEANCE> getAllDb(@RequestParam(required = false) String value) throws Exception {

     List<UN_GROUPES> finalGroup = new ArrayList<>();
     List<UNE_SEANCE> finalSeance = new ArrayList<>();
     for(UN_GROUPES grp : groupServ.getAllUN_GROUPES()){
         if(grp.getALIAS().equals(value)) {
             finalGroup.add(grp);
         }
     }

     for(UNE_SEANCE seance : seanceServ.getAllUNE_SEANCE()){
         for(UN_GROUPES grp: finalGroup){
             if( seance.checkLesRessources(grp.getCODE()) ){
                 finalSeance.add(seance);
             }
         }
     }


     //
        List<String> testing = new ArrayList<>();
        for(UN_GROUPES aaaa: groupServ.getAllUN_GROUPES() ){
            if( !testing.contains(aaaa.getALIAS())){
                testing.add(aaaa.getALIAS());
                System.out.println(aaaa.getALIAS());

            }
        }
        System.out.println("afgaegva"+testing);
        //
     return finalSeance;
    }
}
