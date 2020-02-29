import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { NgModule } from "@angular/core";
// import { Http, Response, Headers, RequestOptions, URLSearchParams } from '@angular/http';
import { HttpClientModule } from "@angular/common/http";
// import { HttpModule } from '@angular/http';
// import { AppConst} from '../../constants/app-const';

@NgModule({
  imports: [],
  providers: []
})
@Injectable({
  providedIn: "root"
})
@Injectable()
export class LoginService {
  constructor() {}

  sendCredential(username: string, password: string) {
    // let url = AppConst.serverPath+"/token";
    let encodedCredentials = btoa(username + ":" + password);
    let basicHeader = "Basic " + encodedCredentials;
    let headers = new Headers({
      "Content-Type": "application/x-www-form-urlencoded",
      Authorization: basicHeader
    });
    return "";
    // return this.http.get(url, {headers: headers});
  }

  getRole() {
    // let url = AppConst.serverPath+"/user/getRole";

    let headers = new Headers({
      "x-auth-token": localStorage.getItem("xAuthToken")
    });
    return "";
    // return this.http.get(url, {headers: headers});
  }

  checkSession() {
    // let url = AppConst.serverPath+"/checkSession";

    let headers = new Headers({
      "x-auth-token": localStorage.getItem("xAuthToken")
    });
    return "";
    // return this.http.get(url, {headers: headers});
  }

  logout() {
    // let url = AppConst.serverPath+"/logout";

    let headers = new Headers({
      "x-auth-token": localStorage.getItem("xAuthToken")
    });
    return "";
    // return this.http.post(url, '', {headers: headers});
  }
}
