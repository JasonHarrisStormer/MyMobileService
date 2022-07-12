import { Component, OnInit } from '@angular/core';
import { StorageService } from '../storage.service';
// import {setPlans, getPlans} from "../utils/storage.js"
import * as data from "../utils/plans.json";
import {Plan} from '../Plan'
@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})
export class PlansComponent implements OnInit {

  plans: Plan;

  constructor(private plansStorage: StorageService) {
    this.plans = {
      type: "",
      price: "",
      properties: "",
      access: "",
      hotspot: "",
      text: "",
      streaming : ""
  }
   }

  ngOnInit(): void {
    this.plansStorage.setPlans("plans", data )
    const plans = this.plansStorage.getPlans("plans")

    console.log(plans)
  }

}
