import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { LinesService } from '../services/lines.service';
import {Lines} from '../../models/lines.models';

@Component({
  selector: 'app-lines-form',
  templateUrl: './lines-form.component.html',
  styleUrls: ['./lines-form.component.css']
})
export class LinesFormComponent implements OnInit {

  @Input() numOfLines: number = 0;
  myForm: FormGroup;

  constructor(private fb: FormBuilder, private linesService: LinesService) { 
    this.numOfLines = this.numOfLines
    this.myForm = this.fb.group({
      "phoneNumber": ['', Validators.required],
      "accountId": ['', Validators.required],
      "plan": ['', Validators.required],
      "phoneId": ['', Validators.required],
      "callerId": ['', Validators.required],
      "numberOfNewLines": ['', Validators.required], 
    })
  }

  ngOnInit(): void {
  }

  addLine(){

    console.log(this.myForm.value)
    this.linesService.save(this.myForm.value)
   
  }

}
