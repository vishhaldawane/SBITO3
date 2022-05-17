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

  deptObj: Dept = new Dept() ;
  newDeptOb!:Dept;

  deptAry: Dept[] = [
    {
        "deptno":10,"dname":"Accounting","loc":"New York",
        "empList": [
              {"empno":7839,"ename":"King","salary":5000,"epic":"/assets/amitabh.jpeg"},
              {"empno":7782,"ename":"Clark","salary":5000,"epic":"assets/namo.jpeg"},
              {"empno":7934,"ename":"Miller","salary":5000,"epic":"assets/amitshah.jpeg"}
        ],
    },
    {
        "deptno":20,"dname":"Research","loc":"New Jersey",
        "empList": [
              {"empno":7876,"ename":"Adamns","salary":1100,"epic":"assets/raga.jpeg"},
              {"empno":7788,"ename":"Scott","salary":3000,"epic":""},
              {"empno":7369,"ename":"Smith","salary":800,"epic":""},
              {"empno":7902,"ename":"Ford","salary":3000,"epic":""},
              {"empno":7566,"ename":"Jones","salary":2975,"epic":""}
      ]
    },
    {
        "deptno":30,"dname":"Sales","loc":"Dallas",
        "empList": [
          {"empno":7521,"ename":"Ward","salary":1250,"epic":"assets/bill.jpeg"},
          {"empno":7900,"ename":"James","salary":950,"epic":"assets/bruce.jpeg"},
          {"empno":7499,"ename":"Allen","salary":1600,"epic":"assets/james.jpeg"},
          {"empno":7654,"ename":"Martin","salary":1250,"epic":""},
          {"empno":7698,"ename":"Blake","salary":2850,"epic":""},
          {"empno":7844,"ename":"Turner","salary":1500,"epic":""}
          

        ],
    },
    {
        "deptno":40,"dname":"Operations","loc":"Bostons",
        "empList": [],
    },
    {
        "deptno":50,"dname":"Purchase","loc":"Washington",
        "empList": [],
    },
    {
        "deptno":60,"dname":"QMS","loc":"London",
        "empList": [],
    },
    {
      "deptno":70,"dname":"Testing","loc":"Pune",
      "empList": [],
    }

  ];

  addDeptToArray() {
    this.newDeptOb = new Dept();
    this.newDeptOb.deptno = this.deptObj.deptno;
    this.newDeptOb.dname= this.deptObj.dname;
    this.newDeptOb.loc = this.deptObj.loc;
    
    console.log('adding dept to array....');
    console.log(this.deptAry);
    this.deptAry.push(this.newDeptOb);
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
    
    console.log('before filter');
    console.log(this.deptAry);
    this.deptAry = this.deptAry.filter(item => item!= obj);
    //this.deptAry = this.deptAryTmp;
    console.log('AFTER filter');
    console.log(this.deptAry);
  }

  constructor() { }

  ngOnInit(): void {
    
  }

}

class Dept {
  deptno!: number;
  dname!: string;
  loc!:string; 

  empList:  Employee[]=[];
  
}
class Employee {
  empno!: number;
  ename!: string;
  salary!:number;
  epic!:string;
}