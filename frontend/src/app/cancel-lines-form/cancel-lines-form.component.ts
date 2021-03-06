import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-cancel-lines-form',
  templateUrl: './cancel-lines-form.component.html',
  styleUrls: ['./cancel-lines-form.component.css']
})
export class CancelLinesFormComponent implements OnInit {

  @Input()lines: string[] = [];
  selected: string = '';
  constructor() { }

  ngOnInit(): void {
  }

  currentLineSelected(){
    console.log(this.selected)
  }

}
