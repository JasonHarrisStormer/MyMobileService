import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-careers',
  templateUrl: './careers.component.html',
  styleUrls: ['./careers.component.css']
})
export class CareersComponent implements OnInit {
  
  appForm = this.fb.group({
    "email":['', Validators.compose([Validators.required, Validators.email])],
    "phoneMe":['', Validators.compose([Validators.required, Validators.minLength(9), Validators.maxLength(10)]) ],
    "firstName": ['', Validators.required],
    "lastName": ['', Validators.required],
    "addressMe": ['', Validators.required],
    "addressMe2": ['', ],
    "cityMe": ['', Validators.required],
    "stateMe": ['', Validators.compose([Validators.required, Validators.maxLength(2)])],
    "zipCodeMe": ['', Validators.compose([Validators.required, Validators.maxLength(5)])],
  })
  
  constructor(private fb: FormBuilder, private route:Router) { }

  ngOnInit(): void {
  }

  createApplication(){

    console.log('Submit Pressed')
    console.log(this.appForm.value)
    console.log('Rejected');
    if(window.confirm("We're not hiring for any positions right now.\nPress OK and go buy a phone!")){
      this.route.navigateByUrl('/main');
    }else{
      alert("Ok, but we're still not hiring.");
      this.route.navigateByUrl('/login');
    }
    //pass {this.myForm} to the backend from here
  }
  get email() {
    return this.appForm.get('email')!;
  }

  get phone() {
    return this.appForm.get('phoneMe')!;
  }

  get firstName() {
    return this.appForm.get('firstName')!;
  }

  get lastName() {
    return this.appForm.get('lastName')!;
  }

  get address() {
    return this.appForm.get('addressMe')!;
  }

  get address2() {
    return this.appForm.get('addressMe2')!;
  }

  get city() {
    return this.appForm.get('cityMe')!;
  }

  get state() {
    return this.appForm.get('stateMe')!;
  }

  get zipCode() {
    return this.appForm.get('zipCodeMe')!;
  }
}

