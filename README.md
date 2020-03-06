# Projet BADA - Emploi du temps pour etudiants et professeurs

## Table of Contents

- API Gateway en Spring boot
- API pour mongoDB
- API pour CouchDB
- Application Angular 8

## Prérequis

- Java 8
- Node / npm / Angular
- Intellij / Eclipse
- MongoDB
- CouchdDB

## Etape pour lancer le projet

- Lancer les 3 api ( avec intellij ou Eclipse )
- Lancer la BDD Mongo et Couchdb (attention au nom des databases)
- Remplir les BDD => OtherAPi/Node_Application_export_DB et node AppNodeInjection
- Afin d'aggreger les seances vers la nouvelle table CustomSeance, faire appel a http://localhost:8100/api/mongo/customcontroller/loadseance au tout premier lancement de l'application
- Pour lancer le projet angular, cd Client_Side && npm install && npm start

## Chemins d'accés

- ApiGateway : http://localhost:9090/swagger-ui.html#/
- Mongodb : http://localhost:8100/swagger-ui.html#/
- Couchdb : http://localhost:9100/swagger-ui.html#/

- Ui - Angular : http://localhost:4200

## Le chemin des autres repositories

- Git Composant Front : https://github.com/MelVingt/FacBADA
- Git Applications : https://gitlab.com/picatsu/projetbada
- Lien Slides : https://drive.google.com/file/d/11cdBEDCzz4KemkpRTRsNgid2UABbd6Ca/view?usp=sharing
