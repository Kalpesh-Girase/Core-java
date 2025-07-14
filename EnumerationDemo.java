package CursorCollectionDemo;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {

		Stack al = new Stack();

		Vector a = new Vector();

		a.add(11);
		a.add(9);
		a.add(8);
		
		System.out.println(a);

		al.add(12);
		al.add(13);
		al.add(14);

		Enumeration e = al.elements(); // call Element

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

		}
	}
}

/*
 * it is only used in legacy classes like , vector.
 * 
 */