//This service stores plans in local straoge and retreives them when needed
import { Injectable } from '@angular/core';
@Injectable({
  providedIn: 'root'
})
export class StorageService {

  constructor() { }
  
 setPlans = (key: string, value:object) => {
    window.localStorage.setItem(key, JSON.stringify(value));
  }
  
 getPlans = (key:string) => {
    const value = window.localStorage.getItem(key);
    
    if (value) {
      return JSON.parse(value);
    }
  }
  
}