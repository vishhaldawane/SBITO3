import { Component, OnInit } from '@angular/core';
import { CurrencyConverterService } from '../currency-converter.service';

@Component({
  selector: 'app-currency-converter',
  templateUrl: './currency-converter.component.html',
  styleUrls: ['./currency-converter.component.css']
})
export class CurrencyConverterComponent implements OnInit {

  convAmt:number=0;
  sourceCountry!: string;
  targetCountry!: string;
  amountToConvert!:number;
  constructor(private ccs: CurrencyConverterService) { 
    console.log('CurrencyConverterComponent constructor...');
  }
  ngOnInit(): void {
    console.log('CurrencyConverterComponent ngOnInit() invoked.....');
  }
  convertIt() {
    console.log('CurrencyConverterComponent convertIt() invoked......')
    console.log('Source country is ',this.sourceCountry);
    console.log('Target country is ',this.targetCountry);
    if(this.sourceCountry == this.targetCountry) {
      alert('source and target country cannot be the same');
    }
    else if(this.amountToConvert==0 || this.amountToConvert<0 || this.amountToConvert==undefined) {
      alert('Please fill valid amount');
    }
    else {
      this.convAmt = this.ccs.convert(this.sourceCountry,this.targetCountry,this.amountToConvert);
    }
  }
}

/*

class Savings1 {
  balance!:number; //DATA MEMBER
  constructor(bal:number) { //LOCAL VARIABLE
    this.balance = bal; // ASSIGN LOCAL TO GLOBAL
  }
}
class Savings2 {
  constructor(private bal:number) { //DATA MEMBER
  }
}


*/