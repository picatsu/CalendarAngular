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
        UN_TYPE_ACTIVITE.get(0).setId(UN_TYPE_ACTIVITE.get(0).getCODE());
        serv.createUN_TYPE_ACTIVITE(UN_TYPE_ACTIVITE);
        return "UNE_ZONE_DE_SALLE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_TYPE_ACTIVITE> getAll() {
        logger.debug("Getting all UN_TYPE_ACTIVITE.");
        return serv.getAllUN_TYPE_ACTIVITE();
    }

    @GetMapping(value= "/getbyid/{UN_TYPE_ACTIVITE-Id}")
    public Optional<UN_TYPE_ACTIVITE> getById(@PathVariable(value= "UN_TYPE_ACTIVITE-Id") String Id) {
        logger.debug("Getting UN_TYPE_ACTIVITE with UN_TYPE_ACTIVITE-Id= {}.", Id);
        return serv.findUN_TYPE_ACTIVITEById(Id);
    }


    @PutMapping(value= "/update/{UN_TYPE_ACTIVITE-Id}")
    public String update(@PathVariable(value= "UN_TYPE_ACTIVITE-Id") String Id, @RequestBody UN_TYPE_ACTIVITE e) {
        logger.debug("Updating UN_TYPE_ACTIVITE with UN_TYPE_ACTIVITE-Id= {}.", Id);
        e.setId(Id);
        serv.updateUN_TYPE_ACTIVITE(e);
        return "UN_TYPE_ACTIVITE record for UN_TYPE_ACTIVITE-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_TYPE_ACTIVITE-Id}")
    public String delete(@PathVariable(value= "UN_TYPE_ACTIVITE-Id") String Id) {
        logger.debug("Deleting UN_TYPE_ACTIVITE with UN_TYPE_ACTIVITE-Id= {}.", Id);
        serv.deleteUN_TYPE_ACTIVITEById(Id);
        return "UNE_ZONE_DE_SALLE record for UN_TYPE_ACTIVITE-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_TYPE_ACTIVITE.");
        serv.deleteAllUN_TYPE_ACTIVITE();
        return "All UN_TYPE_ACTIVITE records deleted.";
    }

}


