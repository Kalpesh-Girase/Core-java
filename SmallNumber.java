package com.ArrayDemo;

public class SmallNumber {
   
	public static void main(String[] args) {
		
		int a[]= {6,5,10,6,2,3,9,9,7};
		int i=0;
		int j=0;
	    int min=a[i];
	    int min2=a[j];
		for (i=0; i <8; i++) {
			if (a[i]<min) {
				min=a[i];
				System.out.println(min);
			}	
		}
		for (j = 0; j < 8; j++) {
			if (a[j]<min2 && a[j]!=min) {
				min2=a[j];
				System.out.println(min2);
			}
		}
		System.out.println("Smallest Number in Array ="+min); 
		System.out.println("Second Smallest Number in Array ="+min2); 
		
	 
		
	}
		
		
	}

