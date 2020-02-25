// Angular
import { CommonModule } from "@angular/common";
import { FormsModule } from "@angular/forms";
import { NgModule } from "@angular/core";

// Tabs Component
import { TabsModule } from "ngx-bootstrap/tabs";

// Carousel Component
import { CarouselModule } from "ngx-bootstrap/carousel";

// Collapse Component
import { CollapseModule } from "ngx-bootstrap/collapse";

// Dropdowns Component
import { BsDropdownModule } from "ngx-bootstrap/dropdown";

// Pagination Component
import { PaginationModule } from "ngx-bootstrap/pagination";

// Popover Component
import { PopoverModule } from "ngx-bootstrap/popover";

// Progress Component
import { ProgressbarModule } from "ngx-bootstrap/progressbar";

// Tooltip Component
import { TooltipModule } from "ngx-bootstrap/tooltip";

// navbars

// Components Routing
import { CouchdbRoutingModule } from "./couchdb-routing.module";
import { FormsComponent } from "./forms/forms.component";
import { TabsComponent } from "./tabs/tabs.component";
import { TooltipsComponent } from "./tooltips/tooltips.component";
import { SwitchesComponent } from "./switches/switches.component";

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    CouchdbRoutingModule,
    BsDropdownModule.forRoot(),
    TabsModule,
    CarouselModule.forRoot(),
    CollapseModule.forRoot(),
    PaginationModule.forRoot(),
    PopoverModule.forRoot(),
    ProgressbarModule.forRoot(),
    TooltipModule.forRoot()
  ],
  declarations: [
    FormsComponent,
    SwitchesComponent,
    TabsComponent,
    TooltipsComponent
  ]
})
export class CouchDBModule {}
