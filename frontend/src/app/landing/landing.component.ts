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
   console.log(this.account)
  }
  
}
