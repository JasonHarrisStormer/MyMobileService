import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-new-lines',
  templateUrl: './new-lines.component.html',
  styleUrls: ['./new-lines.component.css']
})
export class NewLinesComponent implements OnInit {

  //pass this value to backend when user clicks submit
  numOfLines: number = 0;

  value: boolean = false;
  constructor() { }

  ngOnInit(): void {
  }

  onButtonClickIncrement(){
    this.numOfLines += 1;
  }

  addNewLines(){

    this.value = true;

  }
  undoAddNewLines(){

    this.value = false;
    this.numOfLines = 0;
  }

}
