import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { DropDownListModule } from '@syncfusion/ej2-angular-dropdowns';
import {RouterModule} from '@angular/router'
import { AppComponent } from './app.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { LandingComponent } from './landing/landing.component';


@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    LandingComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: 'login', component: LoginPageComponent},
      {path: 'main', component: LandingComponent},
      // {path: 'phones', component: PhoneComponent},
      // {path: 'plans', component: PlansComponent},
      // {path: 'account', component: AccountComponent}
      // {path: 'checkout', component: CheckOutComponent}
      {path: '*', component: LandingComponent }
    ]),
    FormsModule,
    DropDownListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
