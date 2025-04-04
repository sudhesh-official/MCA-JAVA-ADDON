package variables;

public class VariableTypes {
	
	static int age = 25; // Instance variable
	

	public static void main(String[] args) {
		
		/**
		 * Variables and their types in Java
		 * local variables, instance variables, and static variables
		 * Local Variables:
		 * Key points:
		 * They are declared within a method, constructor, or block using 
		 * the appropriate data type.
		 */
		int num = 10; // Local variable
		System.out.println(num);
		/**
		 * Instance Variables:
		 * Key points:
		 * They are declared within a class but outside any method, 
		 * constructor, or block.
		 */
		System.out.println(age);
		/**
		 * Static Variables (Class Variables):
		 * Key points:
		 * They are declared within a class but outside any method, 
		 * constructor, or block, and are 
		 * marked with the static keyword.
		 */
		
		// Variable Declaration:
		/*
		int age;
		double salary;
		String name;
		*/
		// Variable Initialization:
		int age = 25;
		double salary = 50000.5;
		String name = "John";
		
		// Default Values:
		int count; // default value: 0
		double price; // default value: 0.0
		boolean isTrue; // default value: false
		String message; // default value: null
		
		// Multiple Variable Declaration:
		int a = 1, b = 2, c = 3;
		String firstName = "John", lastName = "Doe";
		
		// Final Variables:
		/**
		 * The final keyword is used to declare constants in Java. 
		 * Final variables cannot be reassigned once initialized. 
		 * They must be assigned a value during declaration or within 
		 * the constructor if declared as an instance variable. 
		 * Final variables are typically written in uppercase letters.
		 * 
		 */
		final double PI = 3.14159;
		final int MAX_VALUE;
		MAX_VALUE = 100;
		
		/**
		 * Variable Naming Rules:
		 *    Variable names are case-sensitive.
			● The first character must be a letter, underscore (_), 
			or dollar sign ($).
			● Subsequent characters can be letters, digits, 
			underscores, or dollar signs.
			● Java keywords cannot be used as variable names.
			● Variable names should be descriptive and meaningful.
		 */		
		
	}

}
