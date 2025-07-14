package com.exception_handling;

public class Demo {

	public int m1() {
		try{
			int a = 20 / 0;
			System.out.println("This is try Block");
			return 0;
			
		}catch (Exception e) {

			System.out.println("This is Catch Block");
			System.exit(0);
			return 2;
			
		}finally {
			System.out.println("This is Used To Cleanup The Code");
		}
   }

	  public static void main(String[] a) {

		System.out.println("This is Main Method");
		int x = new Demo().m1();
		System.out.println(x);
	}
}
