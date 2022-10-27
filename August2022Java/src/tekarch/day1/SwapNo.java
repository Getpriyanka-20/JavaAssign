package tekarch.day1;

import java.util.Scanner;

public class SwapNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Integer numbers:");
		int a = sc.nextInt();  //10
		int b = sc.nextInt();  //20
		
		 b = b-a;    //20-10
		System.out.println("value of b is: "+b);  //10
		
		a= a+b;   //10+10
		
		System.out.println("value of a is: "+a);
		
		

	}

}
