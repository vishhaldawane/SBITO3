import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { UserDetails } from './user-details/UserDetails';

@Injectable({
  providedIn: 'root'
})
export class UserDetailsService {

  constructor(private myHttp: HttpClient) { }

  loadAllUserDetailsService() : Observable<UserDetails[]> {
    return this.myHttp.get<UserDetails[]>("https://jsonplaceholder.typicode.com/users")
  }
  loadUserDetailsByIdService(x:number) : Observable<UserDetails>  {
    return this.myHttp.get<UserDetails>("https://jsonplaceholder.typicode.com/users/"+x);
  }

}
