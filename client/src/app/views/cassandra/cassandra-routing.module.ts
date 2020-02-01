import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { CassandraComponent } from './cassandra.component';
import { DropdownsComponent } from './dropdowns/dropdowns.component';
import { BrandButtonsComponent } from './brand/brand-buttons.component';

const routes: Routes = [
  {
    path: '',
    data: {
      title: 'Cassandra'
    },
    children: [
      {
        path: '',
        redirectTo: 'cassandra'
      },
      {
        path: 'cassandra',
        component: CassandraComponent,
        data: {
          title: 'cassandra'
        }
      },
      {
        path: 'dropdowns',
        component: DropdownsComponent,
        data: {
          title: 'Dropdowns'
        }
      },
      {
        path: 'brand-buttons',
        component: BrandButtonsComponent,
        data: {
          title: 'Brand buttons'
        }
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CassandraRoutingModule {}
