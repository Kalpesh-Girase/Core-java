package com.ArrayDemo;

import java.util.Iterator;

public class DuplicateNumber {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 6, 7, 6, 4, 2, 4, 5, 5 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.println("Duplicate Value  = " + arr[i]);
				}
			}

		}

	}
}
