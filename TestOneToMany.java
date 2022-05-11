package one2many;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class TestOneToMany {
	DepartmentDAO deptDAO = new DepartmentDAOImpl();
	
	@Test
	public void loadAllDepartmentsTest() {
		
		List<Department> deptList = deptDAO.findAllDepartments();
		
		for (Department department : deptList) 
		{
			
			System.out.println(department.getDepartmentNumber()+
					" "+department.getDepartmentName()+
					" "+department.getDepartmentLocation());
			System.out.println("=======================================");
			List<Employee> empList = department.getEmployeeList();
			for (Employee emp : empList) {
				System.out.println("EMP number : "+emp.getEmployeeNumber());
				System.out.println("EMP name   : "+emp.getEmployeeName());
				System.out.println("EMP job    : "+emp.getJob());
				System.out.println("EMP mgr    : "+emp.getEmployeeManagerCode());
				System.out.println("EMP doj    : "+emp.getJoiningDate());
				System.out.println("EMP salary : "+emp.getBasicSalary());
				System.out.println("EMP comm   : "+emp.getCommission());
				System.out.println("EMP dept no: "+emp.getDepartment().getDepartmentNumber());
				System.out.println("------------------------");	
			}
		} 
	}
	
	@Test
	public void updateSalaryOfSalesmanTest() 
	{
		Department department = deptDAO.findDepartmentById(30);
			System.out.println(department.getDepartmentNumber()+
			" "+department.getDepartmentName()+
			" "+department.getDepartmentLocation());
			System.out.println("=======================================");
			
			List<Employee> empList = department.getEmployeeList();
			for (Employee emp : empList) 
			{
				if(emp.getJob().equals("SALESMAN")) 
				{
					System.out.println("EMP number : "+emp.getEmployeeNumber());
					System.out.println("EMP name   : "+emp.getEmployeeName());
					System.out.println("EMP job    : "+emp.getJob());
					System.out.println("EMP mgr    : "+emp.getEmployeeManagerCode());
					System.out.println("EMP doj    : "+emp.getJoiningDate());
					System.out.println("EMP salary : "+emp.getBasicSalary());
					System.out.println("EMP comm   : "+emp.getCommission());
					System.out.println("EMP dept no: "+emp.getDepartment().getDepartmentNumber());
					System.out.println("------------------------");
					emp.setBasicSalary(emp.getBasicSalary()+emp.getBasicSalary()*0.10);
				}//end of if for salesman
			}//end of inner for - emp table
			deptDAO.updateDepartment(department);
	} //end of test case
	
	@Test
	public void addNewEmployeesToExistingDepartmentTest()
	{
		Department department = deptDAO.findDepartmentById(40);
		System.out.println(department.getDepartmentNumber()+
		" "+department.getDepartmentName()+
		" "+department.getDepartmentLocation());
		System.out.println("=======================================");

		List<Employee> newEmpList = new ArrayList<Employee>();
		Employee emp1= new Employee(1111,"Sachin","Batsman",7839,LocalDate.now(),4444.0,155,department);
		Employee emp2= new Employee(2222,"Sehvag","Batsman",7698,LocalDate.now(),5555.0,255,department);
		Employee emp3= new Employee(3333,"Virat","Batsman",7788,LocalDate.now(),6666.0,355,department);
		Employee emp4= new Employee(4444,"Dravid","Batsman",7566,LocalDate.now(),7777.0,455,department);
		Employee emp5= new Employee(5555,"Dhoni","Batsman",7782,LocalDate.now(),8888.0,555,department);
		newEmpList.add(emp1);
		newEmpList.add(emp2);
		newEmpList.add(emp3);
		newEmpList.add(emp4);
		newEmpList.add(emp5);
		
		department.setEmployeeList(newEmpList);
		
		deptDAO.updateDepartment(department);
	}
	
	@Test
	public void addNewEmployeesToNewDepartmentTest()
	{
		Department department = new Department();
		department.setDepartmentNumber(60);
		department.setDepartmentName("QMS");
		department.setDepartmentLocation("Pune");
		
		System.out.println(department.getDepartmentNumber()+
		" "+department.getDepartmentName()+
		" "+department.getDepartmentLocation());
		System.out.println("=======================================");

		List<Employee> newEmpList = new ArrayList<Employee>();
		Employee emp1= new Employee(6161,"Abhinav","Developer",7839,LocalDate.now(),8444.0,855,department);
		Employee emp2= new Employee(6262,"Anand","Coder",7698,LocalDate.now(),8555.0,855,department);
		Employee emp3= new Employee(6363,"Sruthi","Programmer",7788,LocalDate.now(),8666.0,855,department);
		Employee emp4= new Employee(6464,"Deepa","Tester",7566,LocalDate.now(),8777.0,855,department);
		Employee emp5= new Employee(6565,"Nidhi","Analyst",7782,LocalDate.now(),8888.0,855,department);
		newEmpList.add(emp1);
		newEmpList.add(emp2);
		newEmpList.add(emp3);
		newEmpList.add(emp4);
		newEmpList.add(emp5);
		
		department.setEmployeeList(newEmpList);
		
		deptDAO.saveDepartment(department);
	}
	
	EmployeeDAO empDAO = new EmployeeDAOImpl();
	
	@Test
	public void changeDepartmentOfExistingEmployeesTest()
	{
		empDAO.changeDepartmentOfSpecificEmployees(30, 40);
	}
}



