const express = require("express");
const path = require("path");
const bodyParser = require("body-parser"),
  fetch = require("node-fetch");
const app = express();
const server = require("http").createServer(app);

const PORT = 3000,
  request = require("request");
//  ENV = require("./config/variables");
//console.log("Server is running");
const rp = require("request-promise");

function asyncCall(postData, uri) {
  const clientServerOptions = {
    uri: uri,
    body: postData,
    method: "POST",
    headers: {
      "Content-Type": "application/json"
    },
    json: true // Automatically stringifies the body to JSON
  };
  request(clientServerOptions, function(error, response, body) {
    if (error != null) {
      console.log("error:", error);
    } else {
      console.log("SUCESS");
    }
  });
}

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

asyncCall(ENVGROUPE, "http://localhost:8100/api/mongo/UN_GROUPES/create/");
asyncCall(ENVSEANCE, "http://localhost:8100/api/mongo/UNE_SEANCE/create/");
asyncCall(
  ENVENSEIGNEMENT,
  "http://localhost:8100/api/mongo/UN_ENSEIGNEMENT/create/"
);
asyncCall(ENVGRADE, "http://localhost:8100/api/mongo/UN_GRADE/create/");
asyncCall(
  ENVRESERVATION,
  "http://localhost:8100/api/mongo/UNE_RESERVATION/create/"
);
asyncCall(ENVCNU, "http://localhost:8100/api/mongo/UN_CNU/create/");
asyncCall(
  ENVCOMPOSANTE,
  "http://localhost:8100/api/mongo/UNE_COMPOSANTE/create/"
);
asyncCall(ENVPROF, "http://localhost:8100/api/mongo/UN_PROFESSEUR/create/");
asyncCall(ENVETUDIANT, "http://localhost:8100/api/mongo/UN_ETUDIANT/create/");
asyncCall(ENVMATIERE, "http://localhost:8100/api/mongo/UNE_MATIERE/create/");
asyncCall(ENVNIVEAU, "http://localhost:8100/api/mongo/UN_NIVEAU/create/");
asyncCall(
  ENVPARAM,
  "http://localhost:8100/api/mongo/LES_PARAMETRES_GENERAUX/create/"
);
asyncCall(ENVPERIODE, "http://localhost:8100/api/mongo/UNE_PERIODE/create/");
asyncCall(ENVSALLE, "http://localhost:8100/api/mongo/UNE_SALLE/create/");
asyncCall(
  ENVTA,
  "http://localhost:8100/api/mongo/api/mongo/UN_TYPE_ACTIVITE/create"
);
asyncCall(
  ENVZS,
  "http://localhost:8100/api/mongo/api/mongo/UNE_ZONE_DE_SALLE/create/"
);

/*GROUPE.array.forEach(element => {
  this.asyncCall(element, "http://localhost:8100/api/mongo/UN_GROUPES/create");
}); */
