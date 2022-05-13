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

  deptObj: Dept = new Dept();

  

  deptAry: Dept[] = [
    {"deptno":10,"dname":"Accounting","loc":"New York"},
    {"deptno":20,"dname":"Research","loc":"New Jersey"},
    {"deptno":30,"dname":"Sales","loc":"Dallas"},
    {"deptno":40,"dname":"Operations","loc":"Bostons"},
    {"deptno":50,"dname":"Purchase","loc":"Washington"},
    {"deptno":60,"dname":"QMS","loc":"London"},
    {"deptno":70,"dname":"Testing","loc":"Pune"}

  ];

  addDeptToArray() {
    console.log('adding dept to array....');
    console.log(this.deptAry);
    this.deptAry.push(this.deptObj);
    console.log(this.deptAry);

  }

 
  deptAryTmp: Dept[] = [];

  deleteDeptFromArray(obj:Dept) {
  

    console.log('deleting dept from array....',obj.deptno);
    /*
    1  foo(item1,item2) { item!= obj }
    2   x (item1,item2) { item!= obj }
    3  filter(    item1 =>  item!= obj );


    filter(x) {
      1  
      2x();
      3
    }
    */
    this.deptAryTmp = this.deptAry.filter(item => item!= obj);
    this.deptAry = this.deptAryTmp;
  }

  constructor() { }

  ngOnInit(): void {
    this.deptObj.deptno=10;
    this.deptObj.dname='Accounting';
    this.deptObj.loc='New York';
  }

}

class Dept {
  deptno!: number;
  dname!: string;
  loc!:string; 
  
}
class Employee {
  empno!: number;
  ename!: string;
  salary!:string;

}