package org.add;

import java.util.ArrayList;

public class ArrayAdd {

	public static void main(String[] args) {
		ArrayList l =new ArrayList();

		l.add(10);
		l.add(20);
		l.add(30);
		l.add(90);
		l.add(10);	
		l.add(10);		
		l.add(40);		
		l.add(50);

		System.out.println(l);
//		Q8.1:Add a value 50 in the 2nd index and display the list after adding.
		/*l.add(2, 50);
		System.out.println(l); */
		
//		Q8.2:Add a value 70 at the end of the list
		/*l.add(9, 70);
		System.out.println(l);*/
		
//		Q8.3:Add a value 80 at the 8th index of list
		/*l.add(8, 80);
		System.out.println(l);	*/
		
//		Q8.4:Add a value 100 at the last index of 10 in the list
		int last = l.lastIndexOf(10);
		l.add(last, 100);
		System.out.println(l);	
	}
	
	
}
