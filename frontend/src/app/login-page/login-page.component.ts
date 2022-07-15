import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  LoginForm = this.fb.group({
    "userName":['', Validators.compose([Validators.required, Validators.email])],
    "passWord": ['', Validators.compose([Validators.required, Validators.maxLength(18)])]
  })
  backendUser: any;
  backendPass: boolean | undefined;
  
  submitLogin(){
    console.log(this.LoginForm.value)
    if(this.passWord != null && this.userName != null){
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
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  get userName() {
    return this.LoginForm.get('userName')!;
  }

  get passWord() {
    return this.LoginForm.get('passWord')!;
  }
}
