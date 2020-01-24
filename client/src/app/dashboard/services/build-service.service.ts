import { Injectable } from '@angular/core';
import { Socket } from 'ngx-socket-io';
import { map } from "rxjs/operators";
import { Observable } from 'rxjs';
import { HttpClient, HttpHeaders } from '@angular/common/http';

import * as io from 'socket.io-client';
@Injectable({
  providedIn: 'root'
})
export class BuildServiceService {

  tab = [];
  private url = 'http://localhost:5984/meulun/c71818b6436e95d582979d4e58001587';
  private ulrapi ='http://localhost:8080/api/couchdb/getalldb';

  tab2 = [];

  constructor(private http:HttpClient) {

    
   // this.socket.emit("connection", "connection");
      //console.log(' AFFF ', this.branche[2 % 2])
    
    }

   getTab(){
     this.getJson();
     return this.tab2;
   }


   getCouchDB() {
     return this.http.get(this.ulrapi);
   }

   public sendMessage(message) {
  }

  getJson() {
    return this.http.get(this.url);
  }

  getTab2() {
    return this.tab2;
  }
   

  
  getMessage() {
    

  } 




}


export interface Biologie {
  DATA_VISUAL_TIMETABLING: { 
    SAUVEGARDE: string;
    LES_PARAMETRES_GENERAUX: string;
    LES_PERIODES_NOMMEES: string;
    LES_COMPOSANTES: string;
  }
}


export interface BuildJson {
  _id: string;
  lastname: string;
  birthname: string;
  ssn: string;
  commune: string;
  departement: string;
  pays: string;
  naissance: string;
  checked: boolean
}

export interface Scenarii {
  indice: string;
  mock: boolean;
  failure: boolean;
  explication: string
}