import { Component } from '@angular/core';
import { Router, UrlTree } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
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


 constructor(private router: Router) {
    this.clientHeight = window.innerHeight; 
 }
 public dropClick(event: { itemData: { address: string | UrlTree; }; }) {
    this.router.navigateByUrl(event.itemData.address)  
 }
}