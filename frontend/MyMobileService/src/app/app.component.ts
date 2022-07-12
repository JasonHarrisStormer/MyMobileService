import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'MyMobileService';

  //define drop down menu json info
  public sites: { [key: string]: Object; }[] = [
 
    { Name: 'Home', address: 'landing' },

    { Name: 'Login', address: 'login' },

    { Name: 'Account Management', address: 'account' },

    { Name: 'Phones', address: 'phones' },

    { Name: 'Plans', address: 'plans' }

];

  //mapping local data to fields property
  public localFields: Object = {text: 'Name', value: 'address'};

  //set the placeholder
  public localWaterMark: string = 'Goto: ';
}