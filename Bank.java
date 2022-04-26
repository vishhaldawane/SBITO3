class Bank
{
  public static void main(String args[])
  {
	Home h= new Home();
	h.doRegister();
  }
}
class Home
{
	void doRegister() {
		System.out.println("doRegister() is invoked...");
		Register reg = new Register();
		reg.registration();
		doLogin();	
        }
	void doLogin() {
		System.out.println("doLogin() is invoked...");
		Login log = new Login();		
		log.authenticate();
	}

}



class Login
{
	void authenticate() {
		System.out.println("authenticate() is invoked...");
		DashBoard db = new DashBoard();
		db.presentDashBoard();
	}
}
class Register
{
	void registration() {
		System.out.println("registration() is invoked...");		
	}
}
class DashBoard
{
	void presentDashBoard()
	{
		System.out.println("DashBoard is presented....");

		ViewBalance vb = new ViewBalance();
		vb.printBalance();

		AddPayee ap = new AddPayee();
		ap.addAPayee();
		ap.viewingAPayee();
		ap.deleteAPayee();

		Transfer t = new Transfer();
		t.doNEFT();
		t.doRTGS();
		t.doIMPS();

		Statement st = new Statement();
		st.monthlyStatement();
		st.quarterlyStatement();
		st.yearlyStatement();

		Logout lg = new Logout();
		lg.doingLogout();
	}
}
class Logout
{
	void doingLogout() {
		System.out.println("doing logout..");
	}
}


class ViewBalance
{
	void printBalance() {
			System.out.println("Your balance is Rs.0/-");
	}
}
class AddPayee
{
	void addAPayee() {
		System.out.println("Adding a Payee....");
	}
	void deleteAPayee() {
		System.out.println("Deleting a Payee....");
	}
	void viewingAPayee() {
		System.out.println("Viewing a Payee....");
	}
}
class Transfer 
{
	void doNEFT() {
		System.out.println("doing NEFT....");
	}
	void doRTGS() {
		System.out.println("doing RTGS....");
	}
	void doIMPS() {
		System.out.println("doing IMPS....");
	}
}
class Statement
{
	void monthlyStatement() {
		System.out.println("Generating monthly..statement");
	}
	void quarterlyStatement() {
		System.out.println("Generating quarterly..statement");
	}
	void yearlyStatement() {
		System.out.println("Generating yearly..statement");
	}
}
