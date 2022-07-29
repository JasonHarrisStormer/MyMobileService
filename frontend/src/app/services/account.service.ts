import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Account } from 'src/models/account.model';
import { environment } from 'src/environments/environment.dev';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  
  url: string = environment.apiBaseUrl;
  
  //angualr comes with http functionality
  // injects in this HttpCLient for me
  // everything injected is a singleton
  constructor(private http: HttpClient) { }
  
  //Observables allow data binding to work
  //you observe and object and update to replect any changes to it
  findAll(): Observable<HttpResponse<Account[]>> {
    return this.http.get<Account[]>(this.url, { observe: 'response' });
  }
  
  findByEmail(email: string): Observable<HttpResponse<Account>> {
    return this.http.get<Account>(`${this.url}/account/v1/email/${email}`, { observe: 'response' });
  }
  findById(id: number): Observable<HttpResponse<Account>> {
    return this.http.get<Account>(`${this.url}/account/v1/id/${id}`, { observe: 'response' });
  }
  
  save(account: Account): Observable<HttpResponse<Account>> {
    return this.http.post<Account>(`${this.url}/account/v1/add`, account, { observe: 'response' });
  }

}
  
  

