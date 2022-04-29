//creator - creation - created
//Painter - painting - art
//developer - coding - code

class File { }
class WorkBook extends File //isA
{
	WorkSheet sheet1 = new WorkSheet();//hasA
	
	//returning
		Result process(Formula f) //passing
		{
			Result r = new Result();
			f.formulaLine="a+b";
			r.ans="c";
			return r;
		}
}
class WorkSheet { 
	Cell c1= new Cell();
	Cell c2= new Cell();
	Cell c3= new Cell();
	Cell c4= new Cell();
	Cell c5= new Cell();
	
}
class Cell 
{
	int rowNumber;
	String columnName;
	
}
class Result { 
	String ans;
}
class Formula {
	String formulaLine;
	
}

class Filament { }
class Light { }
class Electricity { }
class Bulb
{
	Filament filament = new Filament(); //hasA
	
	Light turnOn(Electricity e) {
		//.......
		//...
		Light l = new Light();
		return l;
	}
}

class Dance
{
	
}
class Person
{
	
}
class Dancer extends Person//isA
{
	Dance dancing() 
	{
		Dance d = new Dance();
		return d;
	}
}
class Forest
{
	Tree growTree() {
		Tree t = new Tree();
		return t;
	}
}

class Tree
{
	Wood cutIt() {
		Wood w = new Wood();
		return w;
	}
}
class Wood
{
	
}

public class BankAdmin {

	BankAccount processApplication(Application app) {
		
		BankAccount ba1 = new BankAccount(101,"Jack",5000,"9292929292");
		
		return ba1;
	}
	
	void autherizedToChangeMobileNumber(BankAccount ref, String newNumber)
	{
			ref.setMobileNumber(newNumber);
			System.out.println("mobile number changed....");
	}
	void autherizedToChangeAccountHolderName(BankAccount ref, String newName)
	{
		ref.setAccountHolderName(newName);
		System.out.println("name changed....");
	}
	void autherizedToDepositAmount(BankAccount ref, double amountToDeposit)
	{
		double currentBalance = ref.getAccountBalance();
		double newBalance = currentBalance + amountToDeposit;
		ref.setAccountBalance(newBalance);
		System.out.println("Deposit successful....");
	}
	void autherizedToWithdrawAmount(BankAccount ref, double amountToWithdraw)
	{
		double currentBalance = ref.getAccountBalance();
		double newBalance = currentBalance - amountToWithdraw;
		ref.setAccountBalance(newBalance);
		System.out.println("Withdraw successful....");
	}
	void autherizedToTransferAmount(BankAccount src,BankAccount trg, double amountToTransfer)
	{
		double sourceBalance = src.getAccountBalance() - amountToTransfer;
		double targetBalance = trg.getAccountBalance() + amountToTransfer;
		src.setAccountBalance(sourceBalance);
		trg.setAccountBalance(targetBalance);
		System.out.println("Transfer successful....");
	}
}
