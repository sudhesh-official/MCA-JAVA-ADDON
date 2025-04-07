package L10.Polymorphism;


// Static / Compile-Time Polymorphism:
public class Calculator {
	
	/**
	 * Static polymorphism occurs at compile-time and is also known as 
	 * method overloading. It allows multiple methods with the same name but 
	 * different parameters to coexist in a class.
	 */
	
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public double add(double num1, double num2) {
		return num1 + num2;
	}

}
