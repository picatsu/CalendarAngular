package com.bada.controller;


import com.bada.model.UNE_COMPOSANTE;
import com.bada.model.UN_CNU;
import com.bada.service.UNE_COMPOSANTE_SERVICE;
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
@RequestMapping(value= "/api/mongo/UNE_COMPOSANTE")
public class UNE_COMPOSANTE_controller {

    @Autowired
    UNE_COMPOSANTE_SERVICE serv;
    @Autowired
    MongoTemplate mongoTemplate;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_COMPOSANTE> UNE_COMPOSANTE) {
        logger.debug("Saving UNE_COMPOSANTE.");
        UNE_COMPOSANTE.get(0).setId(UNE_COMPOSANTE.get(0).getCODE());
        serv.createUNE_COMPOSANTE(UNE_COMPOSANTE);
        return "UNE_COMPOSANTE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_COMPOSANTE> getAll() {
        logger.debug("Getting all UNE_COMPOSANTE.");
        return serv.getAllUNE_COMPOSANTE();
    }


    @GetMapping(value= "/getbyid/{UNE_COMPOSANTE-Id}")
    public UNE_COMPOSANTE getById(@PathVariable(value= "UNE_COMPOSANTE-Id") String Id) {
        logger.debug("Getting UNE_COMPOSANTE with UNE_COMPOSANTE-Id= {}.", Id);
       // return serv.findUNE_COMPOSANTEById(Id);
        return mongoTemplate.findOne(new Query(where("CODE").is(Id)), UNE_COMPOSANTE.class);
    }

    @PutMapping(value= "/update/{UNE_COMPOSANTE-Id}")
    public String update(@PathVariable(value= "UNE_COMPOSANTE-Id") String Id,
                         @RequestBody UNE_COMPOSANTE e) {
        logger.debug("Updating UNE_COMPOSANTE with UNE_COMPOSANTE-Id= {}.", Id);
        e.setId(Id);
        serv.updateUNE_COMPOSANTE(e);
        return "UNE_COMPOSANTE record for UNE_COMPOSANTE-Id= " + Id + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_COMPOSANTE-Id}")
    public String delete(@PathVariable(value= "UNE_COMPOSANTE-Id") String Id) {
        logger.debug("Deleting UNE_COMPOSANTE with UNE_COMPOSANTE-CODE= {}.", Id);
        serv.deleteUNE_COMPOSANTEById(Id);
        return "UNE_COMPOSANTE record for UNE_COMPOSANTE-Id= " + Id + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_COMPOSANTE.");
        serv.deleteAllUNE_COMPOSANTE();
        return "All UNE_COMPOSANTE records deleted.";
    }


}
