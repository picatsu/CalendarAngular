import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

import { PostComponent } from "./post/post.component";
import { UpdateComponent } from "./update/update.component";
import { DeleteComponent } from "./delete/delete.component";
import { GetComponent } from "./get/get.component";

const routes: Routes = [
  {
    path: "",
    data: {
      title: "dbcomponents"
    },
    children: [
      {
        path: "",
        redirectTo: "cards"
      },

      {
        path: "post",
        component: PostComponent,
        data: {
          title: "Post"
        }
      },

      {
        path: "update",
        component: UpdateComponent,
        data: {
          title: "Update"
        }
      },

      {
        path: "get",
        component: GetComponent,
        data: {
          title: "Get"
        }
      },

      {
        path: "delete",
        component: DeleteComponent,
        data: {
          title: "Delete"
        }
      }
    ]
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class DbComponentsRoutingModule {}
