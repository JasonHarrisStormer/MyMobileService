import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Params } from '@angular/router';
import { Account } from 'src/models/account.model';
import { AccountService } from '../services/account.service';

@Component({
  selector: 'app-accountdetailsnav',
  templateUrl: './accountdetailsnav.component.html',
  styleUrls: ['./accountdetailsnav.component.css']
})
export class AccountdetailsnavComponent implements OnInit {
  account: Account = new Account('', 0, '', '', '','','','', 0, []);

  // use this to grab the active route and get the information from it
  constructor(private activeRoute: ActivatedRoute, private accountService: AccountService) { }

  ngOnInit(): void {
    this.activeRoute.params.subscribe((params: Params) => {
      this.accountService.find(params['id']).subscribe(data => {
        if (data.body != null) {
          this.account = data.body;
        }
      })
    });
  }
}
