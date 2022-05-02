import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideTest {
	public static void main(String[] args) {
		System.out.println("Begin main");
		MyCalculator myCalci = new MyCalculator();
		
		try
		{
			System.out.println("1 division....");
			
			Scanner scan = new Scanner(System.in);
			
				System.out.println("Enter Numerator   number  : ");
				int x = scan.nextInt(); //100
				
				System.out.println("Enter Denominator number  : ");
				int y = scan.nextInt(); //25
			myCalci.divide(x, y);
		}
		catch(InputMismatchException e) {
			System.out.println("Please supply number....");
		}
		System.out.println("2 division....");
		myCalci.divide(50, 3);
		
		System.out.println("3 division....");
		myCalci.divide(70, 0);
		
		System.out.println("4 division....");
		myCalci.divide(100, 6);
		
		System.out.println("5 division....");
		myCalci.divide(150, 5);
		
		System.out.println("End main");
	}
}
class MyCalculator {
	void divide(int x, int y) {
		System.out.println("x "+x);
		System.out.println("y "+y);
		System.out.println("dividing "+x+" by "+y);
		try
		{
			int z = x / y;
			System.out.println("z "+z);
		}
		catch(ArithmeticException e) {
			System.out.println("Problem1 : "+e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Problem2 : "+e.getMessage());
		}
		catch(Exception e) {
			System.out.println("Problem3 : "+e.getMessage());
		}
		catch(Throwable e) {
			System.out.println("Problem4 : "+e.getMessage());
		}
		
		/*if(y==0) {
			System.out.println("Cannot divide by zero...");
		}
		else {
			int z = x / y;
			System.out.println("z "+z);
		}*/
		System.out.println("--------------------");
	}
}
