
import { Pipe, PipeTransform, SystemJsNgModuleLoader, ViewChild, ElementRef, ChangeDetectionStrategy, AfterViewInit, ViewChildren } from '@angular/core';
import { Observable } from 'rxjs';
import { Component, Input, Output, EventEmitter, OnInit, OnChanges, SimpleChanges } from '@angular/core';


import { ThemeService } from '../services/theme.service';
import { FilterPipe } from '../services/filter.pipe';
import { BuildServiceService } from '../services/build-service.service';
import { ToastrService } from 'ngx-toastr';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector: 'td-tile',
  templateUrl: './tile.component.html',
  styleUrls: ['./tile.component.scss'],
  providers: [FilterPipe, NgbModalConfig, NgbModal],
  changeDetection: ChangeDetectionStrategy.OnPush,

})


export class TileComponent implements OnInit{
  panelOpenState = false;
  public isCollapsed = false;

  isDarkTheme: Observable<boolean>;
  public searchString: string;
  searchKeyword: any;
  queue = [];
  tab = [];
  showCompare = false;
  map = new Map();
  maptext = new Map();
  activeDB: string;
  data: Object;
  constructor(
    private themeService: ThemeService,
    private buildService: BuildServiceService,
    private toastr: ToastrService,
    config: NgbModalConfig,
    private modalService: NgbModal,
    private modalService2: NgbModal) {

    config.backdrop = 'static';
    config.keyboard = false;

    this.map.set(1, 'mongodb');
    this.map.set(2, 'couchdb');
    this.map.set(3, 'neo4j');
    this.map.set(4, 'cassandra');
    this.map.set(5, 'redis');
    this.map.set(6, 'firebase');
    this.map.set(7, 'projetvoldemort');

    this.activeDB = this.map.get(2);


    this.maptext.set('mongodb', 'CE TEXT VIENT DE MONGODB');
    this.maptext.set('couchdb', 'CE TEXT VIENT DE COUCHDB');
    this.maptext.set('neo4j', 'CE TEXT VIENT DE NEO4J');
    this.maptext.set('cassandra', 'CE TEXT VIENT DE CASSANDRA');
    this.maptext.set('redis', 'CE TEXT VIENT DE REDIS');
    this.maptext.set('firebase', 'CE TEXT VIENT DE FIREBASE');
    this.maptext.set('projetvoldemort', 'CE TEXT VIENT DE PROJETVOLDEMORT');


      this.buildService.getAllDb(this.map.get(2)).subscribe ( (value) => {
        this.data = value;
      });
      
  }


  showText() {
    console.log("NAME", this.activeDB );

    this.buildService.getAllDb(this.activeDB).subscribe ( (value) => {
      this.data = value;
    });
      return this.maptext.get(this.activeDB);
  }

  
  

  open(content, build: any) {
    this.modalService.open(content, {windowClass: 'dark-modal', size: 'xl', centered: true, scrollable: true }  );
  }

  showSuccess (number: number) {
    
    this.toastr.success( this.map.get(number) , 'SUCCESFULLY', {
      timeOut: 1000
    });
    this.activeDB = this.map.get(number);

    console.log('DATA : ', this.data);
  }

  isChecked(number: number) {
    return this.map.get(number ) === this.activeDB;
  }


  open2(content2) {
    // this.activeBuild = this.tab.find( element => element.Build == build);
    this.modalService2.open(content2, {windowClass: 'dark-modal', size: 'xl', centered: true, scrollable: true }  );
  }

  ngOnInit() {
    this.toggleDarkTheme(true);
  }


  toggleDarkTheme(isDarkTheme: boolean) {
    this.themeService.setDarkTheme(isDarkTheme);
  }

  getBrancheClass(name: string) {
    return (name.includes('RELEASE'));

  }



}
