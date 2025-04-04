package datatypes;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
			
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the Principle amount: ");
		int p = in.nextInt();
		System.out.println("Enter the Month: ");
		int n = in.nextInt();
		System.out.println("Enter the Intrest: ");
		int r = in.nextInt();

		float result = p * n * r / 100;

		System.out.println("Intrest amount: " + result);

	}

}
