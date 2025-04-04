package controlstatements;

public class SwitchStatement {

	public static void main(String[] args) {
		
		/**
		 * switch statement:
		 * The switch statement evaluates an expression and executes different blocks of code 
		 * based on different cases. 
		 * It provides an alternative to long if-else chains.
		 */
		
		int day = 5;
		/*
		if (day == 3) {
			System.out.println("Tuesday");
		} */
		switch (day) {
		case 1: {
			System.out.println("Sunday");
			break;
		} case 2: {
			System.out.println("Monday");
			break;
		} case 3: {
			System.out.println("Tuesday");
			break;
		} case 4: case 5: case 6: {
			System.out.println("Holiday");
			break;
		}
		default:
			System.out.println("Invalid day");
		}
	}

	
	
	
	
	
	
	
	
	
}
