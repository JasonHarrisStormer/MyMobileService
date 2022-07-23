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
    return this.client.get<Lines[]>(`${this.url}/lineinfo/v1/all`, { observe: 'response' });
  }

  findOne(): Observable<HttpResponse<Lines>>{
    return this.client.get<Lines>(`${this.url}/lineinfo/v1/number/{id}`, { observe: 'response'})
  }
  
  findByAccountNumber(): Observable<HttpResponse<Lines>>{
    return this.client.get<Lines>(`${this.url}/lineinfo/v1/account/{id}`, { observe: 'response' })
  }
}
