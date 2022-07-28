import { Component, OnInit } from '@angular/core';
import { Account } from 'src/models/account.model';

@Component({
  selector: 'app-landing',
  templateUrl: './landing.component.html',
  styleUrls: ['./landing.component.css']
})
export class LandingComponent implements OnInit {

  account: String | null | undefined;
  constructor() { }

  ngOnInit(): void {
    this.account = localStorage.getItem("account")
    let i : Number = 0;
    if(this.account != null){
      if (i = 0){
        window.location.reload();
        i = 1;
      }
    }else{
      i = 0;
    }
   console.log(this.account)
  }
  
}
