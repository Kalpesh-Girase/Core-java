package com.exception_handling;

public class Demo2 {

	public int m1() {
		try {
			int a = 20 / 0;
			System.out.println("Hlw");
			System.exit(a);

		} catch (ArithmeticException e) {
			System.out.println("This is Arithmetic Exception");

			System.exit(0);

		} finally {
			System.out.println("Cleared");
		}
		return 0;

	}

	public static void main(String[] a) {

		int d = new Demo2().m1();

	}
}
