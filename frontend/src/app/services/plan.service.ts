import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import {Lines} from '../../models/lines.models';
import { environment } from 'src/environments/environment.dev';
import { Plan } from '../Plan';

@Injectable({
  providedIn: 'root'
})
export class PlanService {

  url: string = environment.apiBaseUrl;


  constructor(private client: HttpClient) {

  }

  findAll(): Observable<HttpResponse<Plan>> {

   return this.client.get<Plan>(`${this.url}/plans/v1`, { observe: 'response' });

  }

  findById(id: number): Observable<HttpResponse<Plan>> {

    return this.client.get<Plan>(`${this.url}/plans/v1/id/${id}`, { observe: 'response' });

  }
 
  
}
