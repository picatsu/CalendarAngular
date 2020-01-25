package com.example.tdbada.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.io.IOException;



@Controller("couchdb")
@RequestMapping(value = "/api/couchdb")
@ConfigurationProperties("couchdb")
public class CouchDBController {

// TODO https://www.ibm.com/cloud/cloudant    => FREE REPLICAT
    @Value("${couchdb.urlcouchdb}")
    private String url;

    @GetMapping("/getalldb")
    @CrossOrigin
    public ResponseEntity<String> getAllDb() throws Exception {
        RestTemplate a = new RestTemplate();
        String quote = a.getForObject(
                url+"FAUTFAIREUNPUT", String.class);
        return  new ResponseEntity<>(quote, HttpStatus.OK);
    }

    @RequestMapping(value = "/getdocument/{id}", params = "id", method = RequestMethod.GET)
    public ResponseEntity<String> getDocument(@RequestParam(defaultValue = "FAUTFAIREUNPUT", required = false) String id) throws IOException {
        RestTemplate a = new RestTemplate();
        String quote = a.getForObject(
                url+"FAUTFAIREUNPUT", String.class);
        return  new ResponseEntity<>(quote, HttpStatus.OK);
    }


    @PutMapping("/putdocument")
    @ResponseBody
    public String putDoc(@RequestParam(name = "id") String id)  throws Exception  {
        RestTemplate a = new RestTemplate();
        a.put(url+id, String.class);

        return "OK";
    }

    @DeleteMapping("deletedocument")
    @ResponseBody
    public String deleteDoc(@RequestParam(name = "id") String id) throws Exception {
        return "DELETE OK ";
    }






}
