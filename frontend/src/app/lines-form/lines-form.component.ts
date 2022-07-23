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
  accountId: number = 0;
  remPhoneBal: number = 0;
  userFormData: Lines = {
    accountId: 0,
    phoneNumber: 0,
    phoneId: 0,
    callerIdName: '',
    remPhoneBal: 0,
    plan: ''
  };

  constructor(private fb: FormBuilder,
    private linesService: LinesService,
    private accountService: AccountService) {
    this.numOfLines = this.numOfLines
    this.myForm = this.fb.group({
      "phoneNumber": ['', Validators.required],
      "accountId": ['', Validators.required],
      "plan": ['', Validators.required],
      "phoneId": ['', Validators.required],
      "callerId": ['', Validators.required]
      // "numberOfNewLines": ['', Validators.required],
    })
  }

  ngOnInit(): void {
  }

  //get current users phoneLine remPhoneBal and add that to addPhoneLine function
  getUsersPhoneLineInfo(){
    this.accountId = this.myForm.value.accountId;
    this.linesService.findOne(this.accountId).subscribe((res) => {
      // if(res.data !== null){
        console.log(res)

        //!add this.remainingBalance to addPhoneLine fuction
        // this.remPhoneBal = res.data.remPhoneBal
    })
      
  }


  //add new line to db
  addPhoneLine() {
    //!create object with all values needed for phoneLines table
    // this.userFormData= {...this.myForm.value, this.remPhoneBal};
    // this.linesService.save(this.myForm.value).subscribe((res) => { console.log(res) })

    //add numOfLines to the users account
    this.updateAccountLines()

  }

  //update numOfLines in account Entity
  updateAccountLines() {
    console.log(this.numOfLines)
    // accountId = this.myForm.value.accountId;
    // this.accountService.updateAccount(accountId,lines).subscribe((res) => {console.log(res)})
  }

}
