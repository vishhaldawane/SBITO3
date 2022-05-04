package animal.test;

import java.io.FileInputStream;

import animal.exceptions.DogAgeExceededException;
import animal.exceptions.DogAgeNegativeException;
import animal.exceptions.DogNameException;
import animal.mammal.Dog;

public class DogTest {

	public static void main(String[] args) {
		
			try {
				Dog d1 = new Dog(1,"Tommy");
				System.out.println("d1 "+d1);	
				
				Dog d2 = new Dog(31,"Bruno");
				System.out.println("d2 "+d2);
				
				Dog d3 = new Dog(1,"Jacky");
				System.out.println("d3 "+d3);
			} catch (DogNameException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DogAgeExceededException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DogAgeNegativeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				System.out.println("bound to be called regardless of the exceptions....");
			}
	}

}

