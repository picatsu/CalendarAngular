package com.bada.controller;


import com.bada.model.UNE_ZONE_DE_SALLE;
import com.bada.service.UNE_ZONE_DE_SALLE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UNE_ZONE_DE_SALLE")
public class UNE_ZONE_DE_SALLE_controller {

    @Autowired
    UNE_ZONE_DE_SALLE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_ZONE_DE_SALLE> UNE_ZONE_DE_SALLE) {
        logger.debug("Saving UNE_ZONE_DE_SALLE.");
        serv.createUNE_ZONE_DE_SALLE(UNE_ZONE_DE_SALLE);
        return "UNE_ZONE_DE_SALLE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_ZONE_DE_SALLE> getAll() {
        logger.debug("Getting all UNE_ZONE_DE_SALLE.");
        return serv.getAllUNE_ZONE_DE_SALLE();
    }

    @GetMapping(value= "/getbycode/{UNE_ZONE_DE_SALLE-CODE}")
    public Optional<UNE_ZONE_DE_SALLE> getByCODE(@PathVariable(value= "UNE_ZONE_DE_SALLE-CODE") String CODE) {
        logger.debug("Getting UNE_ZONE_DE_SALLE with UNE_ZONE_DE_SALLE-CODE= {}.", CODE);
        return serv.findUNE_ZONE_DE_SALLEByCODE(CODE);
    }


    @PutMapping(value= "/update/{UNE_ZONE_DE_SALLE-CODE}")
    public String update(@PathVariable(value= "UNE_ZONE_DE_SALLE-CODE") String CODE, @RequestBody UNE_ZONE_DE_SALLE e) {
        logger.debug("Updating UNE_ZONE_DE_SALLE with UNE_ZONE_DE_SALLE-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUNE_ZONE_DE_SALLE(e);
        return "UNE_ZONE_DE_SALLE record for UNE_ZONE_DE_SALLE-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_ZONE_DE_SALLE-CODE}")
    public String delete(@PathVariable(value= "UNE_ZONE_DE_SALLE-CODE") String CODE) {
        logger.debug("Deleting UNE_ZONE_DE_SALLE with UNE_ZONE_DE_SALLE-CODE= {}.", CODE);
        serv.deleteUNE_ZONE_DE_SALLEByCODE(CODE);
        return "UNE_ZONE_DE_SALLE record for UNE_ZONE_DE_SALLE-CODE= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_ZONE_DE_SALLE.");
        serv.deleteAllUNE_ZONE_DE_SALLE();
        return "All UNE_ZONE_DE_SALLE records deleted.";
    }


}
