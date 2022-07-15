import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { LandingComponent } from './landing/landing.component';
import { PhonesComponent } from './phones/phones.component';
import { AccountComponent } from './account/account.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { AppRoutingModule } from './app-routing.module';
import { PayBillComponent } from './pay-bill/pay-bill.component';
import { CancelLinesComponent } from './cancel-lines/cancel-lines.component';
import { NewLinesComponent } from './new-lines/new-lines.component';
import { NewCustomerComponent } from './new-customer/new-customer.component';
import { NewCustomerPhoneComponent } from './new-customer-phone/new-customer-phone.component';
import { NewCustomerLinesComponent } from './new-customer-lines/new-customer-lines.component';
import { PlansComponent } from './plans/plans.component';
import { LinesFormComponent } from './lines-form/lines-form.component';
import { AddLineComponent } from './add-line/add-line.component';
import { Iphone14Component } from './iphone14/iphone14.component';
import { S22Component } from './s22/s22.component';
import { S23Component } from './s23/s23.component';
import { NewCxLinesFormComponent } from './new-cx-lines-form/new-cx-lines-form.component';
import { CancelLinesFormComponent } from './cancel-lines-form/cancel-lines-form.component';
import { ForgotPassComponent } from './forgot-pass/forgot-pass.component';
import { AccountdetailsComponent } from './accountdetails/accountdetails.component';
import { PhonedetailsComponent } from './phonedetails/phonedetails.component';
import { AccountdetailsnavComponent } from './accountdetailsnav/accountdetailsnav.component';



@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    LandingComponent,
    PhonesComponent,
    AccountComponent,
    CheckoutComponent,
    PayBillComponent,
    CancelLinesComponent,
    NewLinesComponent,
    NewCustomerComponent,
    NewCustomerPhoneComponent,
    NewCustomerLinesComponent,
    PlansComponent,
    LinesFormComponent,
    AddLineComponent,
    Iphone14Component,
    S22Component,
    S23Component,
    NewCxLinesFormComponent,
    CancelLinesFormComponent,
    ForgotPassComponent,
    AccountdetailsComponent,
    PhonedetailsComponent,
    AccountdetailsnavComponent,
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
