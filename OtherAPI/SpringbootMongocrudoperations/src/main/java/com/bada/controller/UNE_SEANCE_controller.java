package com.bada.controller;


import com.bada.model.UNE_SEANCE;
import com.bada.service.UNE_SEANCE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UNE_SEANCE")
public class UNE_SEANCE_controller {

    @Autowired
    UNE_SEANCE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_SEANCE> UNE_SEANCE) {
        logger.debug("Saving UNE_SEANCE.");
        UNE_SEANCE.get(0).setId(UNE_SEANCE.get(0).getCODE());
        serv.createUNE_SEANCE(UNE_SEANCE);
        return "UNE_SEANCE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_SEANCE> getAll() {
        logger.debug("Getting all UNE_SEANCE.");
        return serv.getAllUNE_SEANCE();
    }

    @GetMapping(value= "/getbyid/{UNE_SEANCE-Id}")
    public Optional<UNE_SEANCE> getById(@PathVariable(value= "UNE_SEANCE-Id") String Id) {
        logger.debug("Getting UNE_SEANCE with UNE_SEANCE-Id= {}.", Id);
        return serv.findUNE_SEANCEById(Id);
    }

    @PutMapping(value= "/update/{UNE_SEANCE-Id}")
    public String update(@PathVariable(value= "UNE_SEANCE-Id") String Id, @RequestBody UNE_SEANCE e) {
        logger.debug("Updating UNE_SEANCE with UNE_SEANCE-Id= {}.", Id);
        e.setId(Id);
        serv.updateUNE_SEANCE(e);
        return "UNE_SEANCE record for UNE_SEANCE-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_SEANCE-Id}")
    public String delete(@PathVariable(value= "UNE_SEANCE-Id") String Id) {
        logger.debug("Deleting UNE_SEANCE with UNE_SEANCE-Id= {}.", Id);
        serv.deleteUNE_SEANCEById(Id);
        return "UNE_SEANCE record for UNE_SEANCE-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_SEANCE.");
        serv.deleteAllUNE_SEANCE();
        return "All UNE_SEANCE records deleted.";
    }


}
