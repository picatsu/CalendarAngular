import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { environment } from "../../../../environments/environment";
import { Un_Etudiant } from "../model/un_etudiant";
@Injectable({
  providedIn: "root"
})
export class DashboardService {
  constructor(private http: HttpClient) {}

  getD() {
    return this.http.get(
      environment.apiUrl + "api/getelodie?dbName=mongo&value=l1_gr7"
    );
  }

  getCustomSeance(value: string) {
    return this.http.get(
      environment.apiUrl + "api/getseance?dbName=mongo&value=" + value
    );
  }

  getbyId(tablename: string, id: string) {
    if (tablename == "UN_ETUDIANT") {
      return this.http.get<Un_Etudiant>(
        environment.apiUrl +
          "api/getbyid?dbName=mongo&tableName=" +
          tablename +
          "&id=" +
          id
      );
    }
  }
}
