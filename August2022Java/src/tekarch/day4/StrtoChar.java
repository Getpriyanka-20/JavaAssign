package tekarch.day4;

public class StrtoChar {

	public static void main(String[] args) {
		String str = "Priyanka";

		char[] name = str.toCharArray();
		for (int i = 0; i < name.length; i++) {
			System.out.println("String to character Array:" + name[i]);
		}

	}

}


