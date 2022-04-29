
public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private String mobileNumber;
	
	public BankAccount(int accountNumber, String accountHolderName, double accountBalance, String mobileNumber) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", mobileNumber=" + mobileNumber + "]";
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	
	
	
	
	
	
}
