import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cancel-lines',
  templateUrl: './cancel-lines.component.html',
  styleUrls: ['./cancel-lines.component.css']
})
export class CancelLinesComponent implements OnInit {

  lines: string[] = [];

//make a service request to get all lines and populate it with lines

  constructor() { }

  ngOnInit(): void {
  }

}
