


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
        UN_NIVEAU.get(0).setId(UN_NIVEAU.get(0).getCODE());
        serv.createUN_NIVEAU(UN_NIVEAU);
        return "UN_NIVEAU records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_NIVEAU> getAll() {
        logger.debug("Getting all UN_NIVEAU.");
        return serv.getAllUN_NIVEAU();
    }

    @GetMapping(value= "/getbyid/{UN_NIVEAU-Id}")
    public Optional<UN_NIVEAU> getById(@PathVariable(value= "UN_NIVEAU-Id") String Id) {
        logger.debug("Getting UN_NIVEAU with UN_NIVEAU-Id= {}.", Id);
        return serv.findUN_NIVEAUById(Id);
    }

    @PutMapping(value= "/update/{UN_NIVEAU-Id}")
    public String update(@PathVariable(value= "UN_NIVEAU-Id") String Id,
                         @RequestBody UN_NIVEAU e) {
        logger.debug("Updating UN_NIVEAU with UN_NIVEAU-Id= {}.", Id);
        e.setId(Id);
        serv.updateUN_NIVEAU(e);
        return "UN_NIVEAU record for UN_NIVEAU-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_NIVEAU-Id}")
    public String delete(@PathVariable(value= "UN_NIVEAU-Id") String Id) {
        logger.debug("Deleting UN_NIVEAU with UN_NIVEAU-Id= {}.", Id);
        serv.deleteUN_NIVEAUById(Id);
        return "UN_NIVEAU record for UN_NIVEAU-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_NIVEAU.");
        serv.deleteAllUN_NIVEAU();
        return "All UN_NIVEAU records deleted.";
    }


}
