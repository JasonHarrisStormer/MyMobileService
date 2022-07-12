import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccountComponent } from './account/account.component';
import { CheckoutComponent } from './checkout/checkout.component';
import { LandingComponent } from './landing/landing.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { PhonesComponent } from './phones/phones.component';

const routes: Routes = [
  {path: 'login', component: LoginPageComponent},
  {path: 'main', component: LandingComponent},
  {path: 'phones', component: PhonesComponent},
  //{path: 'plans', component: PlansComponent},
  {path: 'account', component: AccountComponent},
  {path: 'checkout', component: CheckoutComponent},
  {path: '*', component: LandingComponent }
]

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 
  
}
