package com.example.tdbada.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Controller("couchdb")
@RequestMapping(value = "/api/couchdb")
public class CouchDBController {

// TODO https://www.ibm.com/cloud/cloudant    => FREE REPLICAT


    @GetMapping("/getalldb")
    @CrossOrigin
    public ResponseEntity<String> getAllDb() throws Exception {
        RestTemplate a = new RestTemplate();
        String quote = a.getForObject(
                "http://localhost:5984/meulun/FAUTFAIREUNPUT", String.class);
        return  new ResponseEntity<>(quote, HttpStatus.OK);
    }

    @RequestMapping(value = "/getdocument/{id}", params = "id", method = RequestMethod.GET)
    public ResponseEntity<String> getDocument(@RequestParam(defaultValue = "FAUTFAIREUNPUT", required = false) String id) throws IOException {
        RestTemplate a = new RestTemplate();
        String quote = a.getForObject(
                "http://localhost:5984/meulun/FAUTFAIREUNPUT", String.class);
        return  new ResponseEntity<>(quote, HttpStatus.OK);
    }


    @PutMapping("/putdocument")
    @ResponseBody
    public String putDoc(@RequestParam(name = "id") String id)  throws Exception  {
        RestTemplate a = new RestTemplate();
        a.put("http://localhost:5984/meulun/"+id, String.class);

        return "OK";
    }

    @DeleteMapping("deletedocument")
    @ResponseBody
    public String deleteDoc(@RequestParam(name = "id") String id) throws Exception {
        return "DELETE OK ";
    }






}
