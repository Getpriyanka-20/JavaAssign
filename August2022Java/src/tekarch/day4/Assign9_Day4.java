
//9. check if two strings are the same ignoring their cases.
package tekarch.day4;

import java.util.Scanner;

public class Assign9_Day4 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter two Strings:");
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		if(str1.equalsIgnoreCase(str2))
		{
			System.out.println("Both strings are same");
		}
		else
			System.out.println("Both strings not same");		
	}

}
