import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { NgModule } from "@angular/core";
// import { Http, Response, Headers, RequestOptions, URLSearchParams } from '@angular/http';
import { HttpClient } from "@angular/common/http";
import { ToastrService } from "ngx-toastr";
import { Router } from "@angular/router";
// import { HttpModule } from '@angular/http';
// import { AppConst} from '../../constants/app-const';

@NgModule({
  imports: [],
  providers: []
})
@Injectable({
  providedIn: "root"
})
export class LoginService {
  credentialuser = { username: "user", password: "user", role: "user" };
  credentialadmin = { username: "admin", password: "admin", role: "admin" };

  private loggedIn = false;
  public static role: String;
  constructor(
    private router: Router,
    private toastr: ToastrService,
    private http: HttpClient
  ) {}

  getNews() {
    let date = new Date();
    console.log(
      date,
      date.getUTCFullYear(),
      Date.now().toLocaleString(),
      date.getDay()
    );
    return this.http.get(
      "http://newsapi.org/v2/everything?q=ratp&from=2020-02-0" +
        date.getDay() +
        1 +
        "&sortBy=publishedAt&apiKey=d0a2f8408a82466eb670a896d190b985&fbclid=IwAR3y25bl5EeygsxsBaF3BKO3_P03bbU5y5XhTLgDn032KE_337UU7Ff_u6w"
    );
  }
  getTrafic() {
    return this.http.get("https://api-ratp.pierre-grimaud.fr/v4/traffic");
  }
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

  public getMyRole() {
    return LoginService.role;
  }

  public onSubmit(credential: any) {
    if (
      credential.username == this.credentialuser.username &&
      credential.password == this.credentialuser.password
    ) {
      LoginService.role = this.credentialuser.role;
      this.toastr.success(
        " Your Role is : " + LoginService.role,
        "Success ! ",
        {
          timeOut: 1500
        }
      );
      this.router.navigate(["/dashboard"]);
    }
    if (
      credential.username == this.credentialadmin.username &&
      credential.password == this.credentialadmin.password
    ) {
      LoginService.role = this.credentialadmin.role;
      this.toastr.success(
        " Your Role is : " + LoginService.role,
        "Success ! ",
        {
          timeOut: 1500
        }
      );
      this.router.navigate(["/dashboard"]);
    }
    console.log("my role ", LoginService.role);

    /*
    this.loginService.sendCredential(this.credential.username, 
      this.credential.password).subscribe(
        res => {
          
          localStorage.setItem("xAuthToken", res.json().token);
          this.loggedIn = true;
          this.router.navigate(['/dashboard']);
        },
        error => {
          console.log(error);
          location.reload();

        }
      );
    */
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
