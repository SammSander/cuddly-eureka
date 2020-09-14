import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TypesComponent} from './types/types.component';

const routes: Routes = [
  { path: 'types-component', component: TypesComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
