package tekarch.day2;

import java.util.Scanner;

public class ArrayClassAss {

	public static void main(String[] args) 
	{
		   
		    Scanner c = new Scanner(System.in);
			System.out.println("Enter the size of Array:");
			int  name =c.nextInt();
			
			int arr [] = new int [name];
			
			System.out.println("Enter array elements:");
			
			for(int n = 0; n<arr.length; n++) {
				arr[n]=c.nextInt();
			}
			System.out.println("Elements are:");
			for(int ele:arr) {                                //for each loop or enhanced loop ----used to print the content of array.
				System.out.println(ele);
			}
				
	}

}
