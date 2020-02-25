package com.bada.controller;


import com.bada.model.UNE_SALLE;
import com.bada.service.UNE_SALLE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UNE_SALLE")
public class UNE_SALLE_controller {

    @Autowired
    UNE_SALLE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_SALLE> UNE_SALLE) {
        logger.debug("Saving UNE_SALLE.");
        UNE_SALLE.get(0).setId(UNE_SALLE.get(0).getCODE());
        serv.createUNE_SALLE(UNE_SALLE);
        return "UNE_SALLE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_SALLE> getAll() {
        logger.debug("Getting all UNE_SALLE.");
        return serv.getAllUNE_SALLE();
    }

    @GetMapping(value= "/getbyid/{UNE_SALLE-Id}")
    public Optional<UNE_SALLE> getById(@PathVariable(value= "UNE_SALLE-Id") String Id) {
        logger.debug("Getting UNE_SALLE with UNE_SALLE-Id= {}.", Id);
        return serv.findUNE_SALLEById(Id);
    }

    @PutMapping(value= "/update/{UNE_SALLE-Id}")
    public String update(@PathVariable(value= "UNE_SALLE-Id") String Id, @RequestBody UNE_SALLE e) {
        logger.debug("Updating UNE_SALLE with UNE_SALLE-Id= {}.", Id);
        e.setId(Id);
        serv.updateUNE_SALLE(e);
        return "UNE_SALLE record for UNE_SALLE-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_SALLE-Id}")
    public String delete(@PathVariable(value= "UNE_SALLE-Id") String Id) {
        logger.debug("Deleting UNE_SALLE with UNE_SALLE-Id= {}.", Id);
        serv.deleteUNE_SALLEById(Id);
        return "UNE_SALLE record for UNE_SALLE-id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_SALLE.");
        serv.deleteAllUNE_SALLE();
        return "All UNE_SALLE records deleted.";
    }


}

