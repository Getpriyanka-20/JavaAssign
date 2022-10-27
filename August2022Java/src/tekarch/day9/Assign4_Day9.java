//4.Write a program to convert LinkedList to ArrayList
package tekarch.day9;

import java.util.*;

public class Assign4_Day9 {

	public static void main(String[] args) {

		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);

		List<Integer> aList = new ArrayList<Integer>(ll);

		System.out.println("ArrayList Elements are:");

		for (Object ele : aList) {
			System.out.println(ele);

		}

	}

}
