package com.ArrayDemo;

public class AdditionOfArray {

	public static void main(String[] args) {

		int arr[] = { 3, 45, 6, 6, 8, 9 };
		int max = 1, max1 = 1;
		{
			for (int i = 0; i < arr.length; i++) {

				max = arr[i] + max;
				max1 = arr[i] * max1;

			}
			System.out.println("Addition Of All Array Element is = " + max);
			System.out.println("Multiplication Of All Array Element is = " + max1);
		}
	}
}
