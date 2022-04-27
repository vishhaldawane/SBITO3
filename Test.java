
public class Test {

	public static void main(String[] args) {
		
		Calculator calc= new Calculator();
		calc.fun1();//1
		
		calc.fun2(120, 50); //2
		
		int ans = calc.fun3(350, 30); //3
		System.out.println("ans "+ans);
		
		int output = calc.fun4();
		System.out.println("output "+output);
	}

}
// 
class Calculator
{
	public void fun1() {
		int x=100;
		int y=20;
		int z=x+y;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("z is "+z);
		System.out.println("-------------------");
	}
	public void fun2(int x, int y) {
		int z=x+y;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("z is "+z);
		System.out.println("-------------------");
	}
	public int fun3(int x, int y) {
		int z=x+y;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("-------------------");
		return z;
		
	}
	public int fun4() {
		int x=100;
		int y=90;
		int z=x+y;
		System.out.println("x is "+x);
		System.out.println("y is "+y);
		System.out.println("-------------------");
		return z;
		
	}
}

/*
 		returnType	nameOfTheFunction(arguments/paramters)
 		{
 			body of the function
 			/task of the function/
 			 TODO
 		}
 		
  Four types of functions in the programming languages

  1. function without arguments/parameters
  	 and without return value
  	 	void add()
  	 	{
  	 	
  	 	}
  	 	
  2. function with arguments/parameters
  	 BUT without return value
  	 
  	 	void add(int x, int y)
  	 	{
  	 	
  	 	}
  	 	
  3. function with arguments/parameters
  	 AND with return value
  	 
  	 	int add(int x, int y)
  	 	{
  	 	
  	 	}
  	 	
  4. function without arguments/parameters
  	 BUT with return value
  	 
  	 	int add()
  	 	{
  	 	
  	 	}
  	 
*/





