import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Lines } from 'src/models/lines.models';
import { environment } from 'src/environments/environment.dev';

@Injectable({
  providedIn: 'root'
})
export class PayBillService {

  url: string = environment.apiBaseUrl;

  constructor(private client: HttpClient) { 


  }

  payBill(totalAmount: number): Observable<Lines>{
    return this.client.put<Lines>(`${this.url}/lineinfo/v1` , { observe: 'response' })
  }
}
