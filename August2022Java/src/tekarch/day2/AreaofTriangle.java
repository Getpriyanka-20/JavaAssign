package tekarch.day2;

import java.util.Scanner;

public class AreaofTriangle {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height and base of triangle:");
		int height = sc.nextInt();
		int base =sc.nextInt();
		
		float Area = (height * base)/2;
		
		System.out.println("Area of triangle:" + Area);	
	}

}
