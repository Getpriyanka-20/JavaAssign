package tekarch.day1;

import java.util.Scanner;

public class DoubleFloat {

	public static void main(String[] args) {
		System.out.println("Enter a decimal no:");
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		float num2 = (float) num1;
		
		System.out.println("Double into Float  :" +num2);
		

	}

}
