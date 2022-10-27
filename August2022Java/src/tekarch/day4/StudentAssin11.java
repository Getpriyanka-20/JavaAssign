//create 5 student object with name,id,marks1,marks2,marks3. store it in student array and print the content of the array.

package tekarch.day4;

public class StudentAssin11 {
	

	String name;
	int id;
	int marks1;
	int marks2;
	int marks3;
	StudentAssin11(String name, int id, int m1, int m2, int m3)
	{
		this.name =name;
		this.id =id;
		this.marks1 =m1;
		this.marks2=m2;
		this.marks3 =m3;
		
	}
	
	public void display()
	{
		
	}
	
	public static void main(String[] args) {
		
		StudentAssin11 st[] = new StudentAssin11[5];
		   st[0] = new StudentAssin11("abc",123,10,20,30);
		 st[1] = new StudentAssin11("edg",456,40,50,60);
		    st[2] = new StudentAssin11("hij",789,70,80,90);
		 st[3] = new StudentAssin11("klm",123,10,20,30);
		 st[4] = new StudentAssin11("nop",456,20,30,40);
		 
		 for( int i =0;i<st.length;i++) {
		  int j =i+1;
		  System.out.println("student"+j);
		  st[i].display();
		  System.out.println();
		 }
		// TODO Auto-generated method stub

	}
}


