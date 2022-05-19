import java.sql.DriverManager;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.hdfc.Car;
import com.hdfc.Engine;
import com.hdfc.Piston;
import com.sbi.Department;

public class DeptTest3 {
	public static void main(String[] args) {
		
		System.out.println("trying to load the application context...");
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("myspring3.xml");
		System.out.println("application context...loaded.....");
		System.out.println("-------------------");
		
		Department dept = (Department) container.getBean("dept");
		
	/*	DriverManagerDataSource dmds = new DriverManagerDataSource();
		dmds.setDriverClassName("oracle.jdbc.OracleDriver");
		dmds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dmds.setUsername("system");
		dmds.setPassword("sysgitc");
		
		Department dept= new Department();
		dept.setDataSource(dmds);
		*/
		
		dept.showAllDepartments();
		
		
		
	}
}
