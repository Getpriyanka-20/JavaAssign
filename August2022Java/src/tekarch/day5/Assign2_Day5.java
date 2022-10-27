//2. find maximum element in the array
package tekarch.day5;

public class Assign2_Day5 {
	
	public static void ArrayFunc()
	{
		int[] Arr = {2,4,6,5,9,7};
		 int max =Arr[0];
		
		for(int j = 0; j<Arr.length; j++)
		{
			if(Arr[j]> max)
				max=Arr[j];
		}
		System.out.println("Maximum element in the array is:"+max);
	}

	public static void main(String[] args) {
		ArrayFunc();
		
		

	}

}
