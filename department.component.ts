import { Component, OnInit } from '@angular/core';
import { DepartmentService } from '../department.service';
import { Department } from './Department';

@Component({
  selector: 'app-department',
  templateUrl: './department.component.html',
  styleUrls: ['./department.component.css']
})
export class DepartmentComponent implements OnInit {

  constructor(private deptService: DepartmentService) { }

  dept:Department = new Department();

  allDepts: Department[]=[]; //referred by html code to print

  ngOnInit(): void {
    this.deptService.loadAllDepartmentsService().subscribe(
      
      (data) => {
        console.log('ngOnInit() loading the departments...');
        this.allDepts = data;
      },
      (err) => {
        console.log(err);
      }
    );

  }
  
  message!:string;

  addDept() {
    this.deptService.addSingleDepartmentsService(this.dept).subscribe(
      (data) => {
        console.log('department is added');
        //this.message=data;
        //console.log(this.message);
      },
      (err) => {
        this.message=err.error;
        console.log(err);
        //alert(this.message);
      }
    );
  }

  editDept(deptObj:Department) {
      this.deptService.updateSingleDepartmentsService(deptObj).subscribe(
        (data) => {
          console.log('department is updated');
          //this.message=data;
          //console.log(this.message);
        },
        (err) => {
          this.message=err.error;
          console.log(err);
          //alert(this.message);
        } 
      );
  }

  deleteThis(x: number) {
    this.deptService.deleteSingleDepartmentService(x).subscribe(
      (data) => {
        console.log('department is deleted');
        //this.message=data;
        //console.log(this.message);
      },
      (err) => {
        this.message=err.error;
        console.log(err);
        //alert(this.message);
      } 
    );

  }
}
