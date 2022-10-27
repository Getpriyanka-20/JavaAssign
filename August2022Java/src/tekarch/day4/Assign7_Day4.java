
//7. check whether the given substring present in the given string or not.
package tekarch.day4;

import java.util.Scanner;

public class Assign7_Day4 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the String:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
	    System.out.println("Given String is:" +str);
	    
	    System.out.println("Enter the string or substring you want to check:");
	    String checkString =sc.nextLine();
	    
	    boolean B = str.contains(checkString);
	    
	    System.out.println("The string availability is:" +B);
	    
	   
	   
		

	}

}
