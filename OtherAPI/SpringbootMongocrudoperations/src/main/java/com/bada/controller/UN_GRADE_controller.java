package com.bada.controller;

import com.bada.model.UN_GRADE;
import com.bada.model.UN_PROFESSEUR;
import com.bada.service.UN_GRADE_SERVICE;
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
@RequestMapping(value= "/api/mongo/UN_GRADE")
public class UN_GRADE_controller {

    @Autowired
    UN_GRADE_SERVICE serv;
    @Autowired
    MongoTemplate mongoTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_GRADE> UN_GRADE) {
        logger.debug("Saving UN_GRADE.");
        UN_GRADE.get(0).setId(UN_GRADE.get(0).getCODE());
        serv.createUN_GRADE(UN_GRADE);
        return "UN_GRADE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_GRADE> getAll() {
        logger.debug("Getting all UN_GRADE.");
        return serv.getAllUN_GRADE();
    }


    @GetMapping(value= "/getbyid/{UN_GRADE-Id}")
    public UN_GRADE getById(@PathVariable(value= "UN_GRADE-Id") String Id) {
        logger.debug("Getting UN_GRADE with UN_GRADE-Id= {}.", Id);
         //return serv.findUN_GRADEById(Id);
        return mongoTemplate.findOne(new Query(where("CODE").is(Id)), UN_GRADE.class);

    }

    @PutMapping(value= "/update/{UN_GRADE-Id}")
    public String update(@PathVariable(value= "UN_GRADE-Id") String Id,
                         @RequestBody UN_GRADE e) {
        logger.debug("Updating UN_GRADE with UN_GRADE-Id= {}.", Id);
        e.setId(Id);
        serv.updateUN_GRADE(e);
        return "UN_GRADE record for UN_GRADE-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_GRADE-Id}")
    public String delete(@PathVariable(value= "UN_GRADE-Id") String Id) {
        logger.debug("Deleting UN_GRADE with UN_GRADE-Id= {}.", Id);
        serv.deleteUN_GRADEById(Id);
        return "UN_GRADE record for UN_GRADE-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_GRADE.");
        serv.deleteAllUN_GRADE();
        return "All UN_GRADE records deleted.";
    }


}

