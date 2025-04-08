package controlstatements;

import java.util.Scanner;

public class DecisionMaking {

	public static void main(String[] args) {
		
		/**
		 * Decision Making Statements
		 * Decision-making statements allow the program to execute different 
		 * blocks of code based on certain conditions.
		 */
		// if statements:
		/*
		 * The if statement allows the program to execute a block of code 
		 * if a given condition is true.
		 * It can be followed by an optional else statement to handle the 
		 * case when the condition is false.
		 */
		
		/*
		int num = 10;
		
		if(num > 0) {
			System.out.println("Number is positive");
		} else {
			System.out.println("Number is non-positive");
		}
		*/
		
		Scanner in = new Scanner(System.in);
		System.out.println("ENter Your Marital Status(married/unmarried): ");
		String ms = in.nextLine().toLowerCase();
		
		if (ms.equals("married")) {
			System.out.println("Eligible for Insurence..");
		} else if (ms.equals("unmarried")){
			System.out.println("Enter the below details: ");
			System.out.println("Enter the Gender: (male/female): ");
			String gender = in.nextLine().toLowerCase();
			if (gender.equals("male") || gender.equals("female")) {
				System.out.println("Enter Your Age: ");
				int age = in.nextInt();
				if ((gender.equals("male") && age >= 30) || (gender.equals("female") && age >= 25) ) {
					System.out.println("Eligible for Insurence..");
				} else {
					System.out.println("Not eligible...");
				}
			} else {
				System.out.println("Invalid Gender input...");
			}
		} else {
			System.out.println("Invalid Input.. try again..!!");
		}
		
		// 153 = 3 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 // Armstrong
		
		
		
		
		
		
		
		

	}

}
