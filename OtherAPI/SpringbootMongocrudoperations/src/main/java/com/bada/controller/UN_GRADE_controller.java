package com.bada.controller;

import com.bada.model.UN_GRADE;
import com.bada.service.UN_GRADE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_GRADE")
public class UN_GRADE_controller {

    @Autowired
    UN_GRADE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_GRADE> UN_GRADE) {
        logger.debug("Saving UN_GRADE.");
        serv.createUN_GRADE(UN_GRADE);
        return "UN_GRADE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_GRADE> getAll() {
        logger.debug("Getting all UN_GRADE.");
        return serv.getAllUN_GRADE();
    }

    @GetMapping(value= "/getbyid/{UN_GRADE-id}")
    public Optional<UN_GRADE> getById(@PathVariable(value= "UN_GRADE-id") int id) {
        logger.debug("Getting UN_GRADE with UN_GRADE-id= {}.", id);
        return serv.findUN_GRADEById(id);
    }

    @GetMapping(value= "/getbycode/{UN_GRADE-CODE}")
    public Optional<UN_GRADE> getByCODE(@PathVariable(value= "UN_GRADE-CODE") String CODE) {
        logger.debug("Getting UN_GRADE with UN_GRADE-CODE= {}.", CODE);
        return serv.findUN_GRADEByCODE(CODE);
    }

    @PutMapping(value= "/update/{UN_GRADE-id}")
    public String update(@PathVariable(value= "UN_GRADE-id") int id, @RequestBody UN_GRADE e) {
        logger.debug("Updating UN_GRADE with UN_GRADE-id= {}.", id);
        e.setId(id);
        serv.updateUN_GRADE(e);
        return "UN_GRADE record for UN_GRADE-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_GRADE-id}")
    public String delete(@PathVariable(value= "UN_GRADE-id") int id) {
        logger.debug("Deleting UN_GRADE with UN_GRADE-id= {}.", id);
        serv.deleteUN_GRADEById(id);
        return "UN_GRADE record for UN_GRADE-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_GRADE.");
        serv.deleteAllUN_GRADE();
        return "All UN_GRADE records deleted.";
    }


}

