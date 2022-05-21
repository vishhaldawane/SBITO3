package com.sbi.dept;

class D {
	void withdraw() {
		System.out.println("\t\t\t\t\tDATABASE IS HIT....");
	}
}
class P {
	D d = new D();
	void withdraw() {
		System.out.println("\t\t\t\tPOJO IS HIT....");
		d.withdraw();
	}
}
class R {
	P p = new P();
	void withdraw() {
		System.out.println("\t\t\tREPO IS HIT....");
		System.out.println("\t\t\tsimple hitting the select query....");
		p.withdraw();
		System.out.println("\t\t\tREPO IS OVER....");
	}
}
class S {
	R  r = new R();
	void withdraw() {
		System.out.println("\t\tSERVICE IS HIT....");
		System.out.println("\t\tverifying username and password....");
		r.withdraw();
		System.out.println("\t\tverified username and password....");
		
	}
}

class C	{
	S s = new S();
	void withdraw() {
		System.out.println("\tCONTROLLER IS HIT....");
		s.withdraw();
		System.out.println("\tCONTROLLER IS OVER....");
	}
}
class A	{
	C c = new C();
	void withdraw() {
		System.out.println("ANGULAR UI IS HIT....");
		c.withdraw();
		System.out.println("ANGULAR UI IS OVER....");
	}
}


public class TestSeries {
	public static void main(String[] args) {
		A a = new A();
		a.withdraw();
	}
}
