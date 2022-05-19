import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sbi.Car;
import com.sbi.Engine;
import com.sbi.Piston;

public class CarTest2 {
	public static void main(String[] args) {
		
		System.out.println("trying to load the application context...");
		ApplicationContext container = 
				new ClassPathXmlApplicationContext("myspring.xml");
		System.out.println("application context...loaded.....");
		System.out.println("-------------------");
		Car carObj = (Car) container.getBean("x");
		carObj.startCar();
		System.out.println("carObj "+carObj);
		System.out.println("-------------------");
		Car carObj2 = (Car) container.getBean("x");
		carObj2.startCar();
		System.out.println("carObj2 "+carObj2);
		
		
		
	}
}
