import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {
  passWord!: string;
  userName!: string;
  backendUser!: string;
  backendPass!: string;

  public submitLogin(Username: string, Password: string){
    this.userName = Username;
    this.passWord = Password;

    if(Username === this.userName && Password === this.passWord){
      console.log('Login Passed to Backend')
      if(this.userName && this.passWord === this.backendUser && this.backendPass){
        console.log('Login Success!')
      }else{
        alert('Invalid Login Information. \nPlease Try Again or Reset Your Password')
      }
    }
    else{
      if(window.confirm('Login Information Validation Failed \nPlease Report this Message to Development Team.')){

      }else{

      }
      
    }
  }
  constructor(router: Router) { }

  ngOnInit(): void {
  }

}
