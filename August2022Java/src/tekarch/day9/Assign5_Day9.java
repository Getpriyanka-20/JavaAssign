//5.How will you reverse a List?
package tekarch.day9;

import java.util.Iterator;
import java.util.LinkedList;

public class Assign5_Day9 {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Apple");
		ll.add("Banana");
		ll.add("Cantaloupe");
		ll.add("Dragon fruit");
		ll.add("Elderberry");
		
		Iterator<String> revll=ll.descendingIterator();
		
		while(revll.hasNext())
		{
			System.out.println(revll.next());
		}
		//System.out.println("Reverse linkedlist is:"+revll);

	}

}
