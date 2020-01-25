package com.example.tdbada.controller;



import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller("firebase")
@RequestMapping(value = "/api/firebase")
@ConfigurationProperties("firebase")
public class FireBaseController {

    @Value("${firebase.urlfirebase}")
    private String urlfirebase;

    @GetMapping("/getalldb")
    @CrossOrigin
    public ResponseEntity<String> getAllDb() throws Exception {

        return  new ResponseEntity<>("FIREBASE MARCHE url: "+urlfirebase, HttpStatus.OK);
    }

}
