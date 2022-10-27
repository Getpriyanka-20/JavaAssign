package tekarch.day7;

import java.io.*;

public class Assign1_day7 {

	public static void main(String[] args) {
		boolean created= false;
		//File newFile = new File("C:\\Users/getsw/eclipse-workspace/August2022Java/src/myFile.txt");

//		try {
//			 created = newFile.createNewFile();
//		} 
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("File is created sucessfully!"  +created);
		
		File newdir = new File("C:\\Users/getsw/eclipse-workspace/August2022Java/src/Mydir");
		
		created = newdir.mkdir();
		
		System.out.println("Directory is created!!");
		
		

	}

}
