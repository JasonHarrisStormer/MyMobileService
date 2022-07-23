import { Component, OnInit } from '@angular/core';
import {PLANS} from "../utils/plans";
import {Plan} from '../interfaces/Plan';
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
    this.router.navigateByUrl('/login');
    console.log(plan);
  }

}
