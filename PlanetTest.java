public class PlanetTest {
	public static void main(String[] args) {
		Planet planet1 = new Planet();
		Planet planet2 = new Planet();
		
		Planet planet3 = new Planet();
		
		planet3.setPlanet(3, "Earth", "149.6 Million", "4.543 Billion years", "775.28 Crores", 1,55);
		planet3.printPlanetInformation();
		float tempInCelsius= planet3.averageTemperature("C");
		System.out.println("Temperature in Celsius   : "+tempInCelsius);
		
		if(planet3.isHumanLiving()) {
			System.out.println("Human is living here...");
		}
		else {
			System.out.println("Human is not living here...");
		}
	}
}
class Magician
{
	void doTrick() { 
		
	}
	
}

class Chess
{
	int numberOfSquares; //64
	
	void moveBishop() {
		
	}
	void moveKnite() {
		
	}
}

class Planet
{
	private int planetNumber;
	private String planetName;
	private String distanceFromSun;
	private String age;
	private String population;
	private int numberOfMoon;
	private float temperatureInFahrenheit;

	//1
	void printPlanetInformation() {
		System.out.println("Planet Number            : "+planetNumber);
		System.out.println("Planet Name              : "+planetName);
		System.out.println("Planet Distance from Sun : "+distanceFromSun);
		System.out.println("Planet Age               : "+age);
		System.out.println("Planet Population        : "+population);
		System.out.println("Planet Number Of Moon    : "+numberOfMoon);
		System.out.println("Planet Temperature       : "+temperatureInFahrenheit);
	}
	
	//2
	void setPlanet(int pn, String pnm, String dist, String a, String pop, int moon,float temp)
	{
		planetNumber=pn;
		planetName=pnm;
		distanceFromSun=dist;
		age=a;
		population=pop;
		numberOfMoon=moon;
		temperatureInFahrenheit = temp;
	}
	
	//3
	float averageTemperature(String type) {
		float avgTemp=0;
		if(type.equals("C"))
			avgTemp=(temperatureInFahrenheit-32)/1.8f;
		return avgTemp;
	}
	
	//4
	boolean isHumanLiving() {
		if(planetName.equals("Earth"))
			return true;
		else
			return false;
	}
}

/*

String str1="jack";
String str2="jack";
if(  str1.equals(str2)  ) {
	
}

*/