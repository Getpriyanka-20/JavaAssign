package tekarch.day2;

import java.util.Scanner;

public class ArrayTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of  rows in Array:");
		int rows = sc.nextInt();

		System.out.println("Enter the size of  coloumns in Array:");
		int col = sc.nextInt();

		int arr[][] = new int[rows][col];

		System.out.println("Enter array Elements:");

		for (int r = 0; r < arr.length; r++)
			for (int c = 0; c < arr.length; c++) {
				arr[r][c] = sc.nextInt();
			}

		System.out.println("Elemnets are:");

		for (int[] ele : arr) {
			for (int e : ele) {
				System.out.print(e + " ");
			}
			System.out.println();

		}

	}
}
