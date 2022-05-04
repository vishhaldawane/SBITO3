public class ThreadTest {
	public static void main(String[] args) {
		Car c = new Car();
		Train t = new Train();
		Flight f = new Flight();
		
		c.run();
		t.run();
		f.run();
	}
}
//1. extend from java.lang.Thread class
//2. override the run method()

class Car //extends Thread
{
	public void run() {
		for (int i = 1; i < 200; i++) {
			System.out.println("car is running...."+i);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Train  // extends Thread
{
	public void run() {
		for (int i = 1; i < 500; i++) {
			System.out.println("\ttrain is running...."+i);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
class Flight //extends Thread
{
	public void run() {
		for (int i = 1; i < 1200; i++) {
			System.out.println("\t\tFlight is flying ...."+i);
			try {
				Thread.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}



