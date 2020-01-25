import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class BuildServiceService {
  alldb = "getalldb";

  constructor(private http:HttpClient) {
  
  }

   
   getAllDb(name: string) {
     const lien = "/api/"+name+"/"+this.alldb;
     console.log('lien', lien);
     return this.http.get(lien);
   }

  




}

