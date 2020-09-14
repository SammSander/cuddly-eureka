import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TypesComponent} from './types/types.component';
import {ShopComponent} from './shop/shop.component';
import {HomeComponent} from './home/home.component';

const routes: Routes = [
  { path: 'types-component', component: TypesComponent },
  { path: "", component: HomeComponent},
  { path: "home", component: HomeComponent},
  {path: "shop", component: ShopComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
