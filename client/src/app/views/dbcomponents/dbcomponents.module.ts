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
import { DbComponentsRoutingModule } from "./dbcomponents-routing.module";
import { PostComponent } from "./post/post.component";
import { UpdateComponent } from "./update/update.component";
import { DeleteComponent } from "./delete/delete.component";
import { GetComponent } from "./get/get.component";
import { HttpClientModule } from "@angular/common/http";

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    HttpClientModule,
    DbComponentsRoutingModule,
    BsDropdownModule.forRoot(),
    TabsModule,
    CarouselModule.forRoot(),
    CollapseModule.forRoot(),
    PaginationModule.forRoot(),
    PopoverModule.forRoot(),
    ProgressbarModule.forRoot(),
    TooltipModule.forRoot()
  ],
  declarations: [PostComponent, GetComponent, UpdateComponent, DeleteComponent]
})
export class DbComponentsModule {}
