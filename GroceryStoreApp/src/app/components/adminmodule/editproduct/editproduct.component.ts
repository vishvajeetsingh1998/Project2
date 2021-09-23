import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/models/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-editproduct',
  templateUrl: './editproduct.component.html',
  styleUrls: ['./editproduct.component.css']
})
export class EditproductComponent implements OnInit {
  productid:any;
  prod: Product;
  constructor(private pservice:ProductService,private router:Router) {
    this.prod=new Product();
   }

  ngOnInit(): void {
    this.productid=localStorage.getItem("productid");
    console.log(this.productid)
      this.pservice.serachProductById(this.productid).subscribe(
        (data)=>{
          this.prod=data as Product;
        }
      )
  }
  saveData()
  {
    this.pservice.updateProduct(this.prod).subscribe
    (
      (data)=>{ console.log(' Data Updated')
      window.alert("Product details edited successfully.")
      this.router.navigate(['viewproduct'])
    
    }
      
    )
  }
}
