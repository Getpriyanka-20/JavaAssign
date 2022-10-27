//6.Sort ArrayList elements.
package tekarch.day9;

import java.util.*;

public class Assign6_7_Day9 {

	public static void main(String[] args) {
		
		ArrayList<Double> al= new ArrayList<Double>();
		al.add(0, 5.6);
		al.add(1, 4.5);
		al.add(2, 3.5);
		al.add(3, 2.4);
		al.add(4, 5.7);
		System.out.println("Arraylist is:"+al);
		
		al.sort(null);
		System.out.println("Sorted ArrayList is:"+al);
		
		System.out.println("ArrayList to String: "+al.toString());
		

	}

}
