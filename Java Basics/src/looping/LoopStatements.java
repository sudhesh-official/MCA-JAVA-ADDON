package looping;

public class LoopStatements {

	public static void main(String[] args) {
		
		/**
		 * Looping:
		 * Loop statements allow the program to repeat a block of code 
		 * multiple times until a specific condition is met.
		 */
		
		// do-while loop
		/**
		 * The do-while loop executes a block of code at least once and 
		 * then repeatedly executes the block as long as a given 
		 * condition is true.
		 */
		/*
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while(i <= 5);
		*/
		/**
		 * while loop:
		 * The while loop repeatedly executes a block of code 
		 * as long as a given condition is true. 
		 * It may not execute the block at all if the 
		 * condition is initially false.
		 */
		/*
		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			i++;
		}
		*/
		/** for loop
		 * The for loop is used when the number of iterations 
		 * is known in advance. It consists of an 
		 * initialization, a condition, and an 
		 * increment/decrement statement.
		 * 
		 * for (initialization; condition; update) {
				// Code to be executed
			}
		 * 
		 */
		/*
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		*/
		/** for-each loop
		 * The for-each loop simplifies the process of 
		 * iterating over elements in an array or a 
		 * collection. It iterates over each element 
		 * without the need for an index.
		 * for (elementType element : arrayOrCollection) {
				// Code to be executed
			}
		*/
		/*
		int[] numbers = {1, 2, 3, 4, 5};
		
		for(int i : numbers) {
			System.out.println(i);
		}
		*/
		
		/** Jump Statements:
		 * Jump statements allow the program to control 
		 * the flow of execution by jumping to specific 
		 * points in the code.
		 * Break Statement:
		 * The break statement is used to exit from a 
		 * loop or switch statement.
		*/
		/*
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			if (i == 3) {
				break; // Exit the loop when i equals 3
			}
		}
		*/
		// Continue Statement
		/**
		 * The continue statement is used to skip the 
		 * remaining code in the current iteration of a 
		 * loop and proceed to the next iteration.
		 */
		for (int i = 1; i <= 5; i++) {
			if (i == 3) {
				continue; // Skip the iteration when i equals 3
			}
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
