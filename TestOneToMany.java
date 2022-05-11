package one2many;
import java.util.List;
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
}
