package com.bada.controller;

import com.bada.model.UN_CNU;
import com.bada.service.UN_CNU_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UN_CNU")
public class UN_CNU_controller {

    @Autowired
    UN_CNU_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UN_CNU> UN_CNU) {
        logger.debug("Saving UN_CNU.");
        UN_CNU.get(0).setId(UN_CNU.get(0).getCODE());
        serv.createUN_CNU(UN_CNU);
        return "UN_CNU records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UN_CNU> getAll() {
        logger.debug("Getting all UN_CNU.");
        return serv.getAllUN_CNU();
    }



    @GetMapping(value= "/getbyid/{UN_CNU-id}")
    public Optional<UN_CNU> getById(@PathVariable(value= "UN_CNU-id") String id) {
        logger.debug("Getting UN_CNU with UN_CNU-Id= {}.", id);
        return serv.findUN_CNUById(id);
    }

    @PutMapping(value= "/update/{UN_CNU-Id}")
    public String update(@PathVariable(value= "UN_CNU-Id") String Id, @RequestBody UN_CNU e) {
        logger.debug("Updating UN_CNU with UN_CNU-Id= {}.", Id);
        e.setId(Id);
        serv.updateUN_CNU(e);
        return "UN_CNU record for UN_CNU-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UN_CNU-Id}")
    public String delete(@PathVariable(value= "UN_CNU-Id") String Id) {
        logger.debug("Deleting UN_CNU with UN_CNU-Id= {}.", Id);
        serv.deleteUN_CNUById(Id);
        return "UN_CNU record for UN_CNU-id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UN_CNU.");
        serv.deleteAllUN_CNU();
        return "All UN_CNU records deleted.";
    }


}
