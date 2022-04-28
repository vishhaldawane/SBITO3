public class PhoneTest {
	public static void main(String[] args) {
		Phone myPhone = new Phone();
		myPhone.dial();
		byte speedNumber=123;
		myPhone.dial(speedNumber);
		myPhone.dial("Anjali");
		myPhone.dial("Anjali","Divya");
		myPhone.dial(speedNumber, "Vishhal");
		myPhone.dial("Vishhal",speedNumber);
	}
}
class Phone
{
	void dial() {
		System.out.println("dialing nowhere...");
	}
	void dial(byte speedDail) {
		System.out.println("dialing to ..."+speedDail);
	}
	void dial(String name) {
		System.out.println("dialing to ..."+name);
	}
	void dial(String name,String name2) {
		System.out.println("conference call with ..."+name+" and "+name2);
	}
	void dial(byte b,String name) {
		System.out.println("conference call with ..."+b+" and "+name);
	}
	void dial(String name,byte b) {
		System.out.println("conference call with ..."+name+" and "+b);
	}
}
