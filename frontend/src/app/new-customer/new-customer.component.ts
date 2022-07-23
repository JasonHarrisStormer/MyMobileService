import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import {NewCustomerService} from '../services/new-customer.service';
@Component({
  selector: 'app-new-customer',
  templateUrl: './new-customer.component.html',
  styleUrls: ['./new-customer.component.css']
})
export class NewCustomerComponent implements OnInit {
 
  myForm = this.fb.group({
    "email":['', Validators.compose([Validators.required, Validators.email])],
    "phoneMe":['', ],
    "firstName": ['', Validators.required],
    "lastName": ['', Validators.required],
    "address": ['', Validators.required],
    "addressMe2": ['', ],
    "cityMe": ['', Validators.required],
    "stateMe": ['', Validators.compose([Validators.required, Validators.maxLength(2)])],
    "zipCodeMe": ['', Validators.compose([Validators.required, Validators.maxLength(5)])],
  })
  
  constructor(private fb: FormBuilder, private newCustomerService: NewCustomerService) { }

  ngOnInit(): void {
  }

  createAccount(){

    console.log('Submit Pressed')
    console.log(this.myForm.value)
    //pass {this.myForm} to the backend from here
    // this.newCustomerService.addNewAccount(this.myForm.value).subscribe((res) => { console.log(res) })

  }
  get email() {
    return this.myForm.get('email')!;
  }

  get phone() {
    return this.myForm.get('phoneMe')!;
  }

  get firstName() {
    return this.myForm.get('firstName')!;
  }

  get lastName() {
    return this.myForm.get('lastName')!;
  }

  get address() {
    return this.myForm.get('addressMe')!;
  }

  get address2() {
    return this.myForm.get('addressMe2')!;
  }

  get city() {
    return this.myForm.get('cityMe')!;
  }

  get state() {
    return this.myForm.get('stateMe')!;
  }

  get zipCode() {
    return this.myForm.get('zipCodeMe')!;
  }
}
