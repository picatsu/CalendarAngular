package com.bada.controller;


import com.bada.model.UNE_COMPOSANTE;
import com.bada.service.UNE_COMPOSANTE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/UNE_COMPOSANTE")
public class UNE_COMPOSANTE_controller {

    @Autowired
    UNE_COMPOSANTE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value= "/create")
    public String create(@RequestBody List<UNE_COMPOSANTE> UNE_COMPOSANTE) {
        logger.debug("Saving UNE_COMPOSANTE.");
        serv.createUNE_COMPOSANTE(UNE_COMPOSANTE);
        return "UNE_COMPOSANTE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<UNE_COMPOSANTE> getAll() {
        logger.debug("Getting all UNE_COMPOSANTE.");
        return serv.getAllUNE_COMPOSANTE();
    }


    @GetMapping(value= "/getbycode/{UNE_COMPOSANTE-CODE}")
    public Optional<UNE_COMPOSANTE> getByCODE(@PathVariable(value= "UNE_COMPOSANTE-CODE") String CODE) {
        logger.debug("Getting UNE_COMPOSANTE with UNE_COMPOSANTE-CODE= {}.", CODE);
        return serv.findUNE_COMPOSANTEByCODE(CODE);
    }

    @PutMapping(value= "/update/{UNE_COMPOSANTE-CODE}")
    public String update(@PathVariable(value= "UNE_COMPOSANTE-CODE") String CODE,
                         @RequestBody UNE_COMPOSANTE e) {
        logger.debug("Updating UNE_COMPOSANTE with UNE_COMPOSANTE-CODE= {}.", CODE);
        e.setCODE(CODE);
        serv.updateUNE_COMPOSANTE(e);
        return "UNE_COMPOSANTE record for UNE_COMPOSANTE-CODE= " + CODE + " updated.";
    }

    @DeleteMapping(value= "/delete/{UNE_COMPOSANTE-CODE}")
    public String delete(@PathVariable(value= "UNE_COMPOSANTE-CODE") String CODE) {
        logger.debug("Deleting UNE_COMPOSANTE with UNE_COMPOSANTE-CODE= {}.", CODE);
        serv.deleteUNE_COMPOSANTEByCODE(CODE);
        return "UNE_COMPOSANTE record for UNE_COMPOSANTE-CODE= " + CODE + " deleted.";
    }

    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all UNE_COMPOSANTE.");
        serv.deleteAllUNE_COMPOSANTE();
        return "All UNE_COMPOSANTE records deleted.";
    }


}
