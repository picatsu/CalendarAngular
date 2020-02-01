import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';

import { CassandraComponent } from './cassandra.component';
import { BrandButtonsComponent } from './brand/brand-buttons.component';

// Dropdowns Component
import { BsDropdownModule } from 'ngx-bootstrap/dropdown';
import { DropdownsComponent } from './dropdowns/dropdowns.component';

// Buttons Routing
import { CassandraRoutingModule } from './cassandra-routing.module';

// Angular

@NgModule({
  imports: [
    CommonModule,
    CassandraRoutingModule,
    BsDropdownModule.forRoot(),
    FormsModule
  ],
  declarations: [
    CassandraComponent,
    DropdownsComponent,
    BrandButtonsComponent
  ]
})
export class CassandraModule { }
