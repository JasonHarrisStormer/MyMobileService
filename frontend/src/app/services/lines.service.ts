import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Lines} from '../../models/lines.models';
import { environment } from 'src/environments/environment.dev';
@Injectable({
  providedIn: 'root'
})
export class LinesService {
  static deleteLines(selected: string) {
    throw new Error('Method not implemented.');
  }

url: string = environment.apiBaseUrl;

  constructor(private client: HttpClient) {

   }

   findAll(): Observable<HttpResponse<Lines[]>> {

    return this.client.get<Lines[]>(`${this.url}/lineinfo/v1`, { observe: 'response' });
  }

  findOne(id:number): Observable<HttpResponse<Lines>>{
    return this.client.get<Lines>(`${this.url}/lineinfo/v1/number/{id}`, { observe: 'response'})
  }
  
  findByAccountNumber(id: number):Observable<HttpResponse<Lines[]>>{
    console.log(id);
    return this.client.get<Lines[]>(`${this.url}/lineinfo/v1/account/${id}`, { observe: 'response' })
  }
  findByAccount(id: number):Observable<HttpResponse<Lines>>{
    return this.client.get<Lines>(`${this.url}/lineinfo/v1/account/${id}`, { observe: 'response' })
  }

  save(line: Lines): Observable<Lines>{
    console.log(line) 
    return this.client.post<Lines>(`${this.url}/lineinfo/v1/save`, {line})
  }
  
  //add to Account 
  addPhoneLine(lines: Lines){
    return this.client.post<Lines>(`${this.url}/lineinfo/v1/add`, {lines})
  }

  //delete lines
  deleteLines(phonenumber: string){
    this.client.delete<Lines>(`${this.url}/lineinfo/v1/remline/${phonenumber}`)
  }
}
