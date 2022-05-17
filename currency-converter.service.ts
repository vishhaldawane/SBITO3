import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CurrencyConverterService {

  constructor() { }
  
  convertedAmount:number=0;

  convert(source:string, target: string, amountToConvert: number) : number {
    console.log('CurrencyConverterService:convert() invoked....')    
    if (source =="INR" && target=="USD") {
      this.convertedAmount = amountToConvert * 0.013;
    }
    else if (source =="USD" && target=="INR") {
      this.convertedAmount = amountToConvert * 78;
    }
    return this.convertedAmount;
  }
}
