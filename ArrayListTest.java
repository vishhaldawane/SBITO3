public class ArrayListTest {
	public static void main(String[] args) {

	//	ArrayList myList = new ArrayList();
		
		int a=100;
		int b=50;
		int c=30;
		int d=60;
		int e=17;
		
		int f=32;
		int g=44;
		int h=9;
		int i=4;
		int j=83;
		
		int k=23;
		
		
		System.out.println("a "+a);
		System.out.println("b "+b);
		System.out.println("c "+c);
		System.out.println("d "+d);
		System.out.println("e "+e);
		System.out.println("f "+f);
		System.out.println("g "+g);
		System.out.println("h "+h);
		System.out.println("i "+i);
		System.out.println("j "+j);
		System.out.println("k "+k);
		
		int total = a+b+c+d+e+f+g+h+i+j+k;
		System.out.println("total "+total);
		
		int score=0;
		int batsman[] = {100,50,30,60,17,32,44,9,4,83,23};
		for (int x = 0; x < batsman.length; x++) {
			System.out.println("batsman : "+batsman[x]);
			score = score + batsman[x];
		}
		System.out.println("score : "+score);
		
		int aus[] = new int[11];
		aus[0]=90;
		aus[1]=10;
		aus[2]=30;
		aus[3]=80;
		aus[4]=90;
		aus[5]=40;
		
		int ausScore=0;
		for (int x = 0; x < aus.length; x++) {
			System.out.println("Aus : "+aus[x]);
			ausScore= ausScore+ aus[x];
		}
		System.out.println("Aus score "+ausScore);
		
		
		System.out.println("End of main ");
	}
}
/*
  collection and jdbc
  servlets and jsp 1 - java script / jquery
  oracle sql plsql
  junit test cases
  maven github
  hibernate		S
  spring		S
  angular - ms code S 
 3 project - S
  
  4 X 8 X 3 days 
  
 */
