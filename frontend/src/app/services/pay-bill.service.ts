import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Lines } from 'src/models/lines.models';
import { environment } from 'src/environments/environment.dev';
import { Account } from 'src/models/account.model';

@Injectable({
  providedIn: 'root'
})
export class PayBillService {

  url: string = environment.apiBaseUrl;

  constructor(private client: HttpClient) { 


  }

  payBill(id: number,balance: number, phoneBal: number): Observable<Account>{
    console.log(balance, phoneBal)
    return this.client.put<Account>(`${this.url}/account/v1/makeBill/${id}/${balance}/${phoneBal}` , { observe: 'response' })
  }

  getBill(id: number): Observable<HttpResponse<Account>>{
    return this.client.get<Account>(`${this.url}/account/v1/id/${id}`, { observe: 'response' })
  }
}
