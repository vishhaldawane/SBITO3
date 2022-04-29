class Kite
{
	String color;
	int length;
	String owner;
	
	public Kite(String color, int length, String owner) {
		super();
		this.color = color;
		this.length = length;
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Kite [color=" + color + ", length=" + length + ", owner=" + owner + "]";
	}

	void printKite() {
		System.out.println("Color  : "+color);
		System.out.println("Length : "+length);
		System.out.println("Owner  : "+owner);
	}
	
	
}

class JumboKite extends Kite
{
	int size;

	public JumboKite(String color, int length, String owner, int size) {
		super(color, length, owner);
		this.size = size;
	}
	
	
}

public class Banking2 {
	public static void main(String[] args) {
		
		Kite k1 = new Kite("Red", 50, "Jack");
		Kite k2 = new Kite("Green", 60, "Jane");
		Kite k3 = new Kite("Yellow", 70, "Joy");
		
		System.out.println(k1);//it will automatically searche for the toString function
		System.out.println(k2);
		System.out.println(k3);
		
		k1.printKite();
		k2.printKite();
		k3.printKite();
		
		/*
		BankAccount ba = new BankAccount(101,"Jack",50000,"99999999");
	
		ba.permAdderss = new Address("Ram Palace", "West Avenue", "Ayodhya", "Uttar Pradesh", "India", "401501");
		ba.corrAdderss = new Address("Rahim Manzil", "East Avenue", "Belapur", "Navi Mumbai", "India", "501601");
		
		System.out.println(ba);
		
		*/
	}
}
