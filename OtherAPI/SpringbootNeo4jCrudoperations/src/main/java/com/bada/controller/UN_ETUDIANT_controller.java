package com.bada.controller;

import com.bada.model.UNE_SALLE;
import com.bada.model.UN_ENSEIGNEMENT;
import com.bada.model.UN_ETUDIANT;
import com.bada.service.UN_ETUDIANT_SERVICE;
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
@RequestMapping(value= "/api/mongo/UN_ETUDIANT")
public class UN_ETUDIANT_controller {

    @Autowired
    UN_ETUDIANT_SERVICE serv;

    @Autowired
    MongoTemplate mongoTemplate;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_ETUDIANT> UN_ETUDIANT) {
        logger.debug("Saving UN_ETUDIANT.");
        UN_ETUDIANT.get(0).setId(UN_ETUDIANT.get(0).getCODE());
        serv.createUN_ETUDIANT(UN_ETUDIANT);
        return "UN_ETUDIANT records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_ETUDIANT> getAll() {
        logger.debug("Getting all UN_ETUDIANT.");
        return serv.getAllUN_ETUDIANT();
    }



    @GetMapping(value= "/getbyid/{UN_ETUDIANT-Id}")
    public UN_ETUDIANT getById(@PathVariable(value= "UN_ETUDIANT-Id") String Id) {
        logger.debug("Getting UN_ETUDIANT with UN_ETUDIANT-Id= {}.", Id);

        return mongoTemplate.findOne(new Query(where("CODE").is(Id)), UN_ETUDIANT.class);
    }

    @PutMapping(value= "/update/{UN_ETUDIANT-Id}")
    public String update(@PathVariable(value= "UN_ETUDIANT-Id") String Id,
                         @RequestBody UN_ETUDIANT e) {
        logger.debug("Updating UN_ETUDIANT with UN_ETUDIANT-Id= {}.", Id);
        e.setId(Id);
        serv.updateUN_ETUDIANT(e);
        return "UN_ETUDIANT record for UN_ETUDIANT-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_ETUDIANT-Id}")
    public String delete(@PathVariable(value= "UN_ETUDIANT-Id") String Id) {
        logger.debug("Deleting UN_ETUDIANT with UN_ETUDIANT-Id= {}.", Id);
        serv.deleteUN_ETUDIANTById(Id);
        return "UN_ETUDIANT record for UN_ETUDIANT-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_ETUDIANT.");
        serv.deleteAllUN_ETUDIANT();
        return "All UN_ETUDIANT records deleted.";
    }


}
