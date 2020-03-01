import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class ServiceService {
  constructor(private http: HttpClient) {}

  postData(dbname: string, tablename: string) {}
  getSwagger() {
    return this.http.get(
      "http://localhost:9090/swagger-ui.html#/general-controller"
    );
  }
}
