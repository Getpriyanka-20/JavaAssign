//10. program to remove given characters from the string?

package tekarch.day4;

import java.util.Scanner;

public class Assign10_Day4 {
	public static void main(String[] args) {
		System.out.println("Enter the string:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		System.out.println("Enter the character which is to be removed:");
		String c = sc.next();
		char c1 = c.charAt(0);

		StringBuilder newStr = new StringBuilder();
		char[] chararray = str.toCharArray();
		for (int i = 0; i < chararray.length; i++)
			if (chararray[i] != c1) {
				newStr.append(chararray[i]);
			}

		System.out.println("New String is:" + newStr);

	}

}
