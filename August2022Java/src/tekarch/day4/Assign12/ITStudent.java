//Student-> Id,result read() writeExam()
package tekarch.day4.Assign12;

public class ITStudent extends Student {
	int Id;
	String result;
	public void read() {
		System.out.println("Reaading in ITStudent");
	}
	
	public void writeExam()
	{
		System.out.println("Writing exam in ITStudent");
	}

	public static void main(String args[])
	{
	//	Person P = new ITStudent();
		Student I = new ITStudent();
		//Student I= new Student();
		//ITStudent I = new ITStudent();
		I.writeExam();
		I.read();
	}
}
