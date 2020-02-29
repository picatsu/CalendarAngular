import { Component } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Component({
  templateUrl: "Post.component.html"
})
export class PostComponent {
  constructor(private http: HttpClient) {}

  isCollapsed: boolean = false;
  iconCollapse: string = "icon-arrow-up";

  getSwagger() {
    return this.http.get(
      "http://localhost:9090/swagger-ui.html#/general-controller"
    );
  }
  collapsed(event: any): void {
    // console.log(event);
  }

  expanded(event: any): void {
    // console.log(event);
  }

  toggleCollapse(): void {
    this.isCollapsed = !this.isCollapsed;
    this.iconCollapse = this.isCollapsed ? "icon-arrow-down" : "icon-arrow-up";
  }
}
