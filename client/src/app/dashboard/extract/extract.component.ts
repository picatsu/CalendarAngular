import { Component, OnInit } from '@angular/core';
import { BuildServiceService } from '../services/build-service.service';

@Component({
  selector: 'td-extract',
  templateUrl: './extract.component.html',
  styleUrls: ['./extract.component.scss']
})
export class ExtractComponent implements OnInit {


  sortOrder: number;
  message: string;
  messages: {[key: string]: any[]};
  constructor(private buildService: BuildServiceService) { }
  headelement =  ['SAUVEGARDE', 'LES_PARAMETRES_GENERAUX', 'LES_PERIODES_NOMMEES',
   'LES_COMPOSANTES', 'LES_NIVEAUX', 'LES_DIPLOMES', 'LES_PROFESSEURS', 'LES_ETUDIANTS',
    'LES_MATERIELS', 'LES_GROUPES', 'LES_SALLES', 'LES_MATIERES',
    'LES_ENSEIGNEMENTS', 'LES_SEANCES', 'LES_RESERVATIONS', 'LES_GRADES',
    'LES_TYPES_ACTIVITES', 'LES_CODES_CNU', 'LES_TYPES_DE_SALLES',
     'LES_ZONES_DE_SALLES'];
     couchdb = [];


  ngOnInit() {


  }








}
