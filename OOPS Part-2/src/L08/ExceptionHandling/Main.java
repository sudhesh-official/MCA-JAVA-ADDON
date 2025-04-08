package L08.ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		// Main main = new Main();
		// main.case1(10, 0);
		// main.case2(10, 0);
		
		int y = 0, x;
		
		try {
			System.out.println("Before Exception");
			x = (y = 10 * 10) / 0;
			System.out.println("After Exception");
		} catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println(y);
		}
		
	}
	
	public void case1(int x, int y) {
		if (y != 0) {
			System.out.println("x/y=" + x/y);
		} else {
			System.out.println("The value of y is 0, a possible exception");
		}
	}
	
	public void case2(int x, int y) {
		try {
			System.out.println("x/y=" + x / y);
		} catch(Exception e)  {
			System.out.println(e);
			System.out.println("The value of y is 0, a possible exception" + e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}



	
	
	
	
	
	
	
	
	
	
	
}
