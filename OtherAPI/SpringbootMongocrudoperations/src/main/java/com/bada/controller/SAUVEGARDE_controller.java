package com.bada.controller;


import com.bada.model.SAUVEGARDE;
import com.bada.service.SAUVEGARDE_SERVICE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value= "/api/mongo/SAUVEGARDE")
public class SAUVEGARDE_controller {

    @Autowired
    SAUVEGARDE_SERVICE serv;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @PostMapping(value= "/create")
    public String create(@RequestBody List<SAUVEGARDE> SAUVEGARDE) {
        logger.debug("Saving SAUVEGARDE.");
        serv.createSAUVEGARDE(SAUVEGARDE);
        return "SAUVEGARDE records created.";
    }

    @GetMapping(value= "/getall")
    public Collection<SAUVEGARDE> getAll() {
        logger.debug("Getting all SAUVEGARDE.");
        return serv.getAllSAUVEGARDE();
    }


    @DeleteMapping(value= "/deleteall")
    public String deleteAll() {
        logger.debug("Deleting all SAUVEGARDE.");
        serv.deleteAllSAUVEGARDES();
        return "All SAUVEGARDE records deleted.";
    }



    @GetMapping(value= "/getbyDATE/{SAUVEGARDE-DATE}")
    public Optional<SAUVEGARDE> getByDATE(@PathVariable(value= "SAUVEGARDE-DATE") String DATE) {
        logger.debug("Getting SAUVEGARDE with SAUVEGARDE-DATE= {}.", DATE);
        return serv.findSAUVEGARDEByDATE(DATE);
    }

    @PutMapping(value= "/update/{SAUVEGARDE-DATE}")
    public String update(@PathVariable(value= "SAUVEGARDE-DATE") String DATE, @RequestBody SAUVEGARDE e) {
        logger.debug("Updating SAUVEGARDE with SAUVEGARDE-DATE= {}.", DATE);
        e.setDATE(DATE);
        serv.updateSAUVEGARDE(e);
        return "SAUVEGARDE record for SAUVEGARDE-DATE= " + DATE + " updated.";
    }

    @DeleteMapping(value= "/delete/{SAUVEGARDE-DATE}")
    public String delete(@PathVariable(value= "SAUVEGARDE-DATE") String DATE) {
        logger.debug("Deleting SAUVEGARDE with SAUVEGARDE-DATE= {}.", DATE);
        serv.deleteSAUVEGARDEByDATE(DATE);
        return "SAUVEGARDE record for SAUVEGARDE-DATE= " + DATE + " deleted.";
    }




    @GetMapping(value= "/getbyUTILISATEUR/{SAUVEGARDE-UTILISATEUR}")
    public Optional<SAUVEGARDE> getByUTILISATEUR(@PathVariable(value= "SAUVEGARDE-UTILISATEUR") String UTILISATEUR) {
        logger.debug("Getting SAUVEGARDE with SAUVEGARDE-UTILISATEUR= {}.", UTILISATEUR);
        return serv.findSAUVEGARDEByUTILISATEUR(UTILISATEUR);
    }

    @PutMapping(value= "/update/{SAUVEGARDE-UTILISATEUR}")
    public String updateByUTILISATEUR(@PathVariable(value= "SAUVEGARDE-UTILISATEUR") String UTILISATEUR, @RequestBody SAUVEGARDE e) {
        logger.debug("Updating SAUVEGARDE with SAUVEGARDE-UTILISATEUR= {}.", UTILISATEUR);
        e.setUTILISATEUR(UTILISATEUR);
        serv.updateSAUVEGARDE(e);
        return "SAUVEGARDE record for SAUVEGARDE-UTILISATEUR= " + UTILISATEUR + " updated.";
    }

    @DeleteMapping(value= "/delete/{SAUVEGARDE-UTILISATEUR}")
    public String deleteByUTILISATEUR(@PathVariable(value= "SAUVEGARDE-UTILISATEUR") String UTILISATEUR) {
        logger.debug("Deleting SAUVEGARDE with SAUVEGARDE-UTILISATEUR= {}.", UTILISATEUR);
        serv.deleteSAUVEGARDEByUTILISATEUR(UTILISATEUR);
        return "SAUVEGARDE record for SAUVEGARDE-UTILISATEUR= " + UTILISATEUR + " deleted.";
    }


}
