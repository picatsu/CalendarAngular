"use strict";
var __importDefault = (this && this.__importDefault) || function (mod) {
    return (mod && mod.__esModule) ? mod : { "default": mod };
};
Object.defineProperty(exports, "__esModule", { value: true });
///////////////////////////////////////////////////////////////////////// PAS TOUCHE 
const express = require('express'),
    router = express.Router(),
    bodyParser = require('body-parser'),
    app = express(),
    nano = __importDefault(require("nano")),
    n = nano.default('http://localhost:5984'),    
    fs = require('fs'),
    request = require('request'),
    requestPromise = require('request-promise'),
    path = require('path'),
    directoryPath = path.join(__dirname, '../extract/'),
    meulun = n.use('meulun');
    app.use(bodyParser.json());
    app.use(bodyParser.urlencoded({
        extended : true
    }));
    const listeTABLE = [ 'FAUTFAIREUNPUT',
    'LES_CODES_CNU',
    'LES_COMPOSANTES',
    'LES_DIPLOMES',
    'LES_ENSEIGNEMENTS',
    'LES_ETUDIANTS',
    'LES_GRADES',
    'LES_GROUPES',
    'LES_MATERIELS',
    'LES_MATIERES',
    'LES_NIVEAUX',
    'LES_PARAMETRES_GENERAUX',
    'LES_PERIODES_NOMMEES',
    'LES_RESERVATIONS',
    'LES_SALLES',
    'LES_SEANCES',
    'LES_TYPES_ACTIVITES',
    'LES_TYPES_DE_SALLES',
    'LES_ZONES_DE_SALLES',
    'SAUVEGARDE' ];
    
////////////////////////////////////////////////////////////////////////  END CONF 

///////////////////////////////////////////// HTPP & CONFIGURATION 
function initListeDATABASE() {
    
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


let listeFiles = [];
function getListeDocuments(callback) {
    meulun.list().then((body) => {
       
        return body;
         
    callback();
   
  });
}

function addAllJSONinRepository() {
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

/////////////////////  FUNCTION 
let getdb = function (req, res){
        meulun.get(req.query.name).then((body) => {
        res.send(body);
      }); 
}




let getAllDB = function (req, res){
   
    let response = [];
    const urls = [];
    listeTABLE.forEach(x=>{ 
       urls.push('http://localhost:3000/api/couchdb/getdb?name='+x);
    });
    console.log('daefefea', urls);
    const promises = urls.map(url => requestPromise(url));
    Promise.all(promises).then( data => {
       
        
        const q = {
            selector: {
                CODE: { "$eq": "3000259"},
                ALIAS : { "$eq": "IDF" }
            },
            fields: [ "CODE", "ALIAS", "tags", "url" ],
            limit:50
          };
          meulun.find(q).then((doc) => {
            console.log(doc);
          });



       let i = 0;
        data.forEach(smalldata => {
            try{
                    let a = JSON.parse(smalldata);
                   //  console.log('zegazg', a);
                    i++;
            }catch(error){
                    return ' aeuvaeouvbaeouvaeuovfa : '+i;
            }
        });

          
    });
}
/////////////////////////////////////////////////////////////////   END HTTP CALLS TO COUCHDB

// http://localhost:3000//api/couchdb/getdb?name=SAUVEGARDE
app.get("/api/couchdb/getdb/", getdb);


app.get("/api/couchdb/getall/", getAllDB);





////////////////////// OTHER STUFF 

const PORT = 3000;

app.listen(PORT, () => {
    console.log('Express server listening on port ' + PORT);

})