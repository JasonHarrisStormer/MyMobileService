import { Component, OnInit } from '@angular/core';
import {setPlans, getPlans} from "../utils/storage.js"
// import * as data from "../utils/plans.json"
@Component({
  selector: 'app-plans',
  templateUrl: './plans.component.html',
  styleUrls: ['./plans.component.css']
})
export class PlansComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  setPlans("plans", data.plan1);
    const plans = getPlans("plans")
    console.log(plans)
  }

}
