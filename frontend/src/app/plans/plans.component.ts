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

    console.log(this.plans)
  }

  onButtonClick(plan: Plan){
    const account = localStorage.getItem("account");
    localStorage.setItem("planPrice", plan.price)
    if(account){
      this.router.navigateByUrl('/phones');
    }
    else{
      this.router.navigateByUrl('/login');

    }
    console.log(plan);
  }

}
