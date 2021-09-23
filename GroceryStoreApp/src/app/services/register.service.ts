import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor(private httpClient:HttpClient) { 
    
  }
  baseUrl:string="http://localhost:8080//shivarest/user";
  

  //ADDING User
  addNewUser(user:User)
  {
    return this.httpClient.post(this.baseUrl+"/adduser",user,{responseType: 'text'});
  }
  addLogin(email?:String,password?:String)
{
  return this.httpClient.get(this.baseUrl+"/login/"+email+"/"+password);
}
}
