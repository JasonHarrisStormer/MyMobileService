import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LinesService } from '../services/lines.service';
import { PayBillService } from '../services/pay-bill.service';
import { Lines } from 'src/models/lines.models';
import { PlanService } from '../services/plan.service';
import { Plan } from '../Plan';
import { PhoneService } from '../services/phone.service';
import { Phones } from 'src/models/phones.model';
import { Router } from '@angular/router';
@Component({
  selector: 'app-pay-bill',
  templateUrl: './pay-bill.component.html',
  styleUrls: ['./pay-bill.component.css']
})
export class PayBillComponent implements OnInit {

  myForm: FormGroup;

  customerBillTotal: number = 0;
  newCustomerBillTotal: number | undefined;
  value: number = 0;
  customerBillLeftToPay: number = 0;
  item: any;
  id: any;
  plan: any;
  line: any;
  planPrice: number = 0;
  totalBill: number = 0;
  phonePrice: number = 0;
  phonePrice2: Phones[] = [{
    id: 0,
    manufacterer: "",
    model: "",
    memory: "",
    price: 0,
    colors: ""
  }]

  constructor(
    private router: Router,
    private fb: FormBuilder, 
    private payBill: PayBillService, private lineService: LinesService,
     private planService: PlanService, private phoneService: PhoneService) {
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

      if (data.body?.phoneBal === undefined) {
        this.customerBillTotal = 0

      } else {
        this.customerBillTotal = data.body?.balance + data.body?.phoneBal
        
      }

      //get users plan price
      this.getPlanPrice();
      
    
    })


  }

  onKey(event: any) {
    this.value = Number(event.target.value);
  }
  onClickPayBill() {
    localStorage.setItem("month", JSON.stringify(true))

    this.customerBillLeftToPay = this.totalBill - Number(this.value);
    // console.log(this.customerBillLeftToPay);
    //need to get plan price 
    this.payBill.payBill(this.id, this.customerBillLeftToPay, 0).subscribe((data) => {
      // this.customerBillTotal = data.phoneBal
    })
     
      this.router.navigateByUrl("/main")
      

  }

  getPlanPrice() {
    this.line = JSON.parse(this.item)
    let total = 0;
   
    //make a call to plans
    //need to get one plan maybe all plans is fine and then match with this.line.line[0].plan
    this.lineService.findByAccountNumber(1).subscribe((data) => {
      if (data.body !== null) {

        data?.body.forEach(element => {
          this.planService.findById(Number(element.plan)).subscribe((data) => {
            total = Number(data.body?.price)
            this.planPrice += total
          })
        });
        this.getPhonePrice()
        this.billTotal()
      }

    
    })
  

  }

  billTotal() {
    // console.log(Number(this.customerBillTotal), this.planPrice)
    const value = Boolean(localStorage.getItem("month"));
    if(!value){
      this.totalBill = Number(this.customerBillTotal)
    } else{
      this.totalBill = Number(this.customerBillTotal) + Number(this.planPrice) + Number(this.phonePrice)

    }
  }

  getPhonePrice() {
    this.line = JSON.parse(this.item)
    // this.line.id
    let total = 0;
   this.lineService.findByAccountNumber(1).subscribe((data) => {
      if (data.body !== null) {

        data?.body.forEach(element => {
          console.log(element.phoneid)


          this.phoneService.findByNumber(Number(element.phoneid)).subscribe((data) => {
            if (data.body !== null) {
          
              this.phonePrice += Number((data.body.price / 36).toFixed(2))



            }

          })


        })
      }

    })
  }
  newMonth(){
    localStorage.setItem("month", JSON.stringify(false))
  }
}
