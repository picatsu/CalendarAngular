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

    @GetMapping(value= "/getbycode/{UNE_RESERVATION-CODE}")
    public Optional<UNE_RESERVATION> getByCODE(@PathVariable(value= "UNE_RESERVATION-CODE") String CODE) {
        logger.debug("Getting UNE_RESERVATION with UNE_RESERVATION-CODE= {}.", CODE);
        return serv.findUNE_RESERVATIONByCODE(CODE);
    }

    @PutMapping(value= "/update/{UNE_RESERVATION-CODE}")
    public String update(@PathVariable(value= "UNE_RESERVATION-CODE") String CODE,
                         @RequestBody UNE_RESERVATION e) {
        logger.debug("Updating UNE_RESERVATION with UNE_RESERVATION-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUNE_RESERVATION(e);
        return "UNE_RESERVATION record for UNE_RESERVATION-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_RESERVATION-CODE}")
    public String delete(@PathVariable(value= "UNE_RESERVATION-CODE") String CODE) {
        logger.debug("Deleting UNE_RESERVATION with UNE_RESERVATION-CODE= {}.", CODE);
        serv.deleteUNE_RESERVATIONByCODE(CODE);
        return "UNE_RESERVATION record for UNE_RESERVATION-CODE= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_RESERVATION.");
        serv.deleteAllUNE_RESERVATION();
        return "All UNE_RESERVATION records deleted.";
    }


}
