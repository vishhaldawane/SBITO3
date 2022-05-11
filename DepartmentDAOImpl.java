package one2many;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import one2one.Passport;

public class DepartmentDAOImpl implements DepartmentDAO {
	
	EntityManager entityManager;
	
	public DepartmentDAOImpl() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		entityManager = factory.createEntityManager();
	}
	
	public Department findDepartmentById(int deptno)
	{
		return entityManager.find(Department.class,deptno);
	}
	public void updateDepartment(Department dept)
	{
		EntityTransaction et= entityManager.getTransaction();
		et.begin();
			entityManager.merge(dept);
		et.commit();
	}
	
	@Override
	public List<Department> findAllDepartments() {
		TypedQuery<Department> query = 
				entityManager.createQuery("from Department", Department.class);
		return query.getResultList();
	}

}
