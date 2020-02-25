import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { FormsComponent } from "./forms/forms.component";
import { TabsComponent } from "./tabs/tabs.component";
import { TooltipsComponent } from "./tooltips/tooltips.component";
import { SwitchesComponent } from "./switches/switches.component";

const routes: Routes = [
  {
    path: "",
    data: {
      title: "couchdb"
    },
    children: [
      {
        path: "",
        redirectTo: "cards"
      },

      {
        path: "forms",
        component: FormsComponent,
        data: {
          title: "Forms"
        }
      },

      {
        path: "tabs",
        component: TabsComponent,
        data: {
          title: "Tabs"
        }
      },

      {
        path: "switches",
        component: SwitchesComponent,
        data: {
          title: "Switches"
        }
      },

      {
        path: "tooltips",
        component: TooltipsComponent,
        data: {
          title: "Tooltips"
        }
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class CouchdbRoutingModule {}
