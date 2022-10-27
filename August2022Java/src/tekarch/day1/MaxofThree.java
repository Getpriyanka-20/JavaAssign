package tekarch.day1;

import java.util.Scanner;

public class MaxofThree {

	public static void main(String[] args) 
	{
		System.out.println("Enter three numbers to find maximum:");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = Math.max(num1, num2);
		int finalmax = Math.max(max,num3);
		System.out.println("Maximum of three numbers is:" +finalmax);



	}

}
