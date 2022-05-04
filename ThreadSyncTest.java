
public class ThreadSyncTest {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(101, "Suresh", 50000);
		System.out.println("ba"+ba);
		
		Teller t1 = new Teller("Seeta",ba,5000); //3
		Teller t2 = new Teller("\tGeeta",ba,7000); //3
		Teller t3 = new Teller("\t\tReeta",ba,8000); //3
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join(); //wait for t1 to die
			t2.join(); //wait for t1 to die
			t3.join(); //wait for t1 to die
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("last line : ba"+ba);
		
	}
}
class Teller extends Thread //1
{
	String tellerName;
	BankAccount ref;
	double amountToDeposit;
	
	Teller(String name, BankAccount x, double amt) {
		tellerName= name;
		ref= x;
		amountToDeposit=amt;
	}
	void depositCash() {
		//System.out.println(tellerName+" depositing cash "+amountToDeposit);
		ref.deposit(amountToDeposit, tellerName);
	}
	public void run() { //2
		depositCash();
	}
}
class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	public BankAccount(int accountNumber, String accountHolderName, double accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + "]";
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance(String tn) {
		System.out.println(tn+" getting the balance....");
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance,String tn) {
		System.out.println(tn+" setting the balance....");
		this.accountBalance = accountBalance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}
	
	//allows only one thread to enter inside this method and other nested calls
	public synchronized  void deposit(double amountToDeposit, String tn) {
		System.out.println(tn+" Deposit(double) started.....");
		double currentBalance = getAccountBalance(tn);
		System.out.println(tn+" Balance got : "+currentBalance);
		System.out.println(tn+" calculating new balance .....");
		double newBalance = currentBalance + amountToDeposit;
		setAccountBalance(newBalance,tn);
		System.out.println(tn+" Deposit(double) finished.....");
		System.out.println("---------------------");
	}
	
}
