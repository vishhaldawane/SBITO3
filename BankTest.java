import java.awt.Frame;
import java.time.LocalDate;

public class BankTest {
	public static void main(String[] args) {
		BankAccount baAccObj1 = new BankAccount(101, "Jack",50000);
		
		System.out.println("-------------");

		SavingsAccount savAccObj2 = new SavingsAccount(102,"Jane",90000,3.5);
		
		System.out.println("-------------");

		FixedDepositAccount fdAccObj3 = new FixedDepositAccount(101,"Julie",90000,7.5,5);
		
		baAccObj1.printBankAccount();
		System.out.println("-------------");
		savAccObj2.printBankAccount();
		double si = savAccObj2.calculateSimpleInterest();
		System.out.println("simple interest : "+si);
		
		System.out.println("-------------");
		fdAccObj3.printBankAccount();
		double ma = fdAccObj3.calculateMaturityAmount();
		System.out.println("maturity amount : "+ma);
	}
}

//making the data member as private
// and allowing this data via accessible functions

class BankAccount
{
	//DATA MEMBER
	private int accountNumber; //FIELD
	private String accountHolderName; //FIELD
	protected double accountBalance; //FIELD
	private LocalDate accountOpeningDate;
	
	BankAccount(int x, String y, double z)
	{
		System.out.println("BankAccount(int,String,double)...constructor invoked....");
		
		if(x<0) {
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		}
		else
			accountNumber=x;
		
		if(y==null) {
			throw new RuntimeException("Account holder name cannot be null...terminating..");
		}
		else
			accountHolderName=y;
		
		if(z<0) {
			//RuntimeException r = new RuntimeException("some problem.....");
			//throw r;
			throw new RuntimeException("Account Balance cannot be in negative...terminating..");
		}
		else
			accountBalance=z;
	}
	
	//accessor 
	void printBankAccount() 
	{
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account HName   : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("-----------------------");
	}
	double withdraw(double amountToWithdraw) {
		if(amountToWithdraw > accountBalance) {
			throw new RuntimeException("Insufficient funds....");
		}
		System.out.println("Withdraw in progresss..."+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("Withdraw is done...");
		return accountBalance;
	}
	
	double deposit(double amountToDeposit) {
		if(amountToDeposit > 50000) {
			throw new RuntimeException("Please provide the PAN OR Form60");
		}
		System.out.println("Deposit in progresss..."+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		System.out.println("Deposit is done...");
		return accountBalance;
	}
	
	double getBalance() { //accessor
		return accountBalance;
	}
}

class SavingsAccount extends BankAccount
{
	//DATA MEMBER
	protected double rateOfInterest;
	
	SavingsAccount(int x, String y, double z, double r)
	{
		super(x,y,z); //invoke the ctor of the super class
		System.out.println("SavingsAccount(int,String,double,double)...constructor invoked....");
		
		if(r<0) {
			throw new RuntimeException("Account rate cannot be in negative...terminating..");
		}
		else 
			rateOfInterest=r;
	}
	
	//accessor 
	void printBankAccount() 
	{
		super.printBankAccount();
		System.out.println("Account ROI     : "+rateOfInterest);
		System.out.println("-----------------------");
	}
	
	double calculateSimpleInterest() {
		return (super.accountBalance*1*rateOfInterest)/100;
	}
}

class FixedDepositAccount extends SavingsAccount
{
	//DATA MEMBER
	private int tenure;
	
	FixedDepositAccount(int x, String y, double z, double r, int t)
	{
		super(x,y,z,r); //invoke the ctor of the super class
		System.out.println("FixedDepositAccount(int,String,double,double,int)...constructor invoked....");
		
		if(t<0) {
			throw new RuntimeException("Fixed Deposit Account tenure cannot be in negative...terminating..");
		}
		else 
			tenure=t;
	}
	
	//accessor 
	void printBankAccount() 
	{
		super.printBankAccount();
		System.out.println("Fixed Tenure    : "+tenure);
		System.out.println("-----------------------");
	}
	
	double calculateMaturityAmount() {
		double x = Math.pow( (1+rateOfInterest/100), tenure);
		double y = accountBalance * x;
		return y;
	}
}

/*

class SavingsAccount
{
	//DATA MEMBER
	private int accountNumber; //FIELD
	private String accountHolderName; //FIELD
	private double accountBalance; //FIELD
	
	private double rateOfInterest;
	
	SavingsAccount(int x, String y, double z, double r)
	{
		System.out.println("SavingsAccount(int,String,double)...constructor invoked....");
		
		if(x<0) {
			throw new RuntimeException("Account number cannot be in negative...terminating..");
		}
		else
			accountNumber=x;
		
		if(y==null) {
			throw new RuntimeException("Account holder name cannot be null...terminating..");
		}
		else
			accountHolderName=y;
		
		if(z<0) {
			//RuntimeException r = new RuntimeException("some problem.....");
			//throw r;
			throw new RuntimeException("Account Balance cannot be in negative...terminating..");
		}
		else
			accountBalance=z;
		
		if(r<0) {
			throw new RuntimeException("Account rate cannot be in negative...terminating..");
		}
		else 
			rateOfInterest=r;
	}
	
	//accessor 
	void printBankAccount() 
	{
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account HName   : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);
		System.out.println("Account ROI     : "+rateOfInterest);
		System.out.println("-----------------------");
	}
	double withdraw(double amountToWithdraw) {
		if(amountToWithdraw > accountBalance) {
			throw new RuntimeException("Insufficient funds....");
		}
		System.out.println("Withdraw in progresss..."+amountToWithdraw);
		accountBalance = accountBalance - amountToWithdraw;
		System.out.println("Withdraw is done...");
		return accountBalance;
	}
	
	double deposit(double amountToDeposit) {
		if(amountToDeposit > 50000) {
			throw new RuntimeException("Please provide the PAN OR Form60");
		}
		System.out.println("Deposit in progresss..."+amountToDeposit);
		accountBalance = accountBalance + amountToDeposit;
		System.out.println("Deposit is done...");
		return accountBalance;
	}
	
	double getBalance() { //accessor
		return accountBalance;
	}
	
	double calculateSimpleInterest() {
		return (accountBalance*1*rateOfInterest)/100;
	}
}
*/

/*

		int accountNumber;
		String accountHolderName;
		double accountBalance;

		accountNumber=101;
		accountHolderName="Jack";
		accountBalance=50000;
		
		System.out.println("Account Number  : "+accountNumber);
		System.out.println("Account HName   : "+accountHolderName);
		System.out.println("Account Balance : "+accountBalance);

		int accountNumber2;
		String accountHolderName2;
		double accountBalance2;

		accountNumber2=102;
		accountHolderName2="Jane";
		accountBalance2=60000;
		
		System.out.println("Account Number  : "+accountNumber2);
		System.out.println("Account HName   : "+accountHolderName2);
		System.out.println("Account Balance : "+accountBalance2);

		
		int accountNumber3;
		String accountHolderName3;
		double accountBalance3;

		accountNumber3=103;
		accountHolderName3="Julie";
		accountBalance3=70000;
		
		System.out.println("Account Number  : "+accountNumber3);
		System.out.println("Account HName   : "+accountHolderName3);
		System.out.println("Account Balance : "+accountBalance3);

		
		
*/