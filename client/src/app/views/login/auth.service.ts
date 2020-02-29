import { Injectable } from "@angular/core";
// import {Observable} from 'rxjs/Observable';
import { HttpClient, HttpHeaders } from "@angular/common/http";
//import { AppConst } from '../../constants/app-const';

@Injectable()
export class AuthService {
  constructor(private http: HttpClient) {}

  attemptAuth(ussername: string, password: string) {
    const credentials = { username: ussername, password: password };
    console.log("attempAuth ::");
    return "";
    // return this.http.post(AppConst.serverPath+'/token/generate-token', credentials);
  }
}
