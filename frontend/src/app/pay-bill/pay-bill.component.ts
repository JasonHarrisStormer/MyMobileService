import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-pay-bill',
  templateUrl: './pay-bill.component.html',
  styleUrls: ['./pay-bill.component.css']
})
export class PayBillComponent implements OnInit {

  myForm: FormGroup;

  //use a service to fetch the user/customers bill
  customerBillTotal: Number = 134;
  value: Number = 0;
  customerBillLeftToPay: Number = 0;


  //make a call to backend to get customers account details like bill totals

  //dipslay bills for each plan seperatly or together?

  //have a display of bill due date


  constructor(private fb: FormBuilder) {
    this.myForm = this.fb.group({
      "phoneNumber": ['', Validators.required],
      "firstName": ['', Validators.required],
      "lastName": ['', Validators.required],
    })
  }

  ngOnInit(): void {
  }

  onKey(event: any) {
    this.value = Number(event.target.value);
  }
  onClickPayBill() {
    this.customerBillLeftToPay = (Number(this.customerBillTotal) - Number(this.value));
    console.log(this.customerBillLeftToPay);

  }

}
