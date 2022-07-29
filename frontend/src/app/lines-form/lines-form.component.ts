import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LinesService } from '../services/lines.service';
import { Lines } from '../../models/lines.models';
// import {Account} from '../../models/lines.account'
import { AccountService } from '../services/account.service';
import { ColdObservable } from 'rxjs/internal/testing/ColdObservable';
//*This component displays a list of lines of current user
//* adds new lines to the db

@Component({
  selector: 'app-lines-form',
  templateUrl: './lines-form.component.html',
  styleUrls: ['./lines-form.component.css']
})
export class LinesFormComponent implements OnInit {

  @Input() numOfLines: number = 0;
  myForm: FormGroup;
  phoneNumber: string = '';
  @Input() planPrice: number = 0;
  @Input() phonePrice: number = 0;

userLineData: Lines = {
    accountid: 0,
    phonenumber: '',
    phoneid: 0,
    calleridname: '',
    remphonebal: 0,
    plan: 0,
    monthphonepay: 0
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
    console.log(this.numOfLines)
  }

  


  //add new line to db
  addPhoneLine() {
    this.myForm.value.remphonebal = Number(this.phonePrice);
    this.myForm.value.monthphonepay = Number(this.planPrice);
    
    console.log(this.myForm.value)
    this.linesService.addPhoneLine(this.myForm.value).subscribe((data)=>{
      console.log(data)
      console.log("I am here")
    })

  }

}
