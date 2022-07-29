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

  balPhone : number = 0;
  monthPay : number | undefined;
  customerBillTotal: number | undefined;
  newCustomerBillTotal: number | undefined;
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
    this.customerBillLeftToPay = (Number(this.customerBillTotal) - Number(this.value));
    // console.log(this.customerBillLeftToPay);
    this.getPlanPrice();
    //need to get plan price 
    this.payBill.payBill(this.id, this.customerBillLeftToPay, 50).subscribe((data) => { this.getPlanPrice() })

  }

  getPlanPrice() {
    this.line = JSON.parse(this.item)

    //make a call to plans
    //need to get one plan maybe all plans is fine and then match with this.line.line[0].plan
    this.lineService.findByAccount(this.line.line[0].accountid).subscribe((data) => {
      if(data.body !== null){
        this.balPhone = (Number(data.body.remphonebal));
        this.planService.findById(this.line.line[0].plan).subscribe((data)=>{
          if(data.body !== null){
            this.monthPay = (Number(data.body.price));
            this.newCustomerBillTotal =  this.monthPay + this.balPhone;
            this.customerBillTotal = this.newCustomerBillTotal;
          }
        })
      }
    });
  }

  billTotal() {
  console.log( this.planPrice)
    this.totalBill = Number(this.customerBillTotal) + Number(this.planPrice)
    // console.log(this.totalBill)
  }
}
