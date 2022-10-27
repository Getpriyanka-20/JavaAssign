package tekarch.day1;

import java.util.Scanner;

public class Add3number_ass1 {

	public static void main(String[] args) {
		
//		int a =10;
//		int b =45;
//		int c  = 78;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three Integer numbers:");
		int a = sc.nextInt();
		int b =sc.nextInt();
		int c = sc.nextInt();
		
		int sum = a+b+c;
		System.out.println("Addition of three number is:"+ sum);

	}

}
