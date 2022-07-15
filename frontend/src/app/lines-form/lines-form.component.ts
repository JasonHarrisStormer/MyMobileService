import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-lines-form',
  templateUrl: './lines-form.component.html',
  styleUrls: ['./lines-form.component.css']
})
export class LinesFormComponent implements OnInit {

  myForm: FormGroup;
  constructor(private fb: FormBuilder) { 
    this.myForm = fb.group({
      "accountNumber": ['', Validators.required],
      "firstName": ['', Validators.required],
      "lastName": ['', Validators.required],
      "phoneNumber": ['', Validators.required],
    })
  }

  ngOnInit(): void {
  }

}
