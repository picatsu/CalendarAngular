import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatButtonModule, MatIconModule, MatSlideToggleModule } from '@angular/material';

import { DashboardComponent } from './dashboard.component';
import { TileComponent } from './tile/tile.component';
import { ThemeService } from './services/theme.service';
import { FormsModule } from '@angular/forms';
import { FilterPipe } from './services/filter.pipe';
import { ExtractComponent } from './extract/extract.component';
import { ScrollingModule } from '@angular/cdk/scrolling';
import {MatDividerModule} from '@angular/material/divider';
import { SocketIoModule, SocketIoConfig } from 'ngx-socket-io';

const config: SocketIoConfig = { url: 'http://localhost:3000', options: {} };


@NgModule({
  imports: [
    CommonModule,
    MatButtonModule,
    MatIconModule,
    MatSlideToggleModule,
    FormsModule,
    ScrollingModule,
    MatDividerModule,
    SocketIoModule.forRoot(config),
    
    
  ],
  declarations: [ DashboardComponent, TileComponent, FilterPipe, ExtractComponent ],
  exports: [ DashboardComponent ],
  bootstrap: [ DashboardComponent ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  providers: [ ThemeService]
})
export class DashboardModule { }
