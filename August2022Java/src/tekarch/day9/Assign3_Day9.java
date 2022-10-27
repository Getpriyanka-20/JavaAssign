////3.Write a java program to remove duplicate elements in arrayList
package tekarch.day9;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assign3_Day9 {

	public static void main(String[] args) {
		
	
		ArrayList<String> Fruits = new ArrayList<>();
		Fruits.add("Mango");
		Fruits.add("Orange");
		Fruits.add("Apple");
		Fruits.add("Cherry");
		Fruits.add("Cherry");
		Fruits.add("Orange");
		Fruits.add("watermelon");
		System.out.println("ArrayList with duplicate Elements is:" + Fruits);

		Set<String> st = new LinkedHashSet<>();
		st.addAll(Fruits);
		Fruits.clear();

		Fruits.addAll(st);

		System.out.println("Arraylist without duplicate elements:" + Fruits);

	}
}
