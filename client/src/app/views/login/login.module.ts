import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from "@angular/core";

import { MelvinCalendarComponent } from "./melvin-calendar/melvin-calendar.component";
import { MelvinMeteoComponent } from "./melvin-meteo/melvin-meteo.component";
import { FormsModule } from "@angular/forms";

@NgModule({
  imports: [FormsModule],
  exports: [MelvinCalendarComponent, MelvinMeteoComponent],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA,
    MelvinCalendarComponent,
    MelvinMeteoComponent
  ],

  declarations: [MelvinCalendarComponent, MelvinMeteoComponent]
})
export class LoginModule {}
