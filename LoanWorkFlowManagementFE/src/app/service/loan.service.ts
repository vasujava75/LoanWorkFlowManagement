import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { environment } from '../environment/environment';


@Injectable({
  providedIn: 'root'
})
export class LoanService {

  constructor(private http: HttpClient) {}

  createLoan(loanData: any): Observable<any> {
    const token = localStorage.getItem('authToken');
    const headers = new HttpHeaders({
      Authorization: `Bearer ${token ?? ''}`,
      'Content-Type': 'application/json'
    });

    return this.http.post<any>(`${environment.apiUrlLoans}/api/workflow/start`, loanData, { headers} );
  }
}
