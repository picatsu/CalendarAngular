import { Component } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { ServiceService } from "../service.service";

@Component({
  templateUrl: "Post.component.html"
})
export class PostComponent {
  constructor(private service: ServiceService, private http: HttpClient) {}

  isCollapsed: boolean = false;
  iconCollapse: string = "icon-arrow-up";

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
