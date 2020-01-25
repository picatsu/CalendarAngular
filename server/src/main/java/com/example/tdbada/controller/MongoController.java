package com.example.tdbada.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Controller("mongodb")
@RequestMapping(value = "/api/mongodb")
@ConfigurationProperties("mongodb")
public class MongoController {

    @Value("${mongodb.urlmongodb}")
    private String urlmongodb;


    @GetMapping("/getalldb")
    @CrossOrigin
    public ResponseEntity<String> getAllDb() throws Exception {


        return  new ResponseEntity<>("MONGODB MARCHE :"+urlmongodb, HttpStatus.OK);
    }


}
