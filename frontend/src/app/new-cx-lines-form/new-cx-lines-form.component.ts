import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-new-cx-lines-form',
  templateUrl: './new-cx-lines-form.component.html',
  styleUrls: ['./new-cx-lines-form.component.css']
})
export class NewCxLinesFormComponent implements OnInit {

  myForm: FormGroup;

 constructor(private fb: FormBuilder) { 
  
this.myForm = this.fb.group({
  "firstName": ['', Validators.required],
  "lastName": ['',Validators.required],
  "email": ['', Validators.compose([Validators.required, Validators.email])],
  "phoneNumber": ['', Validators.required],
  "numberOfNewLines": ['', Validators.required],
})
  }


  ngOnInit(): void {
  }

  addLinesToAccount(){
    console.log('clicked')
  }

}
