import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LinesService } from '../services/lines.service';

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
    if(confirm(`Are you certain you wish to remove ${this.selected}?`)){
      LinesService.deleteLines(this.selected);
    }
  }

}
