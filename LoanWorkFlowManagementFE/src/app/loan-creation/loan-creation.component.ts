import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-loan-creation',
  imports: [FormsModule],
  templateUrl: './loan-creation.component.html',
  styleUrl: './loan-creation.component.less'
})
export class LoanCreationComponent {
  loan = {
    employeeName: 'John Doe',
    loanDate: '2025-07-12',
    loanAmount: 5000,
    loanCategory: 'Business'
  };
}

