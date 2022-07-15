import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-cancel-lines-form',
  templateUrl: './cancel-lines-form.component.html',
  styleUrls: ['./cancel-lines-form.component.css']
})
export class CancelLinesFormComponent implements OnInit {

  @Input()lines: string[] = [];
  
  constructor() { }

  ngOnInit(): void {
  }

}
