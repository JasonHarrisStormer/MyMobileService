import { Component, OnInit } from '@angular/core';
import {PLANS} from "../utils/plans";
import {Plan} from '../Plan';

@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})
export class PlansComponent implements OnInit {

  plans: Plan[] = [];

  constructor() {

   }

  ngOnInit(): void {
    this.plans = PLANS;

    console.log(this.plans)
  }

  onButtonClick(plan: Plan){
    console.log(plan)
  }

}
