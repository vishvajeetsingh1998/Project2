import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Product } from '../models/product';
@Injectable({
  providedIn: 'root'
})
export class ProductService {


  products: Product[] = [
    

  ]

  constructor(private httpClient:HttpClient) { }

  baseUrl:string="http://localhost:8080//shivarest/product";


  getAllProducts()
  {
    return this.httpClient.get(this.baseUrl+"/viewallproductdetails");
  }
  findproduct(productid:any)
  {
    return this.httpClient.get(this.baseUrl+"/findproduct/"+productid);
  }
  addNewProduct(product:Product)
  {
    return this.httpClient.post(this.baseUrl+"/addproduct",product,{responseType: 'text'});
  }
  serachProductById(productid:number)
  {
    return this.httpClient.get(this.baseUrl+"//viewproductdetail/"+productid);
  }
  updateProduct(product:Product)
  {
    return this.httpClient.put(this.baseUrl+"/editproductdetail",product,{responseType: 'text'});
  }
}
