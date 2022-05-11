package one2many;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeeDAOImpl implements EmployeeDAO {

	EntityManager entityManager;
	
	public EmployeeDAOImpl() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		entityManager = factory.createEntityManager();
	}
	
	@Override
	public void changeDepartmentOfSpecificEmployees(int oldDeptNo, int newDeptNo) {
		EntityTransaction et = entityManager.getTransaction();
		et.begin();
			Query query = entityManager.createNativeQuery("update emp set deptno=:newdno where deptno=:olddno");
			query.setParameter("newdno", newDeptNo);
			query.setParameter("olddno", oldDeptNo);
			query.executeUpdate();
		et.commit();
	}

}
