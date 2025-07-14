package com.exception_handling;

public class Demo3 {

	public void m1()throws  ArithmeticException
{
		int i=0;
		int a = 20 / i;
		System.out.println(a);
	}

	public void m2() {
		System.out.println("Hello");
		m1();
	}

	public static void main(String[] args) {
		
		new Demo3().m2();
		
	}
}
