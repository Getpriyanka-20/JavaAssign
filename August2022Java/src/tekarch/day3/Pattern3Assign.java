package tekarch.day3;
//n=4 then o/p= 6 9 12 15
public class Pattern3Assign {

	public static void main(String[] args) 
	{
		int i = 17;
		do {
			if (i % 3 == 0)
				System.out.println(i);
			i--;
		} while (i >= 4);
		

	}

}
