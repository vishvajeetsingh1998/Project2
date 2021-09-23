import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.css']
})
export class LoginpageComponent implements OnInit {
  adminid?: String;
  pass?: String;
  constructor(private router:Router) { }
  userid:String='auv';
  Password:String='123456';
  ngOnInit(): void {
  }
  Adminlogin()
  {
    if(this.adminid==this.userid && this.pass==this.Password)
    {
      window.alert("Admin successfully logged in!");
      this.router.navigate(['admindashboard']);
    }
    else
    {
      window.alert("Invalid Details")
    }
  }

}
