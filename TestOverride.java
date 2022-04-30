import java.time.LocalDate;
/*
abstract class God
{
	abstract void bless();
	abstract void boon();
}
class MessengerOfGod extends God
{
	void bless() { }
	 void boon() { }
}
class Saint extends MessengerOfGod
{
	 void boon(int c) { }
}


class A
{
	void fun() { }
}
class B extends A
{
	   
}
*/
public class TestOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Account a = new Account();
	a.withdraw(700);
		SavingsAccount s= new SavingsAccount();
	s.withdraw(600);
		FixedDepositAccount f = new FixedDepositAccount();
	f.withdrawing(600);*/
		
		/*
		 * 			stack					heap
		 * 									acno	name	balance
		 * 
		 * 									100
		 * 			200
		 * 			ref
		 * 
		 * 									acno	name	balance rate
		 * 
		 * 									200
		 * 			
		 * 			
		 * 
		 * 									acno	name	balance rate  maturity
		 * 
		 * 									300
		 *
		 * 
		 * java programming language			
		 */
		
		Account ref = new Account();
		
		
		
	ref.withdraw(600); // ref.Account.withdraw(600);
	
		ref=new SavingsAccount();
		
		
		
	ref.withdraw(900);//   ref.Account.withdrwa(900);
		ref=new FixedDepositAccount();
	
		if(ref instanceof FixedDepositAccount) {
			System.out.println("Yes it is pointing to FixedDepsoitAccount ");
		}
		else {
			System.out.println("No, it is NOT pointing to FixedDepositAccount ");
		}
		
		System.out.println("----------------------");
	
		
		if(ref instanceof SavingsAccount) {
			System.out.println("Yes it is pointing to SavingsAccount ");
		}
		else {
			System.out.println("No, it is NOT pointing to SavingsAccount ");
		}
		
		System.out.println("----------------------");
		
		if(ref instanceof Account) {
			System.out.println("Yes it is pointing to Account ");
		}
		else {
			System.out.println("No it is not pointing to Account");
		}
	ref.withdraw(500); //	ref.Account.withdraw(800);
		
		//RTTI - runtime type identification table - vtable
		//Reflection API
	//Class Method Constructor
	
		if(ref instanceof Account) {
			
		}
		
	}

}
abstract class Withdrawing // partial class - 
{
	abstract void withdraw(float amt); //declared - not defined 
}
class Recurring extends Withdrawing
{
	void withdraw(float x) {
		
	}
}
class Account extends Withdrawing { //isA
	float balance=5000;
	void withdraw(float y) { //1. inherited
		System.out.println("Account:withdraw()");
		balance=balance-y;
	}
}
class SavingsAccount extends Account {
	
	void calculateSimpleInterest() {//2. exclusive
		
	}
	void withdraw(float a) {//3. overriding
		System.out.println("SavingsAccount:withdraw()");
		if(balance < a) {
			throw new RuntimeException("funds insufficient...");
		}
		balance=balance-a;
	}
}
class FixedDepositAccount extends SavingsAccount {
	int tenureYear=2022;  //2025
	void withdraw(float a) {
		int currentYear = LocalDate.now().getYear();
		if(tenureYear != currentYear) {
			throw new RuntimeException("Account not matured...cannot withdrwa....");
		}
		System.out.println("FixedDepositAccount:withdraw()");
		balance=balance-a;
	}
	void withdrawing(float a) { }
}