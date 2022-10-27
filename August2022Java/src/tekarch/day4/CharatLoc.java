package tekarch.day4;

import java.util.Scanner;

public class CharatLoc {

	public static void main(String[] args) {
		System.out.println("Enter the location:");
		Scanner sc = new Scanner(System.in);
		int loc = sc.nextInt();

		String s = "TekArch!";

		char c = s.charAt(loc);
		System.out.println("Character at given location is:" + c);

	}

}
