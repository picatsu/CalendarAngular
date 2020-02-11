package com.bada.controller;

import com.bada.model.UN_ETUDIANT;
import com.bada.service.UN_ETUDIANT_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_ETUDIANT")
public class UN_ETUDIANT_controller {

    @Autowired
    UN_ETUDIANT_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_ETUDIANT> UN_ETUDIANT) {
        logger.debug("Saving UN_ETUDIANT.");
        serv.createUN_ETUDIANT(UN_ETUDIANT);
        return "UN_ETUDIANT records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_ETUDIANT> getAll() {
        logger.debug("Getting all UN_ETUDIANT.");
        return serv.getAllUN_ETUDIANT();
    }

    @GetMapping(value= "/getbyid/{UN_ETUDIANT-id}")
    public Optional<UN_ETUDIANT> getById(@PathVariable(value= "UN_ETUDIANT-id") int id) {
        logger.debug("Getting UN_ETUDIANT with UN_ETUDIANT-id= {}.", id);
        return serv.findUN_ETUDIANTById(id);
    }

    @PutMapping(value= "/update/{UN_ETUDIANT-id}")
    public String update(@PathVariable(value= "UN_ETUDIANT-id") int id, @RequestBody UN_ETUDIANT e) {
        logger.debug("Updating UN_ETUDIANT with UN_ETUDIANT-id= {}.", id);
        e.setId(id);
        serv.updateUN_ETUDIANT(e);
        return "UN_ETUDIANT record for UN_ETUDIANT-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_ETUDIANT-id}")
    public String delete(@PathVariable(value= "UN_ETUDIANT-id") int id) {
        logger.debug("Deleting UN_ETUDIANT with UN_ETUDIANT-id= {}.", id);
        serv.deleteUN_ETUDIANTById(id);
        return "UN_ETUDIANT record for UN_ETUDIANT-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_ETUDIANT.");
        serv.deleteAllUN_ETUDIANT();
        return "All UN_ETUDIANT records deleted.";
    }


}