// Angular
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';

// Alert Component
import { AlertModule } from 'ngx-bootstrap/alert';
import { AlertsComponent } from './alerts/alerts.component';

import { BadgesComponent } from './badges/badges.component';

// Modal Component
import { ModalModule } from 'ngx-bootstrap/modal';
import { ModalsComponent } from './modals/modals.component';

// Notifications Routing
import { VoldemortRoutingModule } from './voldemort-routing.module';

@NgModule({
  imports: [
    CommonModule,
    VoldemortRoutingModule,
    AlertModule.forRoot(),
    ModalModule.forRoot()
  ],
  declarations: [
    AlertsComponent,
    BadgesComponent,
    ModalsComponent
  ]
})
export class VoldemortModule { }
