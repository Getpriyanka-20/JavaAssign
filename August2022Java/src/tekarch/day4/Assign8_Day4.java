//8. count the number of words in a given string sentence?
package tekarch.day4;

import java.util.Scanner;

public class Assign8_Day4 {

	public static void main(String[] args) 
	{
		System.out.println("Enter the sentence:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String subString[] =
				 str.split(" "); 
		int count = 0; 
		for (int i = 0; i < subString.length; i++)
				  count++;
		
		//int num = str.length();
		
		System.out.println("Number of words in a sentence is:" +subString);

	}

}
