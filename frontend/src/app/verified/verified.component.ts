import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-verified',
  templateUrl: './verified.component.html',
  styleUrls: ['./verified.component.css']
})
export class VerifiedComponent implements OnInit {
  loggedIn = false;

  isLoggedIn(){
    //check loggedIn status here
    if (this.loggedIn === true){
      this.route.navigateByUrl('/login'); //change this to the page they were originally going to before auth check
      return this.loggedIn;
    }else{
      this.route.navigateByUrl('/login');
      return this.loggedIn;
    }
  }
  logInSuccess(){
    this.route.navigateByUrl('/login'); //change this to the page they were originally going to before auth check
  }
  loginFail(){
    this.route.navigateByUrl('/login');
  }
  constructor(private route:Router) { }

  ngOnInit(): void {
  }

}
