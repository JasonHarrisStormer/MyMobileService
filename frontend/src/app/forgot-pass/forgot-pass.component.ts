import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';

@Component({
  selector: 'app-forgot-pass',
  templateUrl: './forgot-pass.component.html',
  styleUrls: ['./forgot-pass.component.css']
})
export class ForgotPassComponent implements OnInit {

  ResetForm = this.fb.group({
    "email":['', Validators.compose([Validators.required, Validators.email])]
  })
  
  backendEmail: any;
  
  submitReset(){
    console.log(this.ResetForm.value)
    if(this.email != null){
      console.log('Request Passed to Backend')
      if(this.email  === this.backendEmail){
        console.log('Account Located!')
      }else{
        alert('Invalid Login Information. \nPlease Try Again or Reset Your Password')
      }
    }
    else{
      if(window.confirm('Login Information Validation Failed \nPlease Report this Message to Development Team.')){

      }else{

      }
      
    }
  }
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

  get email() {
    return this.ResetForm.get('email')!;
  }

}
