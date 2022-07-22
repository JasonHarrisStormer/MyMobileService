import { Component, OnInit } from '@angular/core';
import { LinesService } from '../services/lines.service';
import {Lines} from '../../models/lines.models';

@Component({
  selector: 'app-new-lines',
  templateUrl: './new-lines.component.html',
  styleUrls: ['./new-lines.component.css']
})
export class NewLinesComponent implements OnInit {

   userLines: Lines[] = [];

  //pass this value to backend when user clicks submit
  numOfLines: number = 0;

  value: boolean = false;
  constructor(private linesService: LinesService) { }

  ngOnInit(): void {
    this.linesService.findAll().subscribe(data => {
     console.log(data.body);
      if(data.body !== null){
        this.userLines = data.body
      }

  })
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
