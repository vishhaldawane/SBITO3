package one2many;
import java.util.List;
import org.junit.jupiter.api.Test;
public class TestOneToMany {
	DepartmentDAO deptDAO = new DepartmentDAOImpl();
	@Test
	public void loadAllDepartmentsTest() {
		List<Department> deptList = deptDAO.findAllDepartments();
		for (Department department : deptList) {
			System.out.println(department.getDepartmentNumber()+
					" "+department.getDepartmentName()+
					" "+department.getDepartmentLocation());
			System.out.println("---------------------------------");
		} 
	}
}
