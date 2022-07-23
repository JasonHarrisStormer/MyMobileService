import { Component, OnInit } from '@angular/core';
import {LinesService} from '../services/lines.service';
import { Line } from '../interfaces/LIne'
@Component({
  selector: 'app-cancel-lines',
  templateUrl: './cancel-lines.component.html',
  styleUrls: ['./cancel-lines.component.css']
})
export class CancelLinesComponent implements OnInit {

  lines: Line[] = [];

//make a service request to get all lines of current user and populate it with lines

  constructor(private linesService: LinesService) { }

  //!I need to get the accountId, backend wont return it!
  //!get all lines of current user and display them
  ngOnInit(): void {
    //!how to get current users id?
    // this.linesService.findOne(this.id).subscribe((data)=>{
    //   if(data.body !== null){
        // this.lines = data.body
    //   }
    // })
  }



}
