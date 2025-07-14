package NumberLogic;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" ======================// MAGICAL CODE //========================");
		System.out.println("Give Any Number You Want in 1 to 10 = ");
		int a = sc.nextInt();
		System.out.println("Take Your Friend Value Any You Want = ");
		int b = sc.nextInt();
		System.out.println("I wiil Give You My Number Any I want ");
		int c = sc.nextInt();
		int d =a+b+c;
		int v=(d/2);
		System.out.println("Addition Of All Numbers = "+d);
		System.out.println("Number is Divided By 2 And The Result is = "+v); 
		System.out.println("Return Your Friend Number = ");
		int x = sc.nextInt();
		x=v-x;
		System.out.println("Remaining Number is = "+x);
		
		
		
		
		
		
	}
}
