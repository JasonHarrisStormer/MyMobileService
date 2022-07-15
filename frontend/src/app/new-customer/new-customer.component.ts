import { Component, OnInit } from '@angular/core';
import { EmailValidator, FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-customer',
  templateUrl: './new-customer.component.html',
  styleUrls: ['./new-customer.component.css']
})
export class NewCustomerComponent implements OnInit {
 
  myForm: FormGroup;
  
  constructor(private fb: FormBuilder) { 
    this.myForm = fb.group({
      "email":['', Validators.compose([Validators.required, Validators.email])],
      "phoneMe":['', ],
      "firstName": ['', Validators.required],
      "lastName": ['', Validators.required],
      "addresserMe": ['', Validators.required],
      "addresserMe2": ['', ],
      "cityMe": ['', Validators.required],
      "stateMe": ['', Validators.compose([Validators.required, Validators.maxLength(2)])],
      "zipCodeMe": ['', Validators.compose([Validators.required, Validators.maxLength(5)])],
    })
  }

  ngOnInit(): void {
  }
  createAccount(){

    console.log('Submit Pressed')
  }
}
