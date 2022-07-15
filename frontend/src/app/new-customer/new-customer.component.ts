import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-customer',
  templateUrl: './new-customer.component.html',
  styleUrls: ['./new-customer.component.css']
})
export class NewCustomerComponent implements OnInit {
 
  myForm: FormGroup;
  constructor(private fb: FormBuilder) { 
    this.myForm = fb.group({
      "email":['', Validators.email],
      "phoneMe":['',Validators.maxLength(11)],
      "firstName": ['', Validators.required],
      "lastName": ['', Validators.required],
      "addresserMe": ['', Validators.required],
      "addresserMe2": ['', ],
      "cityMe": ['', Validators.required],
      "stateMe": ['', Validators.required],
      "zipCodeMe": ['', Validators.required],
    })
  }

  ngOnInit(): void {
  }

}
