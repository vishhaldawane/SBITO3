import { Component, OnInit } from '@angular/core';
import { BankApplicant } from './BankApplicant';

@Component({
  selector: 'app-bank-applicant',
  templateUrl: './bank-applicant.component.html',
  styleUrls: ['./bank-applicant.component.css']
})
        //bank-applicant.component.ts
        
export class BankApplicantComponent implements OnInit {

  bankApp:BankApplicant = new BankApplicant();

  constructor() { }

  ngOnInit(): void {
  }

}
