import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.dev';
import {Account} from '../../models/account.model';
import {User} from '../../models/user.model';
@Injectable({
  providedIn: 'root'
})
export class NewCustomerService {

  url: string = environment.apiBaseUrl;


  constructor(private client: HttpClient) {
   }

   addNewAccount(account: Account): Observable<HttpResponse<Account>>{
    console.log(account);
   return this.client.post<Account>(`${this.url}/account/v1/add`,account ,{ observe: 'response' })
   }

   addNewUser(user: User): Observable<HttpResponse<User>>{
    console.log(user);
    return this.client.post<User>(`${this.url}/users/v1/add`,user ,{ observe: 'response' })
   }
}
