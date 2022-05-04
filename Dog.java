package animal.mammal;

import animal.exceptions.DogAgeExceededException;
import animal.exceptions.DogAgeNegativeException;
import animal.exceptions.DogNameException;

public class Dog extends Mammal {
	
	private int age;
	private String name;
	
	public Dog(int age, String name) throws DogAgeExceededException, DogAgeNegativeException, DogNameException
	{
		System.out.println(">Dog ctor started...");
		if(age > 14) {
			//throw new RuntimeException("Dog's age cannot exceed 14");
			throw new DogAgeExceededException("Dogs age cannot exceed 14");
		}
		else if( age < 0 ) {
			//throw new RuntimeException("Dog's age cannot be in negative");
			throw new DogAgeNegativeException("Dog's age cannot be in negative...");
		}
		else {
			System.out.println("Setting age...");
			this.age = age;
		}
		
		System.out.println("Setting name...");
		if(isStringOnlyAlphabet(name)) {
			this.name = name;
		}
		else {
			//throw new RuntimeException("Invalid characters in Dog's name");
			DogNameException dogAgeEx = new DogNameException("Invalid characters found in the Dog's name");
			throw dogAgeEx;
		}
			
		System.out.println(">Dog ctor finished...");
			
	}

	@Override
	public String toString() {
		return "Dog [age=" + age + ", name=" + name + "]";
	}
	
	private static boolean isStringOnlyAlphabet(String str) 
	{
	    return ((!str.equals(""))
	            && (str != null)
	            && (str.matches("^[a-zA-Z]*$")));
	}
	// str ="Bruno"
}
/*
 
 dir abc*
 dir *.lst
 
1  		"man$"
2  		"^man"
3 		"^man$"
 
	suman
	salesman
	chairman
	man
	manager
	manager
	manjit
	manoj
	

*/