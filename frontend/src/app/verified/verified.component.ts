import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-verified',
  templateUrl: './verified.component.html',
  styleUrls: ['./verified.component.css']
})
export class VerifiedComponent implements OnInit {
  loggedIn = false;
  
  isLoggedIn(){
    //check loggedIn status
    if (this.loggedIn === true){
      return this.loggedIn;
    }else{
      //navigate to login page
      return this.loggedIn;
    }
  }
  logInSuccess(){

  }
  loginFail(){

  }
  constructor() { }

  ngOnInit(): void {
  }

}
