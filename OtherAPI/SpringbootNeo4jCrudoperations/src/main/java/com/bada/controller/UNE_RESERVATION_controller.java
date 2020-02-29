package com.bada.controller;


import com.bada.model.UNE_RESERVATION;
import com.bada.model.UN_PROFESSEUR;
import com.bada.service.UNE_RESERVATION_SERVICE;
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
@RequestMapping(value= "/api/mongo/UNE_RESERVATION")
public class UNE_RESERVATION_controller {

    @Autowired
    UNE_RESERVATION_SERVICE serv;
    @Autowired
    MongoTemplate mongoTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_RESERVATION> UNE_RESERVATION) {
        logger.debug("Saving UNE_RESERVATION.");
        UNE_RESERVATION.get(0).setId(UNE_RESERVATION.get(0).getCODE());
        serv.createUNE_RESERVATION(UNE_RESERVATION);
        return "UNE_RESERVATION records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_RESERVATION> getAll() {
        logger.debug("Getting all UNE_RESERVATION.");
        return serv.getAllUNE_RESERVATION();
    }

    @GetMapping(value= "/getbyid/{UNE_RESERVATION-Id}")
    public UNE_RESERVATION getById(@PathVariable(value= "UNE_RESERVATION-Id") String Id) {
        logger.debug("Getting UNE_RESERVATION with UNE_RESERVATION-Id= {}.", Id);
        //return serv.findUNE_RESERVATIONById(Id);
        return mongoTemplate.findOne(new Query(where("CODE").is(Id)), UNE_RESERVATION.class);

    }

    @PutMapping(value= "/update/{UNE_RESERVATION-Id}")
    public String update(@PathVariable(value= "UNE_RESERVATION-Id") String Id,
                         @RequestBody UNE_RESERVATION e) {
        logger.debug("Updating UNE_RESERVATION with UNE_RESERVATION-Id= {}.", Id);
        e.setId(Id);
        serv.updateUNE_RESERVATION(e);
        return "UNE_RESERVATION record for UNE_RESERVATION-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_RESERVATION-Id}")
    public String delete(@PathVariable(value= "UNE_RESERVATION-Id") String Id) {
        logger.debug("Deleting UNE_RESERVATION with UNE_RESERVATION-Id= {}.", Id);
        serv.deleteUNE_RESERVATIONById(Id);
        return "UNE_RESERVATION record for UNE_RESERVATION-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_RESERVATION.");
        serv.deleteAllUNE_RESERVATION();
        return "All UNE_RESERVATION records deleted.";
    }


}
