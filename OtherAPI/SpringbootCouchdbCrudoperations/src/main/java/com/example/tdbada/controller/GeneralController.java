package com.example.tdbada.controller;

import com.example.tdbada.model.*;
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
@RequestMapping(value = "/api/couchdb/customcontroller")
public class GeneralController {

    @Autowired
    private RestTemplate rest;
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private Map<String, String> urlMap;

    private String url = "http://localhost:5984/couchdb/custom";
    @GetMapping("/getall")
    @CrossOrigin
    // http://localhost:9090/api/getall?tableName=SAUVEGARDE&dbName=mongo
    public Object getAllDb() throws Exception {

        return  new ResponseEntity<>( rest.getForObject(url, Object.class), HttpStatus.OK);
    }

    @GetMapping("/getseance")
    @CrossOrigin
    // http://localhost:9100/api/couchdb/customcontroller/getseance?&value=l1
    public Object getById(@RequestParam(required = false) String value) throws Exception {
        CustomCouchdbSeance dataa = rest.getForObject(url, CustomCouchdbSeance.class);
        List<CustomSeance> res = new ArrayList<>();
        System.out.println(dataa.getData().size());
        for(CustomSeance data: dataa.getData() ){

                if(data != null &&  data.getNomFiliere() != null  && data.getNomFiliere().equals(value)){
                    res.add(data);
                }

        }
        System.out.println(res.size());
        return new ResponseEntity<>(res, HttpStatus.OK);
        // return " afaevae ";
    }

    ///////////////////////////// CUSTOM ENDPOINTS


    <T>List<T> toArrayList(T[] Tableau){
        List<T> al = new ArrayList<T>();
        for(T obj: Tableau)
            al.add(obj);
        return al;

    }
}
