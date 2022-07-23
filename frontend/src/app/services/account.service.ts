import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Account } from 'src/models/account.model';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  
  url: string = "http://localhost:8080/accounts";
  
  //angualr comes with http functionality
  // injects in this HttpCLient for me
  // everything injected is a singleton
  constructor(private http: HttpClient) { }
  
  //Observables allow data binding to work
  //you observe and object and update to replect any changes to it
  findAll(): Observable<HttpResponse<Account[]>> {
    return this.http.get<Account[]>(this.url, { observe: 'response' });
  }
  
  find(id: number): Observable<HttpResponse<Account>> {
    //console.log(ownerId);
    return this.http.get<Account>(this.url + `?id=${id}`, { observe: 'response' });
  }
  
  save(account: Account): Observable<HttpResponse<Account>> {
    return this.http.post<Account>(this.url, account, { observe: 'response' });
  }


}
  
  

