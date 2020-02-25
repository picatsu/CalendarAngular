package com.bada.controller;


import com.bada.model.UN_PROFESSEUR;
import com.bada.service.UN_PROFESSEUR_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_PROFESSEUR")
public class UN_PROFESSEUR_controller {

    @Autowired
    UN_PROFESSEUR_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_PROFESSEUR> UN_PROFESSEUR) {
        logger.debug("Saving UN_PROFESSEUR.");
        UN_PROFESSEUR.get(0).setId(UN_PROFESSEUR.get(0).getCODE());
        serv.createUN_PROFESSEUR(UN_PROFESSEUR);
        return "UN_PROFESSEUR records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_PROFESSEUR> getAll() {
        logger.debug("Getting all UN_PROFESSEUR.");
        return serv.getAllUN_PROFESSEUR();
    }

    @GetMapping(value= "/getbyid/{UN_PROFESSEUR-Id}")
    public Optional<UN_PROFESSEUR> getById(@PathVariable(value= "UN_PROFESSEUR-Id") String Id) {
        logger.debug("Getting UN_PROFESSEUR with UN_PROFESSEUR-Id= {}.", Id);
        return serv.findUN_PROFESSEURById(Id);
    }

    @PutMapping(value= "/update/{UN_PROFESSEUR-Id}")
    public String update(@PathVariable(value= "UN_PROFESSEUR-Id") String Id,
                         @RequestBody UN_PROFESSEUR e) {
        logger.debug("Updating UN_PROFESSEUR with UN_PROFESSEUR-Id= {}.", Id);
        e.setId(Id);
        serv.updateUN_PROFESSEUR(e);
        return "UN_PROFESSEUR record for UN_PROFESSEUR-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_PROFESSEUR-Id}")
    public String delete(@PathVariable(value= "UN_PROFESSEUR-Id") String Id) {
        logger.debug("Deleting UN_PROFESSEUR with UN_PROFESSEUR-Id= {}.", Id);
        serv.deleteUN_PROFESSEURById(Id);
        return "UN_PROFESSEUR record for UN_PROFESSEUR-Id= " +Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_PROFESSEUR.");
        serv.deleteAllUN_PROFESSEUR();
        return "All UN_PROFESSEUR records deleted.";
    }


}
