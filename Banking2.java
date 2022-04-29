
public class Banking2 {
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(101,"Jack",50000,"99999999");
	
		ba.permAdderss = new Address("Ram Palace", "West Avenue", "Ayodhya", "Uttar Pradesh", "India", "401501");
		ba.corrAdderss = new Address("Rahim Manzil", "East Avenue", "Belapur", "Navi Mumbai", "India", "501601");
		
		System.out.println(ba);
		
		
	}
}
