package L07.StringHandlingInJava;

public class Main {

	public static void main(String[] args) {
		
		String a = "study";
		String b = "easy";
		// String c = a + b;
		String c = a.concat(b);
		System.out.println(c);
		System.out.println(c.replace("easy", "Hard"));
		
		if (c.equals("studyeasy") ) {
			System.out.println("studyeasy");
		} else {
			System.out.println("Studyhard");
		}
	}

}
