package com.bada.controller;

import com.bada.model.LES_PARAMETRES_GENERAUX;
import com.bada.service.LES_PARAMETRES_GENERAUX_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/LES_PARAMETRES_GENERAUX")
public class LES_PARAMETRES_GENERAUX_controller {

    @Autowired
    LES_PARAMETRES_GENERAUX_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<LES_PARAMETRES_GENERAUX> LES_PARAMETRES_GENERAUX) {
        logger.debug("Saving LES_PARAMETRES_GENERAUX.");
        serv.createLES_PARAMETRES_GENERAUX(LES_PARAMETRES_GENERAUX);
        return "LES_PARAMETRES_GENERAUX records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<LES_PARAMETRES_GENERAUX> getAll() {
        logger.debug("Getting all LES_PARAMETRES_GENERAUX.");
        return serv.getAllLES_PARAMETRES_GENERAUX();
    }

    @GetMapping(value= "/getbyid/{LES_PARAMETRES_GENERAUX-id}")
    public Optional<LES_PARAMETRES_GENERAUX> getById(@PathVariable(value= "LES_PARAMETRES_GENERAUX-id") int id) {
        logger.debug("Getting LES_PARAMETRES_GENERAUX with LES_PARAMETRES_GENERAUX-id= {}.", id);
        return serv.findLES_PARAMETRES_GENERAUXById(id);
    }

    @PutMapping(value= "/update/{LES_PARAMETRES_GENERAUX-id}")
    public String update(@PathVariable(value= "LES_PARAMETRES_GENERAUX-id") int id, @RequestBody LES_PARAMETRES_GENERAUX e) {
        logger.debug("Updating LES_PARAMETRES_GENERAUX with LES_PARAMETRES_GENERAUX-id= {}.", id);
        e.setId(id);
        serv.updateLES_PARAMETRES_GENERAUX(e);
        return "LES_PARAMETRES_GENERAUX record for LES_PARAMETRES_GENERAUX-id= " + id + " updated.";
    }

    @DeleteMapping(value= "/delete/{LES_PARAMETRES_GENERAUX-id}")
    public String delete(@PathVariable(value= "LES_PARAMETRES_GENERAUX-id") int id) {
        logger.debug("Deleting LES_PARAMETRES_GENERAUX with LES_PARAMETRES_GENERAUX-id= {}.", id);
        serv.deleteLES_PARAMETRES_GENERAUXById(id);
        return "LES_PARAMETRES_GENERAUX record for LES_PARAMETRES_GENERAUX-id= " + id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all LES_PARAMETRES_GENERAUX.");
        serv.deleteAllLES_PARAMETRES_GENERAUX();
        return "All LES_PARAMETRES_GENERAUX records deleted.";
    }


}
