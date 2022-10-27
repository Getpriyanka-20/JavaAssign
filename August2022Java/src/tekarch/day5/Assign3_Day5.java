//3. find unique elements in the array
package tekarch.day5;

import java.util.Arrays;
import java.util.Scanner;

public class Assign3_Day5 {

	public void UniqueArr() {
		System.out.println("Enter the size of array:");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];
		System.out.println("Enter elements to the array:");
		for (int i = 1; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("Array is" +arr);
		Arrays.sort(arr);
		System.out.println("Sorted Array is" +arr);
		

	    
	}
//		int count = 1;
//		for (int j = 0; j < arr.length; j++) {
//			while (arr[j] == arr[j + 1]&& (j+1)<= arr.length-1) {
//				count++;
//				j++;
//			}
//			if (count == 1) {
//				System.out.println(arr[j] + "element is Unique");
//			} else
//				System.out.println(arr[j] + "element is not unique");
//
//		}
//
//	}

	public static void main(String[] args) {
		Assign3_Day5 ad = new Assign3_Day5();
		ad.UniqueArr();
		

	}

}
