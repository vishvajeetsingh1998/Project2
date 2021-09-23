import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {MatButtonModule} from '@angular/material/button';
import {MatIconModule} from '@angular/material/icon'
import {MatSelectModule} from '@angular/material/select';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {MatStepperModule} from '@angular/material/stepper';
import {MatMenuModule} from '@angular/material/menu';
import { LoginComponent } from './components/user/login/login.component';
import { RegisterComponent } from './components/user/register/register.component';
import { NavbarComponent } from './components/user/navbar/navbar.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import {MatToolbarModule} from '@angular/material/toolbar';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { Navbar1Component } from './components/home/navbar1/navbar1.component';
import { DashboardComponent } from './components/home/dashboard/dashboard.component';
import { CarouselModule } from 'ngx-owl-carousel-o';
import { LoginpageComponent } from './components/adminmodule/loginpage/loginpage.component';
import { Nav1Component } from './components/adminmodule/nav1/nav1.component';
import { EditproductComponent } from './components/adminmodule/editproduct/editproduct.component';
import { NewproductComponent } from './components/adminmodule/newproduct/newproduct.component';
import { SearchproductComponent } from './components/adminmodule/searchproduct/searchproduct.component';
import { CartComponent } from './components/shopping/cart/cart.component';
import { CartItemComponent } from './components/shopping/cart-item/cart-item.component';
import { ProductListComponent } from './components/shopping/product-list/product-list.component';
import { ProductItemComponent } from './components/shopping/product-list/product-item/product-item.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { AdmindashboardComponent } from './components/adminmodule/admindashboard/admindashboard.component';
import { ViewproductsComponent } from './components/adminmodule/viewproducts/viewproducts.component';
import { ProductlistComponent } from './components/adminmodule/viewproducts/productlist/productlist.component';
import { UserdashboardComponent } from './components/user/userdashboard/userdashboard/userdashboard.component';
import { ProductsComponent } from './components/user/products/products/products.component';
import { ProductsListComponent } from './components/user/products/products-list/products-list.component';
import { CartsComponent } from './components/user/cart/carts/carts.component';
import { CartsItemComponent } from './components/user/cart/carts-item/carts-item.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
    NavbarComponent,
    HeaderComponent,
    FooterComponent,
    Navbar1Component,
    DashboardComponent,
    LoginpageComponent,
    Nav1Component,
    EditproductComponent,
    NewproductComponent,
    SearchproductComponent,
    CartComponent,
    CartItemComponent,
    ProductListComponent,
    ProductItemComponent,
    AdmindashboardComponent,
    ViewproductsComponent,
    ProductlistComponent,
    UserdashboardComponent,
    ProductsComponent,
    ProductsListComponent,
    CartsComponent,
    CartsItemComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    BrowserAnimationsModule,
    MatButtonModule,
    MatIconModule,
    MatSelectModule,
    MatStepperModule,MatMenuModule,CarouselModule,
    HttpClientModule,
    FormsModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
