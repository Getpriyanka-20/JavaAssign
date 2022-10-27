//1.How would you convert an ArrayList to Array and an Array to ArrayList?
package tekarch.day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assign1_Day9 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr =new ArrayList<Integer>();
		
		arr.add(0, 10);
		arr.add(0, 20);
		arr.add(0, 30);
		arr.add(0, 40);
		
		System.out.println("Arraylist is :"+ arr);
		
	System.out.println("ArrayList to Array..........."); 
      Integer[] a=  arr.toArray(new Integer[arr.size()]);
      for(int i:a)
      {
		System.out.print(i);
      }
		
      System.out.println("\nArray to ArrayList.............");
      
      List <Integer> l2 = arr;
      
      l2 =Arrays.asList(a);
      System.out.println(l2);

	}

}
