import { Component, OnInit } from "@angular/core";
import { Router } from "@angular/router";
import { LoginService } from "./Login.service";
import { NgModule } from "@angular/core";
// import { Http, Response, Headers, RequestOptions, URLSearchParams } from '@angular/http';
import { HttpClientModule } from "@angular/common/http";
import { ToastrService } from "ngx-toastr";

@Component({
  selector: "app-login",
  styleUrls: ["./login.component.css"],
  templateUrl: "login.component.html",
  providers: [LoginService]
})
export class LoginComponent implements OnInit {
  credential = { username: "", password: "" };
  credentialuser = { username: "user", password: "user", role: "user" };
  credentialadmin = { username: "admin", password: "admin", role: "admin" };

  private loggedIn = false;
  public role: String;

  constructor(
    private router: Router,
    private loginService: LoginService,
    private toastr: ToastrService
  ) {}

  onSubmit() {
    if (
      this.credential.username == this.credentialuser.username &&
      this.credential.password == this.credentialuser.password
    ) {
      this.role = this.credentialuser.role;
      this.toastr.success(" Your Role is : " + this.role, "Success ! ", {
        timeOut: 1500
      });
      this.router.navigate(["/dashboard"]);
    }
    if (
      this.credential.username == this.credentialadmin.username &&
      this.credential.password == this.credentialadmin.password
    ) {
      this.role = this.credentialadmin.role;
      this.toastr.success(" Your Role is : " + this.role, "Success ! ", {
        timeOut: 1500
      });
      this.router.navigate(["/dashboard"]);
    } else {
      this.toastr.error(" Please Request Acces ", "Cannot Access", {
        timeOut: 1500
      });
    }
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

  ngOnInit() {
    /*
    this.loginService.checkSession().subscribe(
      res => {
        this.loggedIn = true;
      },
      error => {
        this.loggedIn = false;
      }
    );
    */
  }
}
