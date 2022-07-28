import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';

@Component({
  selector: 'app-phone-selector',
  templateUrl: './phone-selector.component.html',
  styleUrls: ['./phone-selector.component.css']
})
export class PhoneSelectorComponent implements OnInit {

  selected: string = '';
  color: string = '';
  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  getColor(event:any) {
    console.log(this.selected);
    this.color = event.target.value;
    console.log(this.color)
  }

  cost(event:any){
    console.log(Number(event.target.value))
    localStorage.setItem("phonePrice", event.target.value)
  }

  submit(){
    this.router.navigateByUrl("/new-lines")
  }

}
