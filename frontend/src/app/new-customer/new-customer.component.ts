import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NewCustomerService } from '../services/new-customer.service';
import { Account } from '../../models/account.model';
import { Lines } from '../../models/lines.models';

@Component({
  selector: 'app-new-customer',
  templateUrl: './new-customer.component.html',
  styleUrls: ['./new-customer.component.css']
})
export class NewCustomerComponent implements OnInit {

  line: Lines[] = [];

  formValues: any;
  userInfo: Account = {
    email: '',
    password: '',
    phoneNumber: 0,
    firstname: '',
    lastname: '',
    address: '',
    address2: '',
    city: '',
    state: '',
    zipcode: 0,
    line: []
  };

  myForm = this.fb.group({
    "email": ['', Validators.compose([Validators.required, Validators.email])],
    "phoneNumber": ['',],
    "firstname": ['', Validators.required],
    "lastname": ['', Validators.required],
    "address": ['', Validators.required],
    "address2": ['',],
    "city": ['', Validators.required],
    "state": ['', Validators.compose([Validators.required, Validators.maxLength(2)])],
    "zipcode": ['', Validators.compose([Validators.required, Validators.maxLength(5)])],
    "password": ['', Validators.compose([Validators.required, Validators.minLength(5)])]
  })

  constructor(private fb: FormBuilder, private newCustomerService: NewCustomerService) { }

  ngOnInit(): void {
  }

  createAccount() {

    this.formValues = { ...this.myForm.value};
    
    //it should be Lines type but is Object type
    console.log(typeof this.line)


    this.formValues.line = this.line;
    console.log(typeof this.formValues.line)

    //change type to Account
    this.userInfo = { ...this.formValues };

    this.newCustomerService.addNewAccount(this.userInfo).subscribe((res) => { console.log(res) })

  }
  get email() {
    return this.myForm.get('email')!;
  }

  get phone() {
    return this.myForm.get('phoneNumber')!;
  }

  get fristname() {
    return this.myForm.get('fristname')!;
  }

  get lastname() {
    return this.myForm.get('lastname')!;
  }

  get address() {
    return this.myForm.get('address')!;
  }

  get address2() {
    return this.myForm.get('address2')!;
  }

  get city() {
    return this.myForm.get('city')!;
  }

  get state() {
    return this.myForm.get('state')!;
  }

  get zipcode() {
    return this.myForm.get('zipcode')!;
  }
  get password() {
    return this.myForm.get('password')!;
  }
}
