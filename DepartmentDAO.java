package one2many;

import java.util.List;

public interface DepartmentDAO {
	
	Department       findDepartmentById(int deptno);
	void 			 saveDepartment(Department dept);
	void 			 updateDepartment(Department dept);
	void 			 deleteDepartment(int deptno);
	List<Department> findAllDepartments();
	
}
