import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms';
import { DropDownListModule } from '@syncfusion/ej2-angular-dropdowns';
import {RouterModule} from '@angular/router'
import { AppComponent } from './app.component';
import { LoginPageComponent } from './login-page/login-page.component';
import { PlansComponent } from './plans/plans.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginPageComponent,
    PlansComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: 'login', component: LoginPageComponent},
      {path: 'landing', component: AppComponent},
      // {path: 'phones', component: PhoneComponent},
      // {path: 'plans', component: PlansComponent},
      // {path: 'account', component: AccountComponent}
      // {path: 'checkout', component: CheckOutComponent}
    ]),
    FormsModule,
    DropDownListModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
