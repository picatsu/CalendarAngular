package com.bada.controller;


import com.bada.model.UN_PROFESSEUR;
import com.bada.service.UN_PROFESSEUR_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_PROFESSEUR")
public class UN_PROFESSEUR_controller {

    @Autowired
    UN_PROFESSEUR_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_PROFESSEUR> UN_PROFESSEUR) {
        logger.debug("Saving UN_PROFESSEUR.");
        serv.createUN_PROFESSEUR(UN_PROFESSEUR);
        return "UN_PROFESSEUR records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_PROFESSEUR> getAll() {
        logger.debug("Getting all UN_PROFESSEUR.");
        return serv.getAllUN_PROFESSEUR();
    }

    @GetMapping(value= "/getbycode/{UN_PROFESSEUR-CODE}")
    public Optional<UN_PROFESSEUR> getByCODE(@PathVariable(value= "UN_PROFESSEUR-CODE") String CODE) {
        logger.debug("Getting UN_PROFESSEUR with UN_PROFESSEUR-CODE= {}.", CODE);
        return serv.findUN_PROFESSEURByCODE(CODE);
    }

    @PutMapping(value= "/update/{UN_PROFESSEUR-CODE}")
    public String update(@PathVariable(value= "UN_PROFESSEUR-CODE") String CODE,
                         @RequestBody UN_PROFESSEUR e) {
        logger.debug("Updating UN_PROFESSEUR with UN_PROFESSEUR-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUN_PROFESSEUR(e);
        return "UN_PROFESSEUR record for UN_PROFESSEUR-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_PROFESSEUR-CODE}")
    public String delete(@PathVariable(value= "UN_PROFESSEUR-CODE") String CODE) {
        logger.debug("Deleting UN_PROFESSEUR with UN_PROFESSEUR-CODE= {}.", CODE);
        serv.deleteUN_PROFESSEURByCODE(CODE);
        return "UN_PROFESSEUR record for UN_PROFESSEUR-CODE= " +CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_PROFESSEUR.");
        serv.deleteAllUN_PROFESSEUR();
        return "All UN_PROFESSEUR records deleted.";
    }


}
