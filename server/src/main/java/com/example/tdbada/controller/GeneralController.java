package com.example.tdbada.controller;

import com.example.tdbada.model.List_UNGROUPES;
import com.example.tdbada.model.UNE_SEANCE;
import com.example.tdbada.model.UN_GROUPES;
import javafx.scene.control.Tab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;


@Controller("generalcontroller")
@RequestMapping(value = "/api/")
public class GeneralController {

    @Autowired
    private RestTemplate rest;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Map<String, String> urlMap;

    @GetMapping("/getall")
    @CrossOrigin
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

    @PostMapping(value= "/create")
    @CrossOrigin
    public Object create(@RequestParam(required = true) String tableName,
                         @RequestParam(required = true) String dbName,
                         @RequestBody Object e) throws URISyntaxException {
        logger.debug("Updating with CODE= {}.", e);
        String lien = "/api/"+dbName+"/"+tableName+"/create";

        //rest.postForEntity(urlMap.get(dbName)+lien, request.getBody() , Object.class);

        URI uri = new URI(urlMap.get(dbName)+lien);

        ResponseEntity<String> result = rest.postForEntity(uri, e, String.class);
        System.out.println(urlMap.get(dbName)+lien + " aaaaand "+result);

        return new ResponseEntity<>( "post sucessfull", HttpStatus.OK);
    }

    @PutMapping(value= "/update/{code}")
    @CrossOrigin
    public Object update(@RequestParam(required = false) String tableName,
                         @RequestParam(required = false) String dbName,
                         @RequestParam(required = false) String code, @RequestBody Object e) {
        logger.debug("Updating UN_CNU with CODE= {}.", e);
        String lien = "/api/"+dbName+"/"+tableName+"/update/"+code;
        rest.put(urlMap.get(dbName)+lien, Object.class, e );
        return new ResponseEntity<>( "put sucessfull", HttpStatus.OK);
    }


    @DeleteMapping(value= "/delete/{code}")
    @CrossOrigin
    public ResponseEntity<String> delete(@RequestParam(required = false) String tableName,
                         @RequestParam(required = false) String dbName,
                         @RequestParam(required = false) String code, String CODE) {
        logger.debug("Deleting UN_CNU with CODE= {}.", CODE);
        String lien = "/api/"+dbName+"/"+tableName+"/delete/"+code;
        rest.delete(urlMap.get(dbName)+lien, Object.class, CODE );
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }

    @DeleteMapping(value= "/deleteall")
    @CrossOrigin
    public ResponseEntity<String> deleteAll(@RequestParam(required = false) String tableName,
                                            @RequestParam(required = false) String dbName) {
        logger.debug("Deleting all ");
        String lien = "/api/"+dbName+"/"+tableName+"/deleteall";
        rest.delete(urlMap.get(dbName)+lien, Object.class );
        return new ResponseEntity<String>( "delete", HttpStatus.OK);
    }


    ///////////////////////////// CUSTOM ENDPOINTS

    @GetMapping("/getelodie")
    @CrossOrigin
    // http://localhost:9090/api/getelodie?dbName=mongo&value=l1_gr7
    public Object getElodie(@RequestParam(required = false) String dbName,
                                      @RequestParam(required = false) String value ) throws Exception {

        String lien = urlMap.get(dbName)+"/api/"+dbName+"/customcontroller/getelodie?value="+value;
        System.out.println(lien);
        return  new ResponseEntity<>( rest.getForObject(lien, Object.class), HttpStatus.OK);

    }

    @GetMapping("/loadseance")
    @CrossOrigin
    public Object getLoadSeance(@RequestParam(required = false) String dbName,
                                @RequestParam(required = false) String value ) throws Exception {

        String lien = urlMap.get(dbName)+"/api/"+dbName+"/customcontroller/loadseance";
        System.out.println(lien);
        return  new ResponseEntity<>( rest.getForObject(lien, Object.class), HttpStatus.OK);


    }

    @GetMapping("/getseance")
    @CrossOrigin
    // http://localhost:9090/api/getseance?dbName=mongo&value=l1_gr7&nomprof=prof
    public Object getseance(@RequestParam(required = false) String dbName,
                            @RequestParam(required = false) String value,
                            @RequestParam(required = false) String nomprof) throws Exception {
        String lien = "";

        if(value != null && nomprof != null){
            lien = urlMap.get(dbName)+"api/"+dbName+"/customcontroller/getseance?value="+value+"&nomprof="+nomprof;

        } if(value != null && nomprof == null) {
            lien = urlMap.get(dbName)+"api/"+dbName+"/customcontroller/getseance?value="+value;

        }
        else{
            lien = urlMap.get(dbName)+"api/"+dbName+"/customcontroller/getseance?nomprof="+nomprof;

        }
        System.out.println(lien);
        URL myURL = new URL(lien);
        return  new ResponseEntity<>( rest.getForObject( myURL.toURI()  , Object.class), HttpStatus.OK);
    }


    <T>List<T> toArrayList(T[] Tableau){
        List<T> al = new ArrayList<T>();
        for(T obj: Tableau)
            al.add(obj);
        return al;

    }
}
