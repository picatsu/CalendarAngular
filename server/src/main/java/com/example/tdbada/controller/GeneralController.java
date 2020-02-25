package com.example.tdbada.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;


@Controller("generalcontroller")
@RequestMapping(value = "/api/")
public class GeneralController {

    @Autowired
    private RestTemplate rest;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Map<String, String> urlMap;

    @GetMapping("/getall")
    // http://localhost:9090/api/getall?tableName=SAUVEGARDE&dbName=mongo
    public Object getAllDb(@RequestParam(required = false) String tableName,
                           @RequestParam(required = false) String dbName) throws Exception {
        String lien = "/api/"+dbName+"/"+tableName+"/getall";
        System.out.println(" map : "+ this.urlMap);
        return  new ResponseEntity<>( rest.getForObject(urlMap.get(dbName)+lien, Object.class), HttpStatus.OK);
    }

    @GetMapping("/getbyid")
    @CrossOrigin
    // http://localhost:9090/api/getbyid?tableName=LES_PARAMETRES_GENERAUX&dbName=mongo&id=0
    public Object getById(@RequestParam(required = false) String tableName,
                           @RequestParam(required = false) String dbName,
                           @RequestParam(required = false) int id) throws Exception {
        String lien = "/api/"+dbName+"/"+tableName+"/getbyid/"+id;
        return  new ResponseEntity<>( rest.getForObject(urlMap.get(dbName)+lien, Object.class), HttpStatus.OK);
    }

    @GetMapping("/getbycode")
    @CrossOrigin
    // http://localhost:9090/api/getbyid?tableName=LES_PARAMETRES_GENERAUX&dbName=mongo&id=0
    public Object getByCode(@RequestParam(required = false) String tableName,
                          @RequestParam(required = false) String dbName,
                            @RequestParam(required = false) String code) throws Exception {
        String lien = "/api/"+dbName+"/"+tableName+"/getbycode/"+code;
        return  new ResponseEntity<>( rest.getForObject(urlMap.get(dbName)+lien, Object.class), HttpStatus.OK);
    }


    @PutMapping(value= "/update/{code}")
    public Object update(@RequestParam(required = false) String tableName,
                         @RequestParam(required = false) String dbName,
                         @RequestParam(required = false) String code, @RequestBody Object e) {
        logger.debug("Updating UN_CNU with CODE= {}.", e);
        String lien = "/api/"+dbName+"/"+tableName+"/update/"+code;
        rest.put(urlMap.get(dbName)+lien, Object.class, e );
        return new ResponseEntity<>( "put sucessfull", HttpStatus.OK);
    }


    @DeleteMapping(value= "/delete/{code}")
    public ResponseEntity<String> delete(@RequestParam(required = false) String tableName,
                         @RequestParam(required = false) String dbName,
                         @RequestParam(required = false) String code, String CODE) {
        logger.debug("Deleting UN_CNU with CODE= {}.", CODE);
        String lien = "/api/"+dbName+"/"+tableName+"/delete/"+code;
        rest.delete(urlMap.get(dbName)+lien, Object.class, CODE );
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }

    @DeleteMapping(value= "/deleteall")
    public ResponseEntity<String> deleteAll(@RequestParam(required = false) String tableName,
                                            @RequestParam(required = false) String dbName) {
        logger.debug("Deleting all ");
        String lien = "/api/"+dbName+"/"+tableName+"/deleteall";
        rest.delete(urlMap.get(dbName)+lien, Object.class );
        return new ResponseEntity<String>( "delete", HttpStatus.OK);
    }
}
