package com.bada.controller;


import com.bada.model.UNE_PERIODE;
import com.bada.service.UNE_PERIODE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UNE_PERIODE")
public class UNE_PERIODE_controller {

    @Autowired
    UNE_PERIODE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_PERIODE> UNE_PERIODE) {
        logger.debug("Saving UNE_PERIODE.");
        serv.createUNE_PERIODE(UNE_PERIODE);
        return "UNE_PERIODE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_PERIODE> getAll() {
        logger.debug("Getting all UNE_PERIODE.");
        return serv.getAllUNE_PERIODE();
    }

    @GetMapping(value= "/getbyid/{UNE_PERIODE-id}")
    public Optional<UNE_PERIODE> getById(@PathVariable(value= "UNE_PERIODE-id") int id) {
        logger.debug("Getting UNE_PERIODE with UNE_PERIODE-id= {}.", id);
        return serv.findUNE_PERIODEById(id);
    }

    @PutMapping(value= "/update/{UNE_PERIODE-id}")
    public String update(@PathVariable(value= "UNE_PERIODE-id") int id, @RequestBody UNE_PERIODE e) {
        logger.debug("Updating UNE_PERIODE with UNE_PERIODE-id= {}.", id);
        e.setId(id);
        serv.updateUNE_PERIODE(e);
        return "UNE_PERIODE record for UNE_PERIODE-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_PERIODE-id}")
    public String delete(@PathVariable(value= "UNE_PERIODE-id") int id) {
        logger.debug("Deleting UNE_PERIODE with UNE_PERIODE-id= {}.", id);
        serv.deleteUNE_PERIODEById(id);
        return "UNE_PERIODE record for UNE_PERIODE-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_PERIODE.");
        serv.deleteAllUNE_PERIODE();
        return "All UNE_PERIODE records deleted.";
    }


}
