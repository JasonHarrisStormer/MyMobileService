import { Component, Input, OnInit } from '@angular/core';
import { Account } from 'src/models/account.model';

@Component({
  selector: 'app-accountdetails',
  templateUrl: './accountdetails.component.html',
  styleUrls: ['./accountdetails.component.css']
})
export class AccountdetailsComponent implements OnInit {

  @Input() account?: Account;

  constructor() { }

  ngOnInit(): void {
  }

}
