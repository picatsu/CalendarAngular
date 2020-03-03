import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from "@angular/core";

import { MelvinCalendarComponent } from "./melvin-calendar/melvin-calendar.component";
import { MelvinMeteoComponent } from "./melvin-meteo/melvin-meteo.component";
import { FormsModule } from "@angular/forms";
import { HttpClientModule } from "@angular/common/http";
import { LoginService } from "./Login.service";
import { NgbModule } from "@ng-bootstrap/ng-bootstrap";
import { BrowserModule } from "@angular/platform-browser";

@NgModule({
  imports: [FormsModule, HttpClientModule, NgbModule, BrowserModule],
  exports: [MelvinCalendarComponent, MelvinMeteoComponent],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA,
    MelvinCalendarComponent,
    MelvinMeteoComponent
  ],

  declarations: [MelvinCalendarComponent, MelvinMeteoComponent],
  providers: [LoginService]
})
export class LoginModule {}
