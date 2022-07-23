import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Line } from '../interfaces/LIne'

@Component({
  selector: 'app-cancel-lines-form',
  templateUrl: './cancel-lines-form.component.html',
  styleUrls: ['./cancel-lines-form.component.css']
})
export class CancelLinesFormComponent implements OnInit {

  @Input()lines: Line[] = [];
  selected: string = '';
  constructor() { }

  ngOnInit(): void {
  }

  currentLineSelected(){
    console.log(this.selected)
  }

}
