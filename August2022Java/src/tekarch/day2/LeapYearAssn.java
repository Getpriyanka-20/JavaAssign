package tekarch.day2;

import java.util.Scanner;

public class LeapYearAssn {

	public static void LeapYear(int Y) {
		if (Y % 4 == 0)
			System.out.println("Given year is a leap year!!");
		else
			System.out.println("Given year is not leap year");

	}

	public static void main(String[] args) {
		System.out.println("Enter the year:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LeapYear(n);

	}

}
