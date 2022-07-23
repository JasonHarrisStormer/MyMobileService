import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Lines} from '../../models/lines.models';
import { environment } from 'src/environments/environment.dev';
@Injectable({
  providedIn: 'root'
})
export class LinesService {

url: string = environment.apiBaseUrl;

  constructor(private client: HttpClient) {

   }

   findAll(): Observable<HttpResponse<Lines[]>> {
    console.log('here')
    return this.client.get<Lines[]>(`${this.url}/lineinfo/v1`, { observe: 'response' });
  }

  findOne(): Observable<HttpResponse<Lines>>{
    return this.client.get<Lines>(`${this.url}/lineinfo/v1/number/{id}`, { observe: 'response'})
  }
  
  findByAccountNumber(): Observable<HttpResponse<Lines>>{
    return this.client.get<Lines>(`${this.url}/lineinfo/v1/account/{id}`, { observe: 'response' })
  }

  save(line: Lines): Observable<Lines>{
    //take out line.numOfLines ?? or put numOfLines into Account entity?
    return this.client.post<Lines>(`${this.url}/lineinfo/v1/save`, {line})
  }
}
