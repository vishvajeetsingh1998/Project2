import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class AddtocartService {
subject = new Subject()

  constructor() { }


  sendMsg(product:any)
  {
    //console.log(product)
    this.subject.next(product)
  }
  getMsg()
  {
    return this.subject.asObservable()
  }
   

}
