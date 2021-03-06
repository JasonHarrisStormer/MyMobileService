import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

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
import { Iphone13Component } from './iphone13/iphone13.component';
import { Galaxya53Component } from './galaxya53/galaxya53.component';
import { VerifiedComponent } from './verified/verified.component';
import { PhoneSelectorComponent } from './phone-selector/phone-selector.component';
import { CareersComponent } from './careers/careers.component';
import { Iphone13promaxComponent } from './iphone13promax/iphone13promax.component';




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
    Iphone13Component,
    Galaxya53Component,
    VerifiedComponent,
    PhoneSelectorComponent,
    CareersComponent,
    Iphone13promaxComponent
    
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
