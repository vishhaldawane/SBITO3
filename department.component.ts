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
        alert(data);
        this.message = JSON.stringify(data);
      },
      (err) => {
        alert(err);
        this.message=err.error;
        console.log(err);

      }
    );
  }
}
