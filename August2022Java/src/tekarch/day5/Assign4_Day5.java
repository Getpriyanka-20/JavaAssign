//print only even numbers in the given array

package tekarch.day5;

import java.util.Scanner;

public class Assign4_Day5 {

	public void Arrayfunc() {
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter elements of array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		for (int j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0)
				System.out.println("Even Numbers in the array are:" + arr[j]);
		}

	}

	public static void main(String[] args) {
		Assign4_Day5 ad = new Assign4_Day5();
		ad.Arrayfunc();

	}

}
