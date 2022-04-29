//properity = wealth + health + relationships+ mental peace
/*
 * 1 - DB
 * 2 - POJO
 * 3 - REPO
 * 4 - 
 * 5
 * 6
 * 
 */
public class AssociationTest {

	public static void main(String[] args) {
		BankAccount x = new BankAccount(101,"Jack",50000,"9820443464");
		x.printBankAccount();
		
		System.out.println("----");
		BankAdmin admin = new BankAdmin();
		admin.changeMobileNumberOfAccountHolder(x, "9920445566");
		System.out.println("======");
		x.printBankAccount();

	}
}
class BankAdmin
{
	void changeMobileNumberOfAccountHolder(BankAccount y, String z) { // y=x;
		y.setMobileNumber(z);
	}
}

//BankAdmin admin = new BankAdmin();
//admin.fun(ba);




