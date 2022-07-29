import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Phones} from '../../models/phones.model';
import { environment } from 'src/environments/environment.dev';

@Injectable({
  providedIn: 'root'
})
export class PhoneService {

  url: string = environment.apiBaseUrl;

  constructor(private client: HttpClient) {

   }

   findAll(): Observable<HttpResponse<Phones[]>> {

    return this.client.get<Phones[]>(`${this.url}/phones/v1`, { observe: 'response' });
  }

  findOne(model:string): Observable<HttpResponse<Phones>>{
    return this.client.get<Phones>(`${this.url}/phones/v1/phone/{model}`, { observe: 'response'})
  }
  
  findByModelNumber(id: number):Observable<HttpResponse<Phones[]>>{
    return this.client.get<Phones[]>(`${this.url}/phones/v1/id/${id}`, { observe: 'response' })
  }

  findByNumber(id: number):Observable<HttpResponse<Phones>>{
    return this.client.get<Phones>(`${this.url}/phones/v1/id/${id}`, { observe: 'response' })
  }

  save(phone: Phones): Observable<Phones>{
    console.log(phone) 
    return this.client.post<Phones>(`${this.url}/phones/v1/add`, {phone})
  }

  //add to Account 
  addPhoneLine(phones: Phones){
    // return this.client.put<Lines>(this.url)
    console.log(phones)
  }
}
