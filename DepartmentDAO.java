package one2many;

import java.util.List;

public interface DepartmentDAO {
	
	Department       findDepartmentById(int deptno);
	void 			 updateDepartment(Department dept);
	List<Department> findAllDepartments();
	
}
