package tekarch.day4.Assign12;

public class MathStudent extends Student
{
	String result;
	public static void  doMath()
	{
		System.out.println("Solving Problrms from Math Student");
	}
	
	public void writeExam()
	{
		System.out.println("Writing exams from MathStudent");
	}
	
	public static void main(String[] args) {
	    //Student ms = new MathStudent();
		MathStudent ms = new MathStudent();
		doMath();
		ms.read();
		
	
	}

}
