package com.bada.controller;


import com.bada.model.UNE_RESERVATION;
import com.bada.service.UNE_RESERVATION_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UNE_RESERVATION")
public class UNE_RESERVATION_controller {

    @Autowired
    UNE_RESERVATION_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_RESERVATION> UNE_RESERVATION) {
        logger.debug("Saving UNE_RESERVATION.");
        serv.createUNE_RESERVATION(UNE_RESERVATION);
        return "UNE_RESERVATION records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_RESERVATION> getAll() {
        logger.debug("Getting all UNE_RESERVATION.");
        return serv.getAllUNE_RESERVATION();
    }

    @GetMapping(value= "/getbyid/{UNE_RESERVATION-id}")
    public Optional<UNE_RESERVATION> getById(@PathVariable(value= "UNE_RESERVATION-id") int id) {
        logger.debug("Getting UNE_RESERVATION with UNE_RESERVATION-id= {}.", id);
        return serv.findUNE_RESERVATIONById(id);
    }

    @PutMapping(value= "/update/{UNE_RESERVATION-id}")
    public String update(@PathVariable(value= "UNE_RESERVATION-id") int id, @RequestBody UNE_RESERVATION e) {
        logger.debug("Updating UNE_RESERVATION with UNE_RESERVATION-id= {}.", id);
        e.setId(id);
        serv.updateUNE_RESERVATION(e);
        return "UNE_RESERVATION record for UNE_RESERVATION-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_RESERVATION-id}")
    public String delete(@PathVariable(value= "UNE_RESERVATION-id") int id) {
        logger.debug("Deleting UNE_RESERVATION with UNE_RESERVATION-id= {}.", id);
        serv.deleteUNE_RESERVATIONById(id);
        return "UNE_RESERVATION record for UNE_RESERVATION-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_RESERVATION.");
        serv.deleteAllUNE_RESERVATION();
        return "All UNE_RESERVATION records deleted.";
    }


}
