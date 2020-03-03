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

  constructor(
    private router: Router,
    private loginService: LoginService,
    private toastr: ToastrService
  ) {}

  onSubmit() {
    this.loginService.onSubmit(this.credential);
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
