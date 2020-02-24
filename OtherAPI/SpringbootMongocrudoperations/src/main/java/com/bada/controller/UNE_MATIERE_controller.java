package com.bada.controller;


import com.bada.model.UNE_MATIERE;
import com.bada.service.UNE_MATIERE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UNE_MATIERE")
public class UNE_MATIERE_controller {

    @Autowired
    UNE_MATIERE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_MATIERE> UNE_MATIERE) {
        logger.debug("Saving UNE_MATIERE.");
        serv.createUNE_MATIERE(UNE_MATIERE);
        return "UNE_MATIERE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_MATIERE> getAll() {
        logger.debug("Getting all UNE_MATIERE.");
        return serv.getAllUNE_MATIERE();
    }


    @GetMapping(value= "/getbycode/{UNE_MATIERE-CODE}")
    public Optional<UNE_MATIERE> getByCODE(@PathVariable(value= "UNE_MATIERE-id") String CODE) {
        logger.debug("Getting UNE_MATIERE with UNE_MATIERE-CODE= {}.", CODE);
        return serv.findUNE_MATIEREByCODE(CODE);
    }

    @PutMapping(value= "/update/{UNE_MATIERE-CODE}")
    public String update(@PathVariable(value= "UNE_MATIERE-CODE") String CODE, @RequestBody UNE_MATIERE e) {
        logger.debug("Updating UNE_MATIERE with UNE_MATIERE-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUNE_MATIERE(e);
        return "UNE_MATIERE record for UNE_MATIERE-id= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_MATIERE-CODE}")
    public String delete(@PathVariable(value= "UNE_MATIERE-CODE") String CODE) {
        logger.debug("Deleting UNE_MATIERE with UNE_MATIERE-CODE= {}.", CODE);
        serv.deleteUNE_MATIEREByCODE(CODE);
        return "UNE_MATIERE record for UNE_MATIERE-CODE= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_MATIERE.");
        serv.deleteAllUNE_MATIERE();
        return "All UNE_MATIERE records deleted.";
    }


}
