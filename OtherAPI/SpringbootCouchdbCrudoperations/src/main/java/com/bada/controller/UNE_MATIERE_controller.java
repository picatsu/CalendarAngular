package com.bada.controller;


import com.bada.model.UNE_MATIERE;
import com.bada.model.UN_PROFESSEUR;
import com.bada.service.UNE_MATIERE_SERVICE;
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
@RequestMapping(value= "/api/mongo/UNE_MATIERE")
public class UNE_MATIERE_controller {

    @Autowired
    UNE_MATIERE_SERVICE serv;
    @Autowired
    MongoTemplate mongoTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_MATIERE> UNE_MATIERE) {
        logger.debug("Saving UNE_MATIERE.");
        System.out.println("g recu "+UNE_MATIERE.get(0).toString());
        UNE_MATIERE.get(0).setId(UNE_MATIERE.get(0).getCODE());
        serv.createUNE_MATIERE(UNE_MATIERE);
        return "UNE_MATIERE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_MATIERE> getAll() {
        logger.debug("Getting all UNE_MATIERE.");
        return serv.getAllUNE_MATIERE();
    }


    @GetMapping(value= "/getbyid/{UNE_MATIERE-Id}")
    public UNE_MATIERE getById(@PathVariable(value= "UNE_MATIERE-Id") String Id) {
        logger.debug("Getting UNE_MATIERE with UNE_MATIERE-Id= {}.", Id);
        System.out.println(serv.findUNE_MATIEREById(Id));
         // return serv.findUNE_MATIEREById(Id);
        return mongoTemplate.findOne(new Query(where("CODE").is(Id)), UNE_MATIERE.class);

    }

    @PutMapping(value= "/update/{UNE_MATIERE-Id}")
    public String update(@PathVariable(value= "UNE_MATIERE-Id") String Id, @RequestBody UNE_MATIERE e) {
        logger.debug("Updating UNE_MATIERE with UNE_MATIERE-Id= {}.", Id);
        e.setId(Id);
        serv.updateUNE_MATIERE(e);
        return "UNE_MATIERE record for UNE_MATIERE-id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_MATIERE-Id}")
    public String delete(@PathVariable(value= "UNE_MATIERE-Id") String Id) {
        logger.debug("Deleting UNE_MATIERE with UNE_MATIERE-Id= {}.", Id);
        serv.deleteUNE_MATIEREById(Id);
        return "UNE_MATIERE record for UNE_MATIERE-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_MATIERE.");
        serv.deleteAllUNE_MATIERE();
        return "All UNE_MATIERE records deleted.";
    }


}
