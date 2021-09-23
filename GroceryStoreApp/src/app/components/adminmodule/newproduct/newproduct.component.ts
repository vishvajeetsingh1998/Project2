import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from 'src/app/models/product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-newproduct',
  templateUrl: './newproduct.component.html',
  styleUrls: ['./newproduct.component.css']
})
export class NewproductComponent implements OnInit {
  prod:Product;
  constructor(private prodservice:ProductService,private router:Router) {
    this.prod=new Product();
   }

  ngOnInit(): void {
  }
  saveData()
  {

      this.prodservice.addNewProduct(this.prod).subscribe(
        (data)=>{
          console.log("Return Value from REST"+data); 
          window.alert(" New Product details added successfully.")
          this.router.navigate(['viewproduct'])
        }
      )
    
  }
}
