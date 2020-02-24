


package com.bada.controller;

import com.bada.model.UN_NIVEAU;
import com.bada.model.UN_NIVEAU;
import com.bada.service.UN_NIVEAU_SERVICE;
import com.bada.service.UN_NIVEAU_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_NIVEAU")
public class UN_NIVEAU_controller {

    @Autowired
    UN_NIVEAU_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_NIVEAU> UN_NIVEAU) {
        logger.debug("Saving UN_NIVEAU.");
        serv.createUN_NIVEAU(UN_NIVEAU);
        return "UN_NIVEAU records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_NIVEAU> getAll() {
        logger.debug("Getting all UN_NIVEAU.");
        return serv.getAllUN_NIVEAU();
    }

    @GetMapping(value= "/getbycode/{UN_NIVEAU-CODE}")
    public Optional<UN_NIVEAU> getByCODE(@PathVariable(value= "UN_NIVEAU-CODE") String CODE) {
        logger.debug("Getting UN_NIVEAU with UN_NIVEAU-CODE= {}.", CODE);
        return serv.findUN_NIVEAUByCODE(CODE);
    }

    @PutMapping(value= "/update/{UN_NIVEAU-CODE}")
    public String update(@PathVariable(value= "UN_NIVEAU-CODE") String CODE,
                         @RequestBody UN_NIVEAU e) {
        logger.debug("Updating UN_NIVEAU with UN_NIVEAU-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUN_NIVEAU(e);
        return "UN_NIVEAU record for UN_NIVEAU-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_NIVEAU-CODE}")
    public String delete(@PathVariable(value= "UN_NIVEAU-CODE") String CODE) {
        logger.debug("Deleting UN_NIVEAU with UN_NIVEAU-CODE= {}.", CODE);
        serv.deleteUN_NIVEAUByCODE(CODE);
        return "UN_NIVEAU record for UN_NIVEAU-CODE= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_NIVEAU.");
        serv.deleteAllUN_NIVEAU();
        return "All UN_NIVEAU records deleted.";
    }


}
