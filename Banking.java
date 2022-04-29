
public class Banking {
	public static void main(String[] args) {
		BankAccount ba1 = new BankAccount(101, "Jack", 50000, "9820443464");
		BankAccount ba2 = new BankAccount(102, "Jane", 60000, "8820443464");
		BankAccount ba3 = new BankAccount(103, "Jill", 70000, "6820443464");
		BankAccount ba4 = new BankAccount(104, "Jimy", 80000, "7820443464");
		
		System.out.println(ba1);
		System.out.println(ba2);
		System.out.println(ba3);
		System.out.println(ba4);
		
		System.out.println("-----------------");
		
		BankAdmin admin= new BankAdmin();
		admin.autherizedToChangeMobileNumber(ba1, "1231231231");
		admin.autherizedToChangeMobileNumber(ba2, "2231231231");
		admin.autherizedToChangeMobileNumber(ba3, "3231231231");
		admin.autherizedToChangeMobileNumber(ba4, "4231231231");
		
		System.out.println(ba1);
		System.out.println(ba2);
		System.out.println(ba3);
		System.out.println(ba4);

		System.out.println("--------------");
		admin.autherizedToChangeAccountHolderName(ba1,"Jackson");
		System.out.println(ba1);
		
		admin.autherizedToTransferAmount(ba1, ba2, 50000);
		System.out.println(ba1);
		System.out.println(ba2);
		
		
	}
}
