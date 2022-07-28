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

  customerBillTotal: number | undefined;
  value: number = 0;
  customerBillLeftToPay: number = 0;
  item: any;
  id: any;
  plan: any;
  line: any;


  constructor(private fb: FormBuilder, private payBill: PayBillService, private lineService: LinesService, private planService: PlanService) {
    this.myForm = this.fb.group({
      "phoneNumber": ['', Validators.required],
      "firstName": ['', Validators.required],
      "lastName": ['', Validators.required],
    })
  }

  ngOnInit(): void {
    this.item = localStorage.getItem("account")
    this.id = JSON.parse(this.item).id
    console.log(this.id)
    this.payBill.getBill(this.id).subscribe((data) => {
      this.customerBillTotal = data.body?.phoneBal
    })
  }

  onKey(event: any) {
    this.value = Number(event.target.value);
  }
  onClickPayBill() {
    this.customerBillLeftToPay = (Number(this.customerBillTotal) - Number(this.value));
    // console.log(this.customerBillLeftToPay);

    //need to get plan price 
    this.payBill.payBill(this.id, this.customerBillLeftToPay, 50).subscribe((data) => { this.getPlanPrice() })

  }

  getPlanPrice() {
    this.line = JSON.parse(this.item)
    console.log(this.line.line[0].plan)

    //make a call to plans
    //need to get one plan maybe all plans is fine and then match with this.line.line[0].plan
    this.planService.findAll().subscribe((data)=>{
      if(data.body !== null){
       
      }
     
    })
  }

  payAccountBill() {
  }
}
