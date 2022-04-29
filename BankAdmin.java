
public class BankAdmin {

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
