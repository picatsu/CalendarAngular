import { Pipe, PipeTransform, SystemJsNgModuleLoader, ViewChild, ElementRef } from '@angular/core';
import { Observable } from 'rxjs';
import { Component, Input, Output, EventEmitter, OnInit, OnChanges, SimpleChanges } from '@angular/core';


import { ThemeService } from './services/theme.service';
import { FilterPipe } from './services/filter.pipe';
import { BuildServiceService } from './services/build-service.service';
import { ToastrService } from 'ngx-toastr';
import { NgbModalConfig, NgbModal } from '@ng-bootstrap/ng-bootstrap';
import { ExtractComponent } from './extract/extract.component';


@Component({
  selector: 'td-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss'],
  providers: [FilterPipe,NgbModalConfig, NgbModal

  ],
})


export class DashboardComponent implements OnInit {
  isDarkTheme: Observable<boolean>;
  public searchString: string;
  searchKeyword: any;
  queue = [];
  tab = [];
  showCompare: boolean = false;
  oldAndnewBuild: any;


  constructor(private themeService: ThemeService, private buildService: BuildServiceService, private toastr: ToastrService
    , config: NgbModalConfig, private modalService: NgbModal, private modalService2: NgbModal) {

  
    
   
    config.backdrop = 'static';
    config.keyboard = false;
    //this.isDarkTheme = this.themeService.getTheme();
  }

  

  open(content, build: any) {
    this.modalService.open(content, {windowClass: 'dark-modal', size: 'xl', centered: true, scrollable: true }  );
  }


  open2(content2) {
    //this.activeBuild = this.tab.find( element => element.Build == build);
    this.modalService2.open(content2, {windowClass: 'dark-modal', size: 'xl', centered: true, scrollable: true }  );
  }

  ngOnInit() {
    this.toggleDarkTheme(true);
   
  }

  

  getDark() {
    return this.themeService.isDarkTheme;
  }
  toggleDarkTheme(isDarkTheme: boolean) {
    this.themeService.setDarkTheme(isDarkTheme);
  }

  getBrancheClass(name : string) {
    return (name.includes('RELEASE'));
    
  }

  

}
