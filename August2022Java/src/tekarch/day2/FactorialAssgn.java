package tekarch.day2;

import java.util.Scanner;

public class FactorialAssgn {
	public static void Factorial(int N) {

		int X = 1;
		for (int i = 1; i <= N; i++)
			X = X * i;
		System.out.println("N is:" + X);
	}

	public static void main(String[] args) {
		System.out.println("Enter the number whose factorial to find:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Factorial(n);

	}

}
