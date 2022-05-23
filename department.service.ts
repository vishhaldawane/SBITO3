import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Department } from './department/Department';

@Injectable({
  providedIn: 'root'
})
export class DepartmentService {

  constructor(private myHttp: HttpClient) { }

  loadAllDepartmentsService() : Observable<Department[]> { // localhost:4200
    console.log('loadAllDepartmentsService() invoked.....');
    return this.myHttp.get<Department[]>("http://localhost:8080/depts/");
  }
  loadSingleDepartmentService(x:number) : Observable<Department> { // localhost:4200
    console.log('loadSingleDepartmentsService() invoked.....');
    return this.myHttp.get<Department>("http://localhost:8080/depts/"+x);
  }
  addSingleDepartmentsService(dept:Department) : Observable<string> { // localhost:4200
    console.log('addSingleDepartmentsService() invoked.....');
    return this.myHttp.post<string>("http://localhost:8080/depts/addDept/",dept,{responseType:'json'});
  }
  updateSingleDepartmentsService(dept:Department) : Observable<string> { // localhost:4200
    console.log('addSingleDepartmentsService() invoked.....');
    return this.myHttp.put<string>("http://localhost:8080/depts/updateDept/",dept);
  }

  deleteSingleDepartmentService(x:number) : Observable<string> { // localhost:4200
    console.log('deleteSingleDepartmentService() invoked.....');
    return this.myHttp.delete<string>("http://localhost:8080/depts/deleteDept/"+x);
  }  
  
}
