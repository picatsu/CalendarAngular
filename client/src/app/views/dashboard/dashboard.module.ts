import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from "@angular/core";
import { FormsModule } from "@angular/forms";
import { ChartsModule } from "ng2-charts";
import { BsDropdownModule } from "ngx-bootstrap/dropdown";
import { ButtonsModule } from "ngx-bootstrap/buttons";

import { DashboardComponent } from "./dashboard.component";
import { DashboardRoutingModule } from "./dashboard-routing.module";
import { FullCalendarModule } from "primeng/fullcalendar";
import { NgbModalModule } from "@ng-bootstrap/ng-bootstrap";
import { CommonModule } from "@angular/common";
import { FlatpickrModule } from "angularx-flatpickr";
import { CalendarModule, DateAdapter } from "angular-calendar";
import { adapterFactory } from "angular-calendar/date-adapters/date-fns";
import { MyCalendarComponent } from "./calendar/MyCalendar.component";
import { HttpClientModule } from "@angular/common/http";
import { DashboardService } from "./service/dashboard.service";

@NgModule({
  imports: [
    FormsModule,
    DashboardRoutingModule,
    ChartsModule,
    BsDropdownModule,
    FullCalendarModule,
    ButtonsModule.forRoot(),
    HttpClientModule,
    CommonModule,
    NgbModalModule,
    FlatpickrModule.forRoot(),
    CalendarModule.forRoot({
      provide: DateAdapter,
      useFactory: adapterFactory
    })
  ],
  declarations: [DashboardComponent, MyCalendarComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA, MyCalendarComponent],
  exports: [MyCalendarComponent],
  providers: [DashboardService]
})
export class DashboardModule {}
