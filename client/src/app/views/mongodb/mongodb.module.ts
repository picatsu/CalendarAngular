import { NgModule } from '@angular/core';

import { CoreUIIconsComponent } from './coreui-icons/coreui-icons.component';
import { FlagsComponent } from './flags/flags.component';
import { FontAwesomeComponent } from './font-awesome/font-awesome.component';
import { SimpleLineIconsComponent } from './simple-line-icons/simple-line-icons.component';

import { MongodbRoutingModule } from './mongodb-routing.module';
import {AppModule} from '../../app.module';

@NgModule({
  imports: [MongodbRoutingModule, AppModule],
  declarations: [
    CoreUIIconsComponent,
    FlagsComponent,
    FontAwesomeComponent,
    SimpleLineIconsComponent
  ]
})
export class MongodbModule { }
