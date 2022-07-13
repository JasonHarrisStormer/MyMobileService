import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { DropDownListModule } from '@syncfusion/ej2-angular-dropdowns';

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
    PlansComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    DropDownListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
