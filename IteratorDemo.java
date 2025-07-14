package CursorCollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList a = new ArrayList();
		a.add(10);
		a.add(11);
		a.add(12);
		a.add(13);
		a.add(14);
		a.add(15);
		a.add(16);
		a.add(17);
		a.add(18);
		a.add("hello");
		a.add(19);
		a.add(20);

		Iterator i = a.iterator();

		while (i.hasNext()) {
			System.out.println(i.next());

		}

	}
}


/*
 * 1. it can work on any collection .
 */







