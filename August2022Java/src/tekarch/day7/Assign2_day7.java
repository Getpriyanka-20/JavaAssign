
//Read file content using scanner class and print it to console
package tekarch.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Assign2_day7 {

	public static void main(String[] args) throws FileNotFoundException {
		File myfile = new File("C:\\Users/getsw/eclipse-workspace/August2022Java/src/myFile.txt");
		
		Scanner sc = new Scanner(myfile);
		
		StringBuffer sb = new StringBuffer();
		
		while(sc.hasNext())
		{
			sb.append(" "+ sc.nextLine());
		}
		System.out.println(sb);
				sc.close();
	}

}
