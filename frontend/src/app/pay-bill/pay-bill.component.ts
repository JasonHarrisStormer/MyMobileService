import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LinesService } from '../services/lines.service';
import { PayBillService } from '../services/pay-bill.service';
import { Lines } from 'src/models/lines.models';
import { PlanService } from '../services/plan.service';
import { Plan } from '../Plan';
@Component({
  selector: 'app-pay-bill',
  templateUrl: './pay-bill.component.html',
  styleUrls: ['./pay-bill.component.css']
})
export class PayBillComponent implements OnInit {

  myForm: FormGroup;

  customerBillTotal: number | undefined = 0;
  value: number = 0;
  customerBillLeftToPay: number = 0;
  item: any;
  id: any;
  plan: any;
  line: any;
  planPrice: number = 0;
  totalBill: number = 0;

  constructor(private fb: FormBuilder, private payBill: PayBillService, private lineService: LinesService, private planService: PlanService) {
    this.myForm = this.fb.group({
      "phoneNumber": ['', Validators.required],
      "firstName": ['', Validators.required],
      "lastName": ['', Validators.required],
    })
  }

  ngOnInit(): void {
    //get users account data
    this.item = localStorage.getItem("account")
    this.id = JSON.parse(this.item).id

    //get users phoneBal 
    this.payBill.getBill(this.id).subscribe((data) => {

      this.customerBillTotal = data.body?.phoneBal
      // console.log(this.customerBillTotal)

      //get users plan price
      this.getPlanPrice();
      //calculate total bill
    })


  }

  onKey(event: any) {
    this.value = Number(event.target.value);
  }


  onClickPayBill() {
    this.customerBillLeftToPay = (this.totalBill) - Number(this.value);
    // console.log(this.customerBillLeftToPay)

    this.billTotal()
    //pay bill
    this.payBill.payBill(this.id, this.customerBillLeftToPay, this.planPrice).subscribe((data) => {console.log(data)})


  }

  getPlanPrice() {
    this.line = JSON.parse(this.item)

    //make a call to plans
    this.planService.findOne(this.line.line[0].plan).subscribe((data) => {
      if (data.body !== null) {
        this.planPrice = Number(data.body.price)
        // console.log(this.planPrice)
      }

    })

  }

  billTotal() {
  console.log( this.planPrice)
    this.totalBill = Number(this.customerBillTotal) + Number(this.planPrice)
    // console.log(this.totalBill)
  }
}
