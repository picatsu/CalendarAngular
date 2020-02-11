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
        serv.createUNE_SALLE(UNE_SALLE);
        return "UNE_SALLE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_SALLE> getAll() {
        logger.debug("Getting all UNE_SALLE.");
        return serv.getAllUNE_SALLE();
    }

    @GetMapping(value= "/getbyid/{UNE_SALLE-id}")
    public Optional<UNE_SALLE> getById(@PathVariable(value= "UNE_SALLE-id") int id) {
        logger.debug("Getting UNE_SALLE with UNE_SALLE-id= {}.", id);
        return serv.findUNE_SALLEById(id);
    }

    @PutMapping(value= "/update/{UNE_SALLE-id}")
    public String update(@PathVariable(value= "UNE_SALLE-id") int id, @RequestBody UNE_SALLE e) {
        logger.debug("Updating UNE_SALLE with UNE_SALLE-id= {}.", id);
        e.setId(id);
        serv.updateUNE_SALLE(e);
        return "UNE_SALLE record for UNE_SALLE-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_SALLE-id}")
    public String delete(@PathVariable(value= "UNE_SALLE-id") int id) {
        logger.debug("Deleting UNE_SALLE with UNE_SALLE-id= {}.", id);
        serv.deleteUNE_SALLEById(id);
        return "UNE_SALLE record for UNE_SALLE-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_SALLE.");
        serv.deleteAllUNE_SALLE();
        return "All UNE_SALLE records deleted.";
    }


}
