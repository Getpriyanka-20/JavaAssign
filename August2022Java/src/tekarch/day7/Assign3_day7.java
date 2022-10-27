
//Write data “hi i am in tekarch training” to file using printWriter class
package tekarch.day7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class Assign3_day7 {

	public static void main(String[] args) {
		boolean value = false;

		File newfile1 = new File("C:\\Users/getsw/eclipse-workspace/August2022Java/src/file2.txt");

		try {
			value = newfile1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("File Created!!");

		try {
			PrintWriter pw = new PrintWriter(newfile1);
			pw.write("hi i am in tekarch training");
			pw.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Sucesss!!");

	}

}
