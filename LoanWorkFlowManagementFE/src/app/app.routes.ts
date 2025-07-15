import { Routes } from '@angular/router';
import {LoginComponent} from './login/login.component';
import { LoanCreationComponent } from './loan-creation/loan-creation.component';
export const routes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'loan-creation', component: LoanCreationComponent },
  { path: '', redirectTo: 'login', pathMatch: 'full' },
  { path: '**', redirectTo: 'login' }

];
