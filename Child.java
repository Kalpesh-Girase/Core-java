package Interface;

public class Child implements Parent {

	@Override
	public void m1() {
		System.out.println("Method m1");
	
	}

	@Override
	public void m2() {
		System.out.println("Methid 2");
		
	}
	
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("default method");
		
	}
	 public static void m4() {
		// TODO Auto-generated method stub

	}
	 
	 
	
	

	public static void main(String[] args) {
		
		Child c1 = new Child();
		
		c1.m1();
		c1.m2();
		c1.m3();
		m4();
		
	}
}
