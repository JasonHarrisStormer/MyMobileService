import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-pay-bill',
  templateUrl: './pay-bill.component.html',
  styleUrls: ['./pay-bill.component.css']
})
export class PayBillComponent implements OnInit {

customerBillTotal: Number = 134;
value: Number = 0;
customerBillLeftToPay: Number = 0;
phoneNumber: string = "";
firstName: string = "";
lastName: string = "";

  //make a call to backend to get customers account details

  //dipslay bills for each plan seperatly or together?

  //have a display of when bill is due


  constructor() { }

  ngOnInit(): void {
  }

  onKey(event: any) { 
    this.value = Number(event.target.value);
  }
  onClickPayBill(){
   this.customerBillLeftToPay = (Number(this.customerBillTotal) - Number(this.value));
    console.log(this.customerBillLeftToPay);

  }

}
