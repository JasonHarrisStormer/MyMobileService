import { Component, OnInit } from '@angular/core';
import {PLANS} from "../utils/plans";
import {Plan} from '../Plan';
import { Router } from '@angular/router';

@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})
export class PlansComponent implements OnInit {

  plans: Plan[] = [];

  constructor(private router: Router) {

   }

  ngOnInit(): void {
    this.plans = PLANS;
  }

  onButtonClick(plan: Plan){
   const planPrice = plan.price.split("/")[0].split("$")[1]
    const account = localStorage.getItem("account");
    if(account){
      this.router.navigateByUrl('/phones');
      localStorage.setItem("planPrice", planPrice)
    }
    else{
      this.router.navigateByUrl('/login');

    }
    // console.log(plan);
  }

}
