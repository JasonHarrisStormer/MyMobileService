import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthService } from '../services/auth.service'

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  LoginForm = this.fb.group({
    "userName": ['', Validators.compose([Validators.required, Validators.email])],
    "passWord": ['', Validators.compose([Validators.required, Validators.maxLength(18)])]
  })
  backendUser: String = "";
  backendPass: String = "";

  submitLogin() {
    // console.log(this.LoginForm.value)
    // console.log(this.userName, this.passWord)
    if (this.passWord != null && this.userName != null) {
      console.log('Login Passed to Backend')
      // console.log(this.LoginForm.value)
      if (this.LoginForm.value.userName === this.backendUser && this.LoginForm.value.passWord === this.backendPass) {
        console.log('Login Success!')
        this.login()
      } else {
        alert('Invalid Login Information. \nPlease Try Again or Reset Your Password')
      }
    }
    else {
      if (window.confirm('Login Information Validation Failed \nPlease Report this Message to Development Team.')) {

      } else {

      }

    }
  }
  constructor(private fb: FormBuilder,
    private authService: AuthService,
    private router: Router) { }

  ngOnInit(): void {

  }

  login() {
    const val = this.LoginForm.value

    if (val.userName && val.passWord) {
      this.authService.login(val.userName, val.passWord)

      console.log("User is logged in");
      //navigate to main page
      this.router.navigateByUrl('/main');

    }
  }

  get userName() {
    return this.LoginForm.get('userName')!;
  }

  get passWord() {
    return this.LoginForm.get('passWord')!;
  }
}
