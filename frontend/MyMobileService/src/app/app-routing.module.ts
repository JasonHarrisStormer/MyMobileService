import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { CancelLinesComponent } from './cancel-lines/cancel-lines.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { LandingComponent } from './landing/landing.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { NewCustomerLinesComponent } from './new-customer-lines/new-customer-lines.component';
import { NewCustomerPhoneComponent } from './new-customer-phone/new-customer-phone.component';
import { NewCustomerComponent } from './new-customer/new-customer.component';
import { NewLinesComponent } from './new-lines/new-lines.component';
import { PayBillComponent } from './pay-bill/pay-bill.component';
import { PhonesComponent } from './phones/phones.component';
import { PlansComponent } from './plans/plans.component';

const routes: Routes = [
  {path: '' , component: LandingComponent}, //send normal incoming traffic to landing page, not the app template
  {path: 'login', component: LoginPageComponent},
  {path: 'main', component: LandingComponent},
  {path: 'phones', component: PhonesComponent},
  {path: 'plans', component: PlansComponent},
  {path: 'account', component: AccountComponent},
  {path: 'checkout', component: CheckoutComponent},
  {path: 'new-cx', component: NewCustomerComponent }, //cx is standard tel-com jargon for customer
  {path: 'new-cx-phones', component: NewCustomerPhoneComponent },
  {path: 'new-cx-lines', component: NewCustomerLinesComponent },
  {path: 'new-lines', component: NewLinesComponent },
  {path: 'paybill', component: PayBillComponent },
  {path: 'cancelLines', component: CancelLinesComponent },
  {path: '*', component: LandingComponent }
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
  
}
