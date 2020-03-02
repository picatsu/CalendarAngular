const express = require("express");
const app = express();
const request = require("request");

ENVGROUPE = require("./config/LES_GROUPES.js");
ENVSEANCE = require("./config/LES_SEANCES");
ENVENSEIGNEMENT = require("./config/LES_ENSEIGNEMENTS");
ENVGRADE = require("./config/LES_GRADES");
ENVRESERVATION = require("./config/LES_RESERVATIONS");
ENVCNU = require("./config/LES_CNU");
ENVCOMPOSANTE = require("./config/LES_COMPOSANTES");
ENVPROF = require("./config/LES_PROFESSEURS");
ENVETUDIANT = require("./config/LES_ETUDIANTS");
ENVMATIERE = require("./config/LES_MATIERES");
ENVNIVEAU = require("./config/LES_NIVEAUX");
ENVPARAM = require("./config/LES_PARAMETRES_GENERAUX");
ENVPERIODE = require("./config/LES_PERIODES");
ENVSALLE = require("./config/LES_SALLES");
ENVTA = require("./config/LES_TYPES_ACTIVITES");
ENVZS = require("./config/LES_ZONES_DE_SALLES");
CUSTUMSEANCE = require("./config/CUSTOMSEANCE");

BASELINK = "http://localhost:8100/api/mongo";
BASELINKCouchdb = "http://127.0.0.1:5984/couchdb/";

function asyncCall(method, postData, uri) {
  const clientServerOptions = {
    uri: uri,
    body: postData,
    method: method,
    headers: {
      "Content-Type": "application/json"
    },
    json: true // Automatically stringifies the body to JSON
  };

  request(clientServerOptions, function(error, response, body) {
    //console.log("response :", response);
    if (error != null) {
      console.log("error:", error);
    } else {
      console.log("SUCESS");
    }
  });
}

// LOAD MONGO DB
function loadMongo() {
  asyncCall("POST", ENVGROUPE, BASELINK + "/UN_GROUPES/create/");
  asyncCall("POST", ENVSEANCE, BASELINK + "/UNE_SEANCE/create/");
  asyncCall("POST", ENVENSEIGNEMENT, BASELINK + "/UN_ENSEIGNEMENT/create/");
  asyncCall("POST", ENVGRADE, BASELINK + "/UN_GRADE/create/");
  asyncCall("POST", ENVRESERVATION, BASELINK + "/UNE_RESERVATION/create/");
  asyncCall("POST", ENVCNU, BASELINK + "/UN_CNU/create/");
  asyncCall("POST", ENVCOMPOSANTE, BASELINK + "/UNE_COMPOSANTE/create/");
  asyncCall("POST", ENVPROF, BASELINK + "/UN_PROFESSEUR/create/");
  asyncCall("POST", ENVETUDIANT, BASELINK + "/UN_ETUDIANT/create/");
  asyncCall("POST", ENVMATIERE, BASELINK + "/UNE_MATIERE/create/");
  asyncCall("POST", ENVNIVEAU, BASELINK + "/UN_NIVEAU/create/");
  asyncCall("POST", ENVPARAM, BASELINK + "/LES_PARAMETRES_GENERAUX/create/");
  asyncCall("POST", ENVPERIODE, BASELINK + "/UNE_PERIODE/create/");
  asyncCall("POST", ENVSALLE, BASELINK + "/UNE_SALLE/create/");
  asyncCall("POST", ENVTA, BASELINK + "/UN_TYPE_ACTIVITE/create");
  asyncCall("POST", ENVZS, BASELINK + "/UNE_ZONE_DE_SALLE/create/");
}

function loadCouchDB() {
  asyncCall("PUT", ENVGROUPE, BASELINKCouchdb + '"UN_GROUPES"');
  asyncCall("PUT", ENVSEANCE, BASELINKCouchdb + '"UNE_SEANCE"');
  asyncCall("PUT", ENVENSEIGNEMENT, BASELINKCouchdb + '"UN_ENSEIGNEMENT"');
  asyncCall("PUT", ENVGRADE, BASELINKCouchdb + '"UN_GRADE"');
  asyncCall("PUT", ENVRESERVATION, BASELINKCouchdb + '"UNE_RESERVATION"');
  asyncCall("PUT", ENVCNU, BASELINKCouchdb + '"UN_CNU"');
  asyncCall("PUT", ENVCOMPOSANTE, BASELINKCouchdb + '"UNE_COMPOSANTE"');
  asyncCall("PUT", ENVPROF, BASELINKCouchdb + '"UN_PROFESSEUR"');
  asyncCall("PUT", ENVETUDIANT, BASELINKCouchdb + '"UN_ETUDIANT"');
  asyncCall("PUT", ENVMATIERE, BASELINKCouchdb + '"UNE_MATIERE"');
  asyncCall("PUT", ENVNIVEAU, BASELINKCouchdb + '"UN_NIVEAU"');
  asyncCall("PUT", ENVPARAM, BASELINKCouchdb + '"LES_PARAMETRES_GENERAUX"');
  asyncCall("PUT", ENVPERIODE, BASELINKCouchdb + '"UNE_PERIODE"');
  asyncCall("PUT", ENVSALLE, BASELINKCouchdb + '"UNE_SALLE"');
  asyncCall("PUT", ENVTA, BASELINKCouchdb + '"UN_TYPE_ACTIVITE"');
  asyncCall("PUT", ENVZS, BASELINKCouchdb + '"UNE_ZONE_DE_SALLE"');
}

loadMongo();
