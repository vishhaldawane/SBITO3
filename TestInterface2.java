
interface Withdrawing
{
	void withdraw();
}
interface Depositing
{
	void deposit();
}
class BA{}
class SA extends BA implements Withdrawing, Depositing
{
	public void deposit() { }
	public void withdraw() { }
}

class FundTransferService
{
		void transfer(Withdrawing s, Depositing t, float amt) {
			s.deposit();
			t.withdraw();
		}
}
public class TestInterface2 {

	public static void main(String[] args) {

		Actor a = new Actor();
		a.act();
		a.dance();
		a.talk();
		
		System.out.println("----------------");
		
		FighterActor f = new FighterActor();
		f.act();
		f.dance();
		f.fight();
		f.jump();
		
		
		System.out.println("---------------");
		
		Acting aa = new Actor();
		aa.act();
		aa.dance();
		aa.talk();
		
		System.out.println("---------------");
		
		Crying c = new Actor();
		c.act();
		c.cry();
		c.dance();
		c.fight();
		c.talk();
	
		Dancing dd = new Actor();
		dd.dance();
		dd.act();
		dd.talk();
		
		System.out.println("---------------");
		Fighting ff = new FighterActor();
		ff.fight();
		ff.act();
		ff.talk();
		ff.dance();
		
		System.out.println("---------------");
		Dancing ddd = new FighterActor();
		ddd.fight();
		ddd.act();
		ddd.talk();
		ddd.dance();
		
		//Fighting d = new FighterActor();
		Scene s = new Scene();
		s.danceScene(ddd);
		
		Scene.fightScene(new FighterActor());
		Scene.danceScene(new FighterActor());
		Scene.normalActing(new FighterActor());
	}
}
class Scene
{//if a method is taking super class as an argument, then u can invoke
//that method by sending any one of the child of the super class too
	static void fightScene(Fighting f)
	{
		f.fight();
		//f.act();
		//f.dance();
	}
	
	static void danceScene(Dancing d) //polymorphic method
	{
		d.dance();
		d.dance();
		d.dance();
		d.dance();
		
		if(d instanceof FighterActor) {
			FighterActor f = (FighterActor) d;
			f.dance();
			d.fight();
			float        ff=  (float)       10.9;
			f.fight();
			f.dance();
			
			f.act();
			f.talk();
			f.cry();
		}
		//d.dance();
		//d.fight();
	}
	static void normalActing(Acting a) {
		a.act();
	
		//a.fight();
		if(a instanceof FighterActor) {
			Fighting f = (FighterActor)a;
			f.fight();
			Dancing d = (FighterActor)a;
			d.dance();

		}
		
		
	}
}
interface Acting
{
	void act();
}
interface Crying extends Acting
{
	void cry();
}

interface Fighting
{
	void fight();
}
interface Dancing
{
	void dance();
}
class Actor implements Crying, Dancing
{
	public void cry() {
		
	}
	public void act() {
		
	}
	public void dance() {
		
	}
	void talk() {
		
	}
}
class FighterActor extends Actor implements Fighting
{
	void jump() {
		
	}
	public void fight() {
		
	}
}
