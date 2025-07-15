import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable,tap, pipe } from 'rxjs';
import { LoginResponse } from './login-response.model';

import { environment } from '../environment/environment';


@Injectable({ providedIn: 'root' })
export class AuthService {
  constructor(private http: HttpClient) {}

  login(credentials: { email: string; password: string }): Observable<LoginResponse> {
    return this.http.post<LoginResponse>(`${environment.apiUrlLogin}/auth/login`, credentials).pipe(
      tap(response => {
        // Store token in localStorage
        localStorage.setItem('authToken', response.token);
      })
    );
  }

  getToken(): string | null {
    return localStorage.getItem('authToken');
  }

  logout(): void {
    localStorage.removeItem('authToken');
  }

}
