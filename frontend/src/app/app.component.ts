import { Component, OnInit } from '@angular/core';
import { Router, UrlTree } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'MyMobileService';

  //define drop down menu json info
  public sites: { [key: string]: Object; }[] = [
 
    { Name: 'Home', address: 'main' },

    { Name: 'Login', address: 'login' },

    { Name: 'Account Management', address: 'account' },

    { Name: 'Phones', address: 'phones' },

    { Name: 'Plans', address: 'plans' },

    { Name: 'New Customer', address: 'new-cx' },

    { Name: 'Cancel Lines', address: 'cancelLines' },

    { Name: 'Pay Your Bill', address: 'paybill' },

    { Name: 'Apply to work with us!', address: 'careers' },

];

  //mapping local data to fields property
  public localFields: Object = {text: 'Name', value: 'address'};

  //set the placeholder
  public localWaterMark: string = 'Goto: ';

  clientHeight: number;

  loginItem :any;
  isLoggedIn : boolean = false;
  ngOnInit(): void {
    this.loginItem = localStorage.getItem("account");
   
   const id = JSON.parse(this.loginItem);
   console.log(id);
   if(id!=null)
   this.isLoggedIn=true;
    else
    this.isLoggedIn=false;
    console.log(this.isLoggedIn);
 }
 constructor(private router: Router) {
    this.clientHeight = window.innerHeight; 
 }
 public dropClick(event: { itemData: { address: string | UrlTree; }; }) {
    this.router.navigateByUrl(event.itemData.address)  
 }

 public logoff(){
  localStorage.clear();
  console.log("clicked");
 }
}