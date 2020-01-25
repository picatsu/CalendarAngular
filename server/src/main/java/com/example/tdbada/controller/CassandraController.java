package com.example.tdbada.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller("cassandra")
@RequestMapping(value = "/api/cassandra")
@ConfigurationProperties("cassandra")
public class CassandraController {

    @Value("${cassandra.urlcassandra}")
    private String urlcassandra;

    @GetMapping("/getalldb")
    @CrossOrigin
    public ResponseEntity<String> getAllDb() throws Exception {
        return  new ResponseEntity<>("CASSANDRA MARCHE url : "+urlcassandra, HttpStatus.OK);
    }

}
