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

    @GetMapping(value= "/getbycode/{UNE_SALLE-CODE}")
    public Optional<UNE_SALLE> getByCODE(@PathVariable(value= "UNE_SALLE-CODE") String CODE) {
        logger.debug("Getting UNE_SALLE with UNE_SALLE-CODE= {}.", CODE);
        return serv.findUNE_SALLEByCODE(CODE);
    }

    @PutMapping(value= "/update/{UNE_SALLE-CODE}")
    public String update(@PathVariable(value= "UNE_SALLE-CODE") String CODE, @RequestBody UNE_SALLE e) {
        logger.debug("Updating UNE_SALLE with UNE_SALLE-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUNE_SALLE(e);
        return "UNE_SALLE record for UNE_SALLE-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_SALLE-CODE}")
    public String delete(@PathVariable(value= "UNE_SALLE-CODE") String CODE) {
        logger.debug("Deleting UNE_SALLE with UNE_SALLE-CODE= {}.", CODE);
        serv.deleteUNE_SALLEByCODE(CODE);
        return "UNE_SALLE record for UNE_SALLE-id= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_SALLE.");
        serv.deleteAllUNE_SALLE();
        return "All UNE_SALLE records deleted.";
    }


}

