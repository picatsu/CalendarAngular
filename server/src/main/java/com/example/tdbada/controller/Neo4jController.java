package com.example.tdbada.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("neo4j")
@RequestMapping(value = "/api/neo4j")
@ConfigurationProperties("neo4j")
public class Neo4jController {

    @Value("${neo4j.urlneo4j}")
    private String urlneo4j;


    @GetMapping("/getalldb")
    @CrossOrigin
    public ResponseEntity<String> getAllDb() throws Exception {


        return  new ResponseEntity<>("NEO4J MARCHE url :"+urlneo4j, HttpStatus.OK);
    }

}
