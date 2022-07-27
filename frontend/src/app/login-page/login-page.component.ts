import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { AccountService } from '../services/account.service';
import { AuthService } from '../services/auth.service'
import { User } from '../User';
const bcrypt = require('bcryptjs');

@Component({
  selector: 'app-login-page',
  templateUrl: './login-page.component.html',
  styleUrls: ['./login-page.component.css']
})
export class LoginPageComponent implements OnInit {

  constructor(private fb: FormBuilder,
    private authService: AuthService,
    private accountService: AccountService,
    private router: Router) { }

  LoginForm = this.fb.group({
    "userName": ['', Validators.compose([Validators.required, Validators.email])],
    "passWord": ['', Validators.compose([Validators.required, Validators.maxLength(18)])]
  })
  username: any = '';
  password: any = '';
  bcryptValue: boolean = false;

  submitLogin() {
    if (this.LoginForm.valid) {
      this.username = this.LoginForm.value.userName;

      //get users email and password from server
      this.authService.getCredentials(this.username).subscribe((data) => {
        console.log('Login Passed to Backend')
     
        //compare encrypted pw with users password
        this.password = this.LoginForm.value.passWord;
        this.comparePassword(this.password, data.password).then((value)=>{this.bcryptValue = value}).catch((err) =>
        console.log("Login Failed, Please try again")
        )
       
        console.log(this.bcryptValue)
        if (this.LoginForm.value.userName == data.email && this.bcryptValue) {
          console.log('matched!')
          //retrieve users account info and store it in local storage
          this.getUserAccountInfo(this.username)
          //make a call to get jwt
          this.login(this.username, this.password)
        }
      
        else {
          alert('Invalid Login Information. \nPlease Try Again or Reset Your Password')
        }
        
       
      })
    }
  

  }

  getUserAccountInfo(username: any){
      //get account info and store in local storage
      this.accountService.findByEmail(username).subscribe((data) => {
        console.log(data.body)
        if(data.body !== null){
          localStorage.setItem('account', JSON.stringify(data.body))
        }
      })

  }


  ngOnInit(): void {

  }

  comparePassword = async(password: string, hash: string)  => {
    try{
      return await bcrypt.compare(password, hash)
    } catch(err) {
      console.log(err)
    }
    return false;
  }

  login(email: string, password: string) {
   
      this.authService.login(email, password)

      console.log("User is logged in");
      // navigate to main page
      this.router.navigateByUrl('/main');

    }
  

  // get userName() {
  //   return this.LoginForm.get('userName')!;
  // }

  // get passWord() {
  //   return this.LoginForm.get('passWord')!;
  // }

}