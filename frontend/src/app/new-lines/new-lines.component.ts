import { Component, OnInit } from '@angular/core';
import { LinesService } from '../services/lines.service';
import { Lines } from '../../models/lines.models';
import { Account } from 'src/models/account.model';

@Component({
  selector: 'app-new-lines',
  templateUrl: './new-lines.component.html',
  styleUrls: ['./new-lines.component.css']
})
export class NewLinesComponent implements OnInit {

  //display in view
  userLines: Lines[]
    = [{
      accountid: 0,
      calleridname: '',
      phoneid: 0,
      phonenumber: '',
      plan: '',
      remphonebal: 0,
      monthphonepay: 0
    }];
    phonePrice: any;
    planPrice: any;
    item: any;
    total: any;
  //passingf this as an input into lines-form-component
  numOfLines: number = 0;


  value: boolean = false;
  constructor(private linesService: LinesService) { }

  //get all lines of current user and display them
  //!hve to get account number of current user by persisting account id when they are logged in
  ngOnInit(): void {
     this.planPrice = localStorage.getItem("planPrice");
     this.phonePrice = localStorage.getItem("phonePrice");

    this.total = JSON.parse(this.phonePrice) + JSON.parse(this.planPrice)
    this.item = localStorage.getItem("account")
    
    const id = JSON.parse(this.item).id


    console.log( id)
    this.linesService.findByAccountNumber(id).subscribe(data => {
      if (data.body !== null) {
        this.userLines = data.body
        // console.log(this.userLines[0]);
      }

    })
  }
  //user wants to add more lines
  onButtonClickIncrement() {
    this.numOfLines += 1;
  }

  //if user clicks yes to adding new lines then this will display the form
  addNewLines() {
    this.value = true;

  }

  undoAddNewLines() {
    this.value = false;
    this.numOfLines = 0;
  }

}
