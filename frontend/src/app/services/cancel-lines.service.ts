import { Injectable } from '@angular/core';
import {HttpClient, HttpResponse} from '@angular/common/http';
import { Observable } from 'rxjs';
import {}
@Injectable({
  providedIn: 'root'
})
export class CancelLinesService {
url: string = 'http://localhost:8080/mymobileservice/phonelines'

  constructor(private http: HttpClient) { }
}

