import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { environment } from "../../../../environments/environment";
import { Un_Etudiant } from "../model/un_etudiant";
@Injectable({
  providedIn: "root"
})
export class DashboardService {
  activedb: string = "mongo";
  constructor(private http: HttpClient) {}

  public setActivedb(db: string) {
    this.activedb = db;
  }
  getD() {
    return this.http.get(
      environment.apiUrl +
        "api/getelodie?dbName=" +
        this.activedb +
        "&value=l1_gr7"
    );
  }

  getCustomSeance(value: string) {
    return this.http.get(
      environment.apiUrl +
        "api/getseance?dbName=" +
        this.activedb +
        "&value=" +
        value
    );
  }

  getbyId(tablename: string, id: string) {
    if (tablename == "UN_ETUDIANT") {
      return this.http.get<Un_Etudiant>(
        environment.apiUrl +
          "api/getbyid?dbName=" +
          this.activedb +
          "&tableName=" +
          tablename +
          "&id=" +
          id
      );
    }
  }
}
