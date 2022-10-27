//find the index of given character or substring(first character index)

package tekarch.day4;

import java.util.Scanner;

public class IndexofChar {

	public static void main(String[] args) {

		String str = "Selenium Automation batch! ";
		System.out.println("Enter the character or String whose index to be found:");
		Scanner sc = new Scanner(System.in);
		String c = sc.nextLine();

		int index = str.indexOf(c);
		System.out.println("Index of given string is:" + index);

	}

}
