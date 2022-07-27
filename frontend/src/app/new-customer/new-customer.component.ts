import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { NewCustomerService } from '../services/new-customer.service';
import { Account } from '../../models/account.model';
import { Lines } from '../../models/lines.models';
const bcrypt = require('bcryptjs');
@Component({
  selector: 'app-new-customer',
  templateUrl: './new-customer.component.html',
  styleUrls: ['./new-customer.component.css']
})
export class NewCustomerComponent implements OnInit {
  lines: Lines[] = [];

  formValues: any;
  userInfo: Account = {
    id: 0,
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
    lines: [],
    balance: 0,
    phoneBal: 0
  };

  myForm = this.fb.group({
    "email": ['', Validators.compose([Validators.required, Validators.email])],
    "password": ['',[Validators.required]],
    "firstname": ['', Validators.required],
    "lastname": ['', Validators.required],
    "address": ['', Validators.required],
    "address2": ['',],
    "city": ['', Validators.required],
    "state": ['', Validators.compose([Validators.required, Validators.maxLength(2)])],
    "zipcode": ['', Validators.compose([Validators.required, Validators.maxLength(5)])],
    // "password": ['', Validators.compose([Validators.required, Validators.minLength(5)])]
  })

  constructor(private fb: FormBuilder, private newCustomerService: NewCustomerService) { }

  ngOnInit(): void {
  }

  createAccount() {

    this.formValues = { ...this.myForm.value};
    
 
    //add Lines type of lines to the form
    this.formValues.lines = this.lines;

    //create an id
    const id = Math.floor((Math.random()*1000-1)-1);

    //change type to Account
    this.userInfo = { ...this.formValues, id };
    (async () => {
      const hashedpassword = await bcrypt.hash(this.formValues.password,10);
      console.log(hashedpassword);
      console.log(this.userInfo);
      this.userInfo.password=hashedpassword;
      this.newCustomerService.addNewAccount(this.userInfo).subscribe((res) => { console.log(res) })
  })();
  
  
    //const hashedpassword=hashedpasswordpromise;
    //console.log(hashedpassword);
   // console.log(this.userInfo);
    //this.newCustomerService.addNewAccount(this.userInfo).subscribe((res) => { console.log(res) })

  }
  get email() {
    return this.myForm.get('email')!;
  }

  get phone() {
    return this.myForm.get('phoneNumber')!;
  }

  get firstname() {
    return this.myForm.get('firstname')!;
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
  // get password() {
  //   return this.myForm.get('password')!;
  // }
}
