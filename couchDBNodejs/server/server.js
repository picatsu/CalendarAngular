"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
///////////////////////////////////////////////////////////////////////// PAS TOUCHE 


const nano_1 = __importDefault(require("nano"));
let n = nano_1.default('http://localhost:5984');

n.db.list().then((body) => {
    // body is an array
    if(body.includes('people')){
        console.log(' YESS ');
    }
    else {
        n.db.create('people').then((body) => {
            console.log('database people created!');
        });
    }
    
  });


///////////////////////////////////////////// CONFIGURATION 

'use strict';


const fs = require('fs'),
request = require('request');

const path = require('path');
const directoryPath = path.join(__dirname, '../extract/');
let listeFiles = [];
////////////


const meulun = n.use('meulun');
meulun.get('LES_ZONES_DE_SALLES').then((body) => {
   // console.log(body.LES_ZONES_DE_SALLES.UNE_ZONE_DE_SALLE);
});




function addAll() {
    fs.readdir(directoryPath, function (err, files) {
        //handling error
        if (err) {
            return console.log('Unable to scan directory: ' + err);
        } 
        //listing all files using forEach
        listeFiles.push(files) ;
        files.forEach( file => {
          
    
            asyncCall(fs.readFileSync('../extract/'+file, "utf8") ,file);
            return;
        } )
    
        
    });

}

function asyncCall(postData, name) {
    
    const clientServerOptions = {
        uri: 'http://localhost:5984/meulun/'+name,
        body: JSON.stringify(postData),
        method: 'PUT',
        headers: {
            'Content-Type': 'application/json'
        },
        json: true // Automatically stringifies the body to JSON
    };
   // console.log('asyncall', clientServerOptions.body);
    

    request(clientServerOptions, function (error, response, body) {
        if (error != null) {
            console.log('error:', error);
        }
        else {
            //console.log('Response', response);
            console.log('Body', body);

        }
    });
}