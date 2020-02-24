package com.bada.controller;

import com.bada.model.UN_ENSEIGNEMENT;
import com.bada.service.UN_ENSEIGNEMENT_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_ENSEIGNEMENT")
public class UN_ENSEIGNEMENT_controller {

    @Autowired
    UN_ENSEIGNEMENT_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_ENSEIGNEMENT> UN_ENSEIGNEMENT) {
        logger.debug("Saving UN_ENSEIGNEMENT.");
        serv.createUN_ENSEIGNEMENT(UN_ENSEIGNEMENT);
        return "UN_ENSEIGNEMENT records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_ENSEIGNEMENT> getAll() {
        logger.debug("Getting all UN_ENSEIGNEMENT.");
        return serv.getAllUN_ENSEIGNEMENT();
    }

    @GetMapping(value= "/getbyid/{UN_ENSEIGNEMENT-id}")
    public Optional<UN_ENSEIGNEMENT> getById(@PathVariable(value= "UN_ENSEIGNEMENT-id") int id) {
        logger.debug("Getting UN_ENSEIGNEMENT with UN_ENSEIGNEMENT-id= {}.", id);
        return serv.findUN_ENSEIGNEMENTById(id);
    }

    @GetMapping(value= "/getbycode/{UN_ENSEIGNEMENT-CODE}")
    public Optional<UN_ENSEIGNEMENT> getByCODE(@PathVariable(value= "UN_ENSEIGNEMENT-id") String CODE) {
        logger.debug("Getting UN_ENSEIGNEMENT with UN_ENSEIGNEMENT-CODE= {}.", CODE);
        return serv.findUN_ENSEIGNEMENTByCODE(CODE);
    }

    @PutMapping(value= "/update/{UN_ENSEIGNEMENT-id}")
    public String update(@PathVariable(value= "UN_ENSEIGNEMENT-id") int id, @RequestBody UN_ENSEIGNEMENT e) {
        logger.debug("Updating UN_ENSEIGNEMENT with UN_ENSEIGNEMENT-id= {}.", id);
        e.setId(id);
        serv.updateUN_ENSEIGNEMENT(e);
        return "UN_ENSEIGNEMENT record for UN_ENSEIGNEMENT-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_ENSEIGNEMENT-id}")
    public String delete(@PathVariable(value= "UN_ENSEIGNEMENT-id") int id) {
        logger.debug("Deleting UN_ENSEIGNEMENT with UN_ENSEIGNEMENT-id= {}.", id);
        serv.deleteUN_ENSEIGNEMENTById(id);
        return "UN_ENSEIGNEMENT record for UN_ENSEIGNEMENT-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_ENSEIGNEMENT.");
        serv.deleteAllUN_ENSEIGNEMENT();
        return "All UN_ENSEIGNEMENT records deleted.";
    }


}
