package first.pack;

import java.util.Scanner;
import second.pack.Human;

public class FirstClass {

	public static void main(String[] args) {
		System.out.println("First Package Class");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name:");
		String myName = input.nextLine();
		System.out.println("Enter Age:");
		int age = input.nextInt();
		System.out.println("Name:" + myName);
		System.out.println("Age: " + age);
	}

}
