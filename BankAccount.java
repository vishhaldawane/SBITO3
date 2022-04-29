
class Address
{
	String area;
	String street;
	String city;
	String state;
	String country;
	String pin;
	
	public Address(String area, String street, String city, String state, String country, String pin) {
		super();
		this.area = area;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", street=" + street + ", city=" + city + ", state=" + state + ", country="
				+ country + ", pin=" + pin + "]";
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	
	
}

public class BankAccount {
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	private String mobileNumber;
	
	Address permAdderss; //hasA
	Address corrAdderss; //hasA
	
	//private String address1;
	//private String address2;
	
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
				+ ", accountBalance=" + accountBalance + ", mobileNumber=" + mobileNumber + ", permAdderss="
				+ permAdderss + ", corrAdderss=" + corrAdderss + "]";
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
