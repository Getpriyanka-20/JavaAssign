package tekarch.day1;

import java.util.Scanner;

public class MinOfTwo_no {

	public static void main(String[] args) {
		System.out.println("ENTER TWO NUMBERS TO FIND MINIMUM OF THEM:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
	    int	min = Math.min(num1, num2);
		
		System.out.println("Minimum between two no is: "+ min );

	}

}
