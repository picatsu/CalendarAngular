"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
///////////////////////////////////////////////////////////////////////// PAS TOUCHE 

const nano = __importDefault(require("nano"));
let n = nano.default('http://localhost:5984');

function getAllDBList() {
    
    n.db.list().then((body) => {
        // body is an array
        if(body.includes('meulun')){
            console.log(' DB MEULUN EXIST  ');
        }
        else {
            n.db.create('meulun').then((body) => {
                console.log('database meulun created!');
            });
        }
        console.log('body DB', body);

        return body;
        

    });
}

getAllDBList();

const fs = require('fs'),
request = require('request');

const path = require('path');
const directoryPath = path.join(__dirname, '../extract/');
const meulun = n.use('meulun');

let listeFiles = [];

///////////////////////////////////////////// CONFIGURATION 
let listeeDOC = [];
function getListeDocuments(callback) {
meulun.list().then((body) => {
    listeeDOC = listeeDOC.concat(body.rows);
    callback();
   
  });
}

getListeDocuments(function (){
    console.log('LISTE',listeeDOC);
})


meulun.get('SAUVEGARDE').then((body) => {
  //console.log(body);
});





////////////////////// OTHER STUFF 

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