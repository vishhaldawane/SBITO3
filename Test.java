interface MyRunnable {
	void run();
}
class Vehicle implements MyRunnable {
	MyRunnable r; // either Vehicle or Person
	
	public Vehicle() {
		System.out.println("Vehicle()");
	}
	Vehicle(MyRunnable r) {
		System.out.println("Vehicle(MyRunnable )");
		this.r = r;
	}
	public void run() {
		System.out.println("Vehicle is running....");
	}
	public void start() {
		System.out.println("Starting vehicle.....");
		if(r==null)
			run();
		else
			r.run();
	}
}
class Car2 extends Vehicle {
	public void run() {
		System.out.println("Car is running.....");
	}
}
public class Test {
	public static void main(String[] args) {
		Car2 c = new Car2();
		c.start();
		System.out.println("-----------------");
		Person p= new Person(); //MyRunnable r = new Person();
		Vehicle v = new Vehicle(p);
		v.start();
	}
}

class Human 
{
	void think() { }
}
class Person extends Human implements  MyRunnable
{
	void talk() {
		
	}
	public void run() {
		System.out.println("Person is running....");
	}
}
