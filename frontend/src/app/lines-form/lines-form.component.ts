import { Component, Input, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-lines-form',
  templateUrl: './lines-form.component.html',
  styleUrls: ['./lines-form.component.css']
})
export class LinesFormComponent implements OnInit {

  @Input() numOfLines: number = 0;
  myForm: FormGroup;

  constructor(private fb: FormBuilder) { 
    this.numOfLines = this.numOfLines
    this.myForm = this.fb.group({
      "accountNumber": ['', Validators.required],
      "email": ['', Validators.required],
      "phoneNumber": ['', Validators.required],
      "numberOfNewLines": ['', Validators.required], 
    })
  }

  ngOnInit(): void {
  }

  addLinesToAccount(){

    console.log(this.numOfLines)
  }

}
