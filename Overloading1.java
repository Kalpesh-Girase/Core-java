package Polymorphism;

public class Overloading1 {
	
	
	public int m1(int x ,double a) {
	   System.out.println("Hey");
	   return x;
	}
	
	public int  m1(int v,int a) {
		System.out.println("I am Kalpesh");
		return v;
	}
	
	public int m1(int a) {
		System.out.println("Java Full Stack developer");
		return a; 
	}
	
	public static void main(String[] args) {
		Overloading1 a1 = new Overloading1  ();
		
		System.out.println(a1.m1(3,5.5));
		System.out.println(a1.m1(10,2));
		System.out.println(a1.m1(2));
		
	}

}

// Method Overloading Can  be Achieve in a Same Class;
//Same Name But Different In Parameter / Argument; 
