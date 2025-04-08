package datatypes;

public class AreaOfTheCircle {

	public static void main(String[] args) {
		
		// bcde - abcd
		
		// r = 7; (22/7.0) * r * r; 154 or 153.12345985
		
		int r = 7;
		
		double result1 = Math.PI * r * r ;
		double result2 = Math.PI * Math.pow(r, 2) ;
		double result3 = (22/7.0) * Math.pow(r, 2) ;
		double result4 = (22/7.0) * r * r ;
		
		System.out.println("Result1 : " + result1);
		System.out.println("Result1 : " + result2);
		System.out.println("Result1 : " + result3);
		System.out.println("Result1 : " + result4);
	}

}
