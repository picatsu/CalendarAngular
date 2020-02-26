import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: "root"
})
export class DashboardService {
  constructor(private http: HttpClient) {}

  getD() {
    return this.http.get(
      "http://localhost:9090/api/getelodie?dbName=mongo&value=l1_gr7"
    );
  }
}
