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
        serv.createUNE_SEANCE(UNE_SEANCE);
        return "UNE_SEANCE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_SEANCE> getAll() {
        logger.debug("Getting all UNE_SEANCE.");
        return serv.getAllUNE_SEANCE();
    }

    @GetMapping(value= "/getbyid/{UNE_SEANCE-id}")
    public Optional<UNE_SEANCE> getById(@PathVariable(value= "UNE_SEANCE-id") int id) {
        logger.debug("Getting UNE_SEANCE with UNE_SEANCE-id= {}.", id);
        return serv.findUNE_SEANCEById(id);
    }

    @PutMapping(value= "/update/{UNE_SEANCE-id}")
    public String update(@PathVariable(value= "UNE_SEANCE-id") int id, @RequestBody UNE_SEANCE e) {
        logger.debug("Updating UNE_SEANCE with UNE_SEANCE-id= {}.", id);
        e.setId(id);
        serv.updateUNE_SEANCE(e);
        return "UNE_SEANCE record for UNE_SEANCE-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_SEANCE-id}")
    public String delete(@PathVariable(value= "UNE_SEANCE-id") int id) {
        logger.debug("Deleting UNE_SEANCE with UNE_SEANCE-id= {}.", id);
        serv.deleteUNE_SEANCEById(id);
        return "UNE_SEANCE record for UNE_SEANCE-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_SEANCE.");
        serv.deleteAllUNE_SEANCE();
        return "All UNE_SEANCE records deleted.";
    }


}
