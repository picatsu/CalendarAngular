package com.bada.controller;

import com.bada.model.UN_TYPE_ACTIVITE;
import com.bada.service.UN_TYPE_ACTIVITE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value= "/api/mongo/UN_TYPE_ACTIVITE")
public class UN_TYPE_ACTIVITE_controller {


    @Autowired
    UN_TYPE_ACTIVITE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_TYPE_ACTIVITE> UN_TYPE_ACTIVITE) {
        logger.debug("Saving UN_TYPE_ACTIVITE.");
        serv.createUN_TYPE_ACTIVITE(UN_TYPE_ACTIVITE);
        return "UNE_ZONE_DE_SALLE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_TYPE_ACTIVITE> getAll() {
        logger.debug("Getting all UN_TYPE_ACTIVITE.");
        return serv.getAllUN_TYPE_ACTIVITE();
    }

    @GetMapping(value= "/getbycode/{UN_TYPE_ACTIVITE-CODE}")
    public Optional<UN_TYPE_ACTIVITE> getByCODE(@PathVariable(value= "UN_TYPE_ACTIVITE-CODE") String CODE) {
        logger.debug("Getting UN_TYPE_ACTIVITE with UN_TYPE_ACTIVITE-CODE= {}.", CODE);
        return serv.findUN_TYPE_ACTIVITEByCODE(CODE);
    }


    @PutMapping(value= "/update/{UN_TYPE_ACTIVITE-CODE}")
    public String update(@PathVariable(value= "UN_TYPE_ACTIVITE-CODE") String CODE, @RequestBody UN_TYPE_ACTIVITE e) {
        logger.debug("Updating UN_TYPE_ACTIVITE with UN_TYPE_ACTIVITE-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUN_TYPE_ACTIVITE(e);
        return "UN_TYPE_ACTIVITE record for UN_TYPE_ACTIVITE-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_TYPE_ACTIVITE-CODE}")
    public String delete(@PathVariable(value= "UN_TYPE_ACTIVITE-CODE") String CODE) {
        logger.debug("Deleting UN_TYPE_ACTIVITE with UN_TYPE_ACTIVITE-CODE= {}.", CODE);
        serv.deleteUN_TYPE_ACTIVITEByCODE(CODE);
        return "UNE_ZONE_DE_SALLE record for UN_TYPE_ACTIVITE-CODE= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_TYPE_ACTIVITE.");
        serv.deleteAllUN_TYPE_ACTIVITE();
        return "All UN_TYPE_ACTIVITE records deleted.";
    }

}


