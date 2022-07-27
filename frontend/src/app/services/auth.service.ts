import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import {User} from '../User'
import * as moment from "moment";

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private client: HttpClient) { }

  login(email:string, password:string ) {
    //retrieve the jwt 
    const res = this.client.post<User>('/api/login', {email, password})
       this.setSession(res)
  
}

getCredentials(email:string){
 return this.client.get<User>(`http://localhost:8080/users/v1/email/${email}`)
}

private setSession(authResult: any) {
  console.log("authResult from backend: " + authResult)
  const expiresAt = moment().add(authResult.expiresIn,'second');

  localStorage.setItem('id_token', authResult.idToken);
  localStorage.setItem("expires_at", JSON.stringify(expiresAt.valueOf()) );
}          

logout() {
  localStorage.removeItem("id_token");
  localStorage.removeItem("expires_at");
}

public isLoggedIn() {
  return moment().isBefore(this.getExpiration());
}

isLoggedOut() {
  return !this.isLoggedIn();
}

getExpiration() {
  const expiration: any = localStorage.getItem("expires_at");
  const expiresAt: string = JSON.parse(expiration);
  return moment(expiresAt);
}  
}
