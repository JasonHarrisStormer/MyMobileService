import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-phone-selector',
  templateUrl: './phone-selector.component.html',
  styleUrls: ['./phone-selector.component.css']
})
export class PhoneSelectorComponent implements OnInit {

  selected: string = '';
  color: string = '';
  constructor() { }

  ngOnInit(): void {
    console.log(this.selected);
  }
  getColor(event:any) {
    this.color = event.target.value;
    console.log(this.color)
  }

}
