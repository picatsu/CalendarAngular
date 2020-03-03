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
  article: any;
  trafic: ratp;
  rerD: ligne;
  public isCollapsed = true;
  public isCollapsedInfos = true;
  constructor(
    private router: Router,
    private loginService: LoginService,
    private toastr: ToastrService
  ) {
    this.loginService.getNews().subscribe(element => {
      this.article = element;
      console.log(element);
    });
    this.loginService.getTrafic().subscribe((element: ratp) => {
      this.trafic = element;
      console.log(element);
      this.getRerD();
    });
  }

  getRerD() {
    this.trafic.result.rers.forEach(element => {
      if (element.line.includes("D")) {
        this.rerD = element;
      }
    });
  }

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

export interface ligne {
  line: string;
  slug: string;
  title: string;
  message: string;
}

export interface ratp {
  result: {
    metros: ligne[];
    rers: ligne[];
    tramways: ligne[];
  };
  _metadata: any;
}
