
//1. add all the elements in the given array of size n
package tekarch.day5;

import java.util.Scanner;

public class Assign1_Day5 {

	public static void ArrayFunc() {
		int Sum = 0;
		int[] Arr = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < Arr.length; i++) {
			Sum = Sum + Arr[i];
		}
		System.out.println("Sum of all elements of array are:" + Sum);
	}

	public static void main(String[] args) {

		ArrayFunc();

	}

}
