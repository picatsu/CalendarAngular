package com.bada.controller;


import com.bada.model.UN_GROUPES;
import com.bada.service.UN_GROUPES_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_GROUPES")
public class UN_GROUPES_controller {

    @Autowired
    UN_GROUPES_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_GROUPES> UN_GROUPES) {
        logger.debug("Saving UN_GROUPES.");
        serv.createUN_GROUPES(UN_GROUPES);
        return "UN_GROUPES records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_GROUPES> getAll() {
        logger.debug("Getting all UN_GROUPES.");
        return serv.getAllUN_GROUPES();
    }


    @GetMapping(value= "/getbycode/{UN_GROUPES-CODE}")
    public Optional<UN_GROUPES> getByCODE(@PathVariable(value= "UN_GROUPES-CODE") String CODE) {
        logger.debug("Getting UN_GROUPES with UN_GROUPES-CODE= {}.", CODE);
        return serv.findUN_GROUPESByCODE(CODE);
    }

    @PutMapping(value= "/update/{UN_GROUPES-CODE}")
    public String update(@PathVariable(value= "UN_GROUPES-CODE") String CODE,
                         @RequestBody UN_GROUPES e) {
        logger.debug("Updating UN_GROUPES with UN_GROUPES-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUN_GROUPES(e);
        return "UN_GROUPES record for UN_GROUPES-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_GROUPES-CODE}")
    public String delete(@PathVariable(value= "UN_GROUPES-CODE") String CODE) {
        logger.debug("Deleting UN_GROUPES with UN_GROUPES-CODE= {}.", CODE);
        serv.deleteUN_GROUPESByCODE(CODE);
        return "UN_GROUPES record for UN_GROUPES-CODE= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_GROUPES.");
        serv.deleteAllUN_GROUPES();
        return "All UN_GROUPES records deleted.";
    }


}

