import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdmindashboardComponent } from './components/adminmodule/admindashboard/admindashboard.component';
import { EditproductComponent } from './components/adminmodule/editproduct/editproduct.component';
import { LoginpageComponent } from './components/adminmodule/loginpage/loginpage.component';
import { NewproductComponent } from './components/adminmodule/newproduct/newproduct.component';
import { ViewproductsComponent } from './components/adminmodule/viewproducts/viewproducts.component';
import { DashboardComponent } from './components/home/dashboard/dashboard.component';
import { CartComponent } from './components/shopping/cart/cart.component';
import { ProductListComponent } from './components/shopping/product-list/product-list.component';
import { CartsComponent } from './components/user/cart/carts/carts.component';
import { LoginComponent } from './components/user/login/login.component';
import { NavbarComponent } from './components/user/navbar/navbar.component';
import { ProductsComponent } from './components/user/products/products/products.component';
import { RegisterComponent } from './components/user/register/register.component';
import { UserdashboardComponent } from './components/user/userdashboard/userdashboard/userdashboard.component';

const routes: Routes = [
  {path: '', redirectTo:'/home',pathMatch:'full' },
  {path:'signin',component: LoginComponent},
{path:'signup',component: RegisterComponent},
{path:'home',component: DashboardComponent},
{path:'cart',component:CartComponent},
{path:'product-list',component:ProductListComponent},
{path:'adminlogin',component:LoginpageComponent},
{path:'admindashboard',component:AdmindashboardComponent},
{path:'newproduct',component:NewproductComponent},
{path:'editproduct',component:EditproductComponent},
{path:'viewproduct',component:ViewproductsComponent},
{path:'userdashboard',component:UserdashboardComponent},
{path:'products',component:ProductsComponent},
{path:'carts',component:CartsComponent},



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
