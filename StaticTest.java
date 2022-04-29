class Kite
{
	String kiteColor;
	String kiteOwner;
	int length;
	boolean flyingStatus;
	
	static int kiteCount;//class's data-it's never as object's data

	public Kite(String kiteColor, String kiteOwner, int length, boolean status) {
		super();
		System.out.println("Kite ctor....");
		this.kiteColor = kiteColor;
		this.kiteOwner = kiteOwner;
		this.length = length;
		flyingStatus = status;
		++kiteCount;
	}

	@Override
	public String toString() {
		return "Kite [kiteColor=" + kiteColor + ", kiteOwner=" + kiteOwner + ", length=" + length + "]";
	}
	
	void fly() {
		System.out.println(kiteColor+" color Kite is flying.....by "+kiteOwner+" length is "+length+" flying status "+flyingStatus);
	}
	
	void kiteFight(Kite ref) {
		
		for(int i=1;i<=10;i++) {
			double val = Math.random()%100;
			System.out.println("Kite fight started between "+kiteOwner+" and "+ref.kiteOwner+" "+val);
			if(val >0.98) {
				ref.flyingStatus=false;
				kiteCount--;
				break;
			}
			else  if(val <0.10) {
				flyingStatus=false;
				kiteCount--;
				break;
			}
			else  if(val >=0.60 && val <0.70) {
				flyingStatus=false;
				ref.flyingStatus=false;
				kiteCount = kiteCount-2;
				break;
			}
		}
	}
	//intelliJ
}

public class StaticTest {
	public static void main(String[] args) {
		
		System.out.println("kite count is "+Kite.kiteCount);
		
		Kite k1 = new Kite("Red","Jack",50,true);
		Kite k2 = new Kite("Blue","Jane",60,true);
		Kite k3 = new Kite("Black","Jill",70,true);

		System.out.println("kite count is "+Kite.kiteCount);

		k1.fly();
		k2.fly();
		k3.fly();
		
		
		k1.kiteFight(k2);
		
		System.out.println("kite count is "+Kite.kiteCount);
		
		k1.fly();
		k2.fly();
		k3.fly();
		
		
	}
}
//object crawler/spider
 
