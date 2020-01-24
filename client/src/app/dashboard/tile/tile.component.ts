
import { Pipe, PipeTransform, SystemJsNgModuleLoader, ViewChild, ElementRef, ChangeDetectionStrategy } from '@angular/core';
import { Observable } from 'rxjs';
import { Component, Input, Output, EventEmitter, OnInit, OnChanges, SimpleChanges } from '@angular/core';


import { ThemeService } from '../services/theme.service';
import { FilterPipe } from '../services/filter.pipe';
import { BuildServiceService, BuildJson, Scenarii } from '../services/build-service.service';
import { ToastrService } from 'ngx-toastr';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap';


@Component({
  selector: 'td-tile',
  templateUrl: './tile.component.html',
  styleUrls: ['./tile.component.scss'],
  providers: [FilterPipe, NgbModalConfig, NgbModal

  ],
  changeDetection: ChangeDetectionStrategy.OnPush,

})


export class TileComponent implements OnInit {
  isDarkTheme: Observable<boolean>;
  public searchString: string;
  searchKeyword: any;
  queue = [];
  tab = [];
  showCompare = false;
  oldAndnewBuild: any;
  activeBuild: BuildJson;
  numberShow = 20;
  map = new Map();
  maptext = new Map();
  activeDB: string;
  constructor(
    private themeService: ThemeService,
    private buildService: BuildServiceService,
    private toastr: ToastrService,
    config: NgbModalConfig,
    private modalService: NgbModal,
    private modalService2: NgbModal) {

    config.backdrop = 'static';
    config.keyboard = false;

    this.map.set(1, 'MONGODB');
    this.map.set(2, 'COUCHDB');
    this.map.set(3, 'NEO4J');
    this.map.set(4, 'CASSANDRA');
    this.map.set(5, 'REDIS');
    this.map.set(6, 'BIGTABLE');
    this.map.set(7, 'PROJETVOLDEMORT');

    this.activeDB = this.map.get(2);


    this.maptext.set('MONGODB', 'CE TEXT VIENT DE MONGODB');
    this.maptext.set('COUCHDB', 'CE TEXT VIENT DE COUCHDB');
    this.maptext.set('NEO4J', 'CE TEXT VIENT DE NEO4J');
    this.maptext.set('CASSANDRA', 'CE TEXT VIENT DE CASSANDRA');
    this.maptext.set('REDIS', 'CE TEXT VIENT DE REDIS');
    this.maptext.set('BIGTABLE', 'CE TEXT VIENT DE BIGTABLE');
    this.maptext.set('PROJETVOLDEMORT', 'CE TEXT VIENT DE PROJETVOLDEMORT');



  }


  showText() {
      return this.maptext.get(this.activeDB);
  }

  open(content, build: any) {
    this.activeBuild = this.tab.find( element => element.Build == build);
    this.modalService.open(content, {windowClass: 'dark-modal', size: 'xl', centered: true, scrollable: true }  );
  }

  showSuccess (number: number) {
    this.toastr.success( this.map.get(number) , 'SUCCESFULLY', {
      timeOut: 1000
    });
    this.activeDB = this.map.get(number);

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



  clearAll() {
    this.tab.forEach( x =>  { ( x as BuildJson).checked = false; } );
    this.showCompare = false;

  }


}
