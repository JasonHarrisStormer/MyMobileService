import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LinesService } from '../services/lines.service';
import { Lines } from '../../models/lines.models';
// import {Account} from '../../models/lines.account'
import { AccountService } from '../services/account.service';
//*This component displays a list of lines of current user
//* adds new lines to the db
//*and  updates account lines of current user

@Component({
  selector: 'app-lines-form',
  templateUrl: './lines-form.component.html',
  styleUrls: ['./lines-form.component.css']
})
export class LinesFormComponent implements OnInit {

  @Input() numOfLines: number = 0;
  myForm: FormGroup;
  phoneNumber: string = '';

  userLineData: Lines = {
    accountid: 0,
    phonenumber: '',
    phoneid: 0,
    calleridname: '',
    remphonebal: 0,
    plan: ''
  };

  constructor(private fb: FormBuilder,
    private linesService: LinesService,
    private accountService: AccountService) {
    this.numOfLines = this.numOfLines
    this.myForm = this.fb.group({
      "phoneNumber": ['', Validators.required],
      // "accountId": ['', Validators.required],
      // "plan": ['', Validators.required],
      // "phoneId": ['', Validators.required],
      // "callerId": ['', Validators.required]
      // "numberOfNewLines": ['', Validators.required],
    })
  }

  ngOnInit(): void {
    console.log(this.numOfLines)
  }

  


  //add new line to db
  addPhoneLine() {
   
    //add numOfLines to the users account
    this.linesService.updatePhoneBalance(this.myForm.value.phoneNumber, this.numOfLines)

  }

  //update numOfLines in account Entity
  //!we need to pass the whole lines object <lines type> to account
  updateAccountLines() {
    console.log(this.numOfLines)
    // console.log(this.userLineData)
    // accountId = this.myForm.value.accountId;
    // this.accountService.updateAccount(this.).subscribe((res) => {console.log(res)})
  }

}
