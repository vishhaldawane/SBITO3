
public class TestInterfaces {

	public static void main(String[] args) {
		Z z =new Z();
		
				
	}
}

abstract class X
{
   abstract void wow1();
   abstract void wow2();
   abstract void wow3();
   
   void fun1() { }	
   void fun2() { }
   void fun3() { }
   void fun4() { }
   void fun5() { }
   
}
class Y extends X
{
	void foo1() { }
	void foo2() { }
	void foo3() { }
	void foo4() { }
	void foo5() { }
	void foo6() { }
	@Override
	void wow1() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void wow2() {
		// TODO Auto-generated method stub
		
	}
	@Override
	void wow3() {
		// TODO Auto-generated method stub
		
	}
}
interface A {
	void fee1();
	void fee2();
	void fee3();
}
interface B extends A
{
	void foe1();
	void foe2();
	void foe3();
	void foe4();
	void foe5();
}

interface P
{
	void fee1();
	void fee2();
	void fee3();
	void fee4();
	void fee5();
}
interface Q extends P
{
	void fea1();
	void fea2();
	void fea3();
	void fea4();
	void fea5();
}
interface R extends Q
{
	void few1();
	void few2();
	void few3();
	void few4();
	void few5();
}
class Z extends Y implements B,R
{

	@Override
	public void fee1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fee2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fee3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foe1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foe2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foe3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foe4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foe5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fea1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fea2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fea3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fea4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fea5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fee4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fee5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void few1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void few2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void few3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void few4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void few5() {
		// TODO Auto-generated method stub
		
	}
	
}