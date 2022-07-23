import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment.dev';
import {Account} from '../../models/account.model';
@Injectable({
  providedIn: 'root'
})
export class NewCustomerService {

  url: string = environment.apiBaseUrl;


  constructor(private client: HttpClient) {
   }

   addNewAccount(account: Account): Observable<HttpResponse<Account>>{
   return this.client.post<Account>(`${this.url}/account/v1`,{account} ,{ observe: 'response' })


   }
}
