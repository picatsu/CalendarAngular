import { Pipe, PipeTransform, SystemJsNgModuleLoader, ViewChild, ElementRef } from '@angular/core';
import { Observable } from 'rxjs';
import { Component, Input, Output, EventEmitter, OnInit, OnChanges, SimpleChanges } from '@angular/core';


import { ThemeService } from './services/theme.service';
import { FilterPipe } from './services/filter.pipe';
import { BuildServiceService, BuildJson, Scenarii } from './services/build-service.service';
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
  activeBuild: BuildJson;

  constructor(private themeService: ThemeService, private buildService: BuildServiceService, private toastr: ToastrService
    , config: NgbModalConfig, private modalService: NgbModal, private modalService2: NgbModal) {

    this.buildService.getTab().forEach( x=> {
      this.tab.push(x);
    });
    
   
    config.backdrop = 'static';
    config.keyboard = false;
    //this.isDarkTheme = this.themeService.getTheme();
  }

  

  open(content, build: any) {
    this.activeBuild = this.tab.find( element => element.Build == build);
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

  showSuccess(BuildNumber: string) {


    if( this.queue[0] == BuildNumber){ //// CASE OF SAME BUILD NUMBER 
      this.toastr.error('Bad Request', this.queue[0] +' x ' + BuildNumber, {
        timeOut: 1500
      });
      this.showCompare = false;
      this.queue.shift();
      return;

    }
    else{
      this.queue.push(BuildNumber);
      this.tab.forEach( x => {
        if(x.Build == BuildNumber ){
          x.checked = true;
        }
      });
      if(this.queue.length == 2){
        this.tab.forEach( x => {
          if(x.Build == BuildNumber ){
            x.checked = true;
          }
        })
        /// SERVICE FAIT REQUETE 
          this.showCompare = true;
        this.toastr.success('GOOD Request', this.queue[0] +' x ' + BuildNumber, {
          timeOut: 1500
        });
        this.oldAndnewBuild = this.queue[0] +' and ' + BuildNumber;
        this.queue.shift();
        this.queue.shift();
        
      }else{
        this.showCompare = false;

      }
    }
  }

  clearAll(){
    this.tab.forEach( x =>  { ( x as BuildJson).checked = false } );
    this.showCompare = false;

  }


}
