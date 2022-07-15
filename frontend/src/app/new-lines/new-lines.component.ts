import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-lines',
  templateUrl: './new-lines.component.html',
  styleUrls: ['./new-lines.component.css']
})
export class NewLinesComponent implements OnInit {

  increment: number = 0;
  constructor() { }

  ngOnInit(): void {
  }

  onButtonClickIncrement(){
    this.increment += 1;
  }

}
