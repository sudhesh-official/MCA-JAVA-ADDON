package L10.StringFormattingInJava;

import java.util.Calendar;

public class TestFormat {

	public static void main(String[] args) {
		
		long n = 461012;
		
		System.out.format("%d%n", n);
		System.out.format("%08d%n", n);
		
		double pi = Math.PI;
		 System.out.format("%f%n", pi);
		 System.out.format("%.3f%n", pi);
		 
		 Calendar c = Calendar.getInstance();
		 System.out.format("%tB %te, %tY%n", c, c, c);
		 System.out.format("%tl:%tM %tp%n", c, c, c);
		 System.out.format("%tD%n", c);
		 
		 
			double dblTotal = 1011111.2525525255;
			int intValue = 25;
			String stringVal = "studyeasy";
			System.out.printf("Total is: $%,.2f%n", dblTotal);
			System.out.printf("Total: %-10.2f: ", dblTotal);
			System.out.printf("% 4d", intValue);
			System.out.printf("%20.10s\n", stringVal);
			String s = "Hello World";
			System.out.printf("The String object %s is at hash code %h%n", s, s);

		 
		 
		 
		 
		 
	}

}
