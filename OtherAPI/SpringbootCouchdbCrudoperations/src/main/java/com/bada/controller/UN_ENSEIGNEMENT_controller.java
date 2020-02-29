package com.bada.controller;

import com.bada.model.UN_ENSEIGNEMENT;
import com.bada.model.UN_PROFESSEUR;
import com.bada.service.UN_ENSEIGNEMENT_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@RestController
@RequestMapping(value= "/api/mongo/UN_ENSEIGNEMENT")
public class UN_ENSEIGNEMENT_controller {

    @Autowired
    UN_ENSEIGNEMENT_SERVICE serv;
    @Autowired
    MongoTemplate mongoTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_ENSEIGNEMENT> UN_ENSEIGNEMENT) {
        logger.debug("Saving UN_ENSEIGNEMENT.");
        UN_ENSEIGNEMENT.get(0).setId(UN_ENSEIGNEMENT.get(0).getCODE());
        serv.createUN_ENSEIGNEMENT(UN_ENSEIGNEMENT);
        return "UN_ENSEIGNEMENT records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_ENSEIGNEMENT> getAll() {
        logger.debug("Getting all UN_ENSEIGNEMENT.");
        return serv.getAllUN_ENSEIGNEMENT();
    }


    @GetMapping(value= "/getbyid/{UN_ENSEIGNEMENT-Id}")
    public UN_ENSEIGNEMENT getById(@PathVariable(value= "UN_ENSEIGNEMENT-Id") String Id) {
        logger.debug("Getting UN_ENSEIGNEMENT with UN_ENSEIGNEMENT-Id= {}.", Id);
         //return serv.findUN_ENSEIGNEMENTById(Id);
        return mongoTemplate.findOne(new Query(where("CODE").is(Id)), UN_ENSEIGNEMENT.class);

    }

    @PutMapping(value= "/update/{UN_ENSEIGNEMENT-Id}")
    public String update(@PathVariable(value= "UN_ENSEIGNEMENT-Id") String Id,
                         @RequestBody UN_ENSEIGNEMENT e) {
        logger.debug("Updating UN_ENSEIGNEMENT with UN_ENSEIGNEMENT-Id= {}.", Id);
        e.setId(Id);
        serv.updateUN_ENSEIGNEMENT(e);
        return "UN_ENSEIGNEMENT record for UN_ENSEIGNEMENT-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_ENSEIGNEMENT-Id}")
    public String delete(@PathVariable(value= "UN_ENSEIGNEMENT-Id") String Id) {
        logger.debug("Deleting UN_ENSEIGNEMENT with UN_ENSEIGNEMENT-Id= {}.", Id);
        serv.deleteUN_ENSEIGNEMENTById(Id);
        return "UN_ENSEIGNEMENT record for UN_ENSEIGNEMENT-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_ENSEIGNEMENT.");
        serv.deleteAllUN_ENSEIGNEMENT();
        return "All UN_ENSEIGNEMENT records deleted.";
    }


}
