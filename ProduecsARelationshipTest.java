
public class ProduecsARelationshipTest {

	public static void main(String[] args) {
		
		Applicant applicant = new Applicant();
		Form form = new Form();
		Application application = applicant.apply(form);
		
		BankAdmin admin = new BankAdmin();
		BankAccount baObj = admin.processApplication(application);
	
		
		GirCow cow = new GirCow();
		Milk m2 = cow.milkACow();
		Curd c = m2.coagulate();
		Butter b = c.churn();
		ClarifiedButter cf = b.boil();
		
		cf.healthyFood();
		
		Curd c2 = new GirCow().milkACow().coagulate();
		Butter b2 = new GirCow().milkACow().coagulate().churn();
		ClarifiedButter cf2 = new GirCow().milkACow().coagulate().churn().boil();
		
		Dairy dairy = new Dairy();
		ClarifiedButter cf3 = dairy.purchase();
		ClarifiedButter cf4 = dairy.purchase();
		ClarifiedButter cf5 = dairy.purchase();
		ClarifiedButter cf6 = dairy.purchase();
		
	}
}
class Dairy
{
	ClarifiedButter purchase() {
		GirCow cow = new GirCow();
		Milk m2 = cow.milkACow();
		Curd c = m2.coagulate();
		Butter b = c.churn();
		ClarifiedButter cf = b.boil();
		return cf;
	}
}

class Mammal
{
	
}
class Horn
{
	
}
class Hump
{
	
}
class Cow extends Mammal //isA
{
	Horn left = new Horn(); //hasA
	Horn right = new Horn(); //hasA
	Hump hump = new Hump(); //hasA
}
class GirCow extends Cow //isA
{
	Milk milkACow() {
		Milk m = new Milk();
		return m;
	}
}

class Milk
{
	Curd coagulate() {
		Curd curd = new Curd();
		return curd;
	}
}
class Curd
{
	Butter churn() {
		Butter butter = new Butter();
		return butter;
	}
}

class Butter
{
	ClarifiedButter boil() {
		ClarifiedButter cf = new ClarifiedButter();
		return cf;
	}
}

class ClarifiedButter
{
	void healthyFood() {
		System.out.println("Clarified Butter is the best for the total health....");
	}
}

class Application { }
class Form{ }
class Applicant
{
	Application apply(Form f) {
		
		Application app = new Application();
		return app;
	}
}
