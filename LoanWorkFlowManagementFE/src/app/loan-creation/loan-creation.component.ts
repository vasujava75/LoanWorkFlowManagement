import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { LoanService } from '../service/loan.service';

@Component({
 selector: 'app-loan-creation',
    standalone: true,
    imports: [FormsModule, HttpClientModule],
    templateUrl: './loan-creation.component.html',
    styleUrls: ['./loan-creation.component.less']
  })
export class LoanCreationComponent {
  loan = {
    employeeName: 'John Doe',
    loanDate: '2025-07-12',
    loanAmount: 5000,
    loanCategory: 'Business'
  };
  isSubmitted = false;

  constructor(private loanService: LoanService) {}

  onSubmit() {
    this.loanService.createLoan(this.loan).subscribe({
      next: (response:string) => {
        this.isSubmitted=true;
        console.log('Loan submitted successfully:', response);
      },
      error: (error:string) => {
        this.isSubmitted=true;
        console.error('Error submitting loan:', error);
      }
    });
  }
}
