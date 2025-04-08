package L08.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowKeyword {

	public static void main(String[] args) {
		ThrowKeyword main = new ThrowKeyword();
		try {
			main.doSomething();
		} catch(FileNotFoundException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}
	
	public void doSomething() throws FileNotFoundException{
		FileReader in = new FileReader("text.txt");
		System.out.println("Do something!");
	}
	
}
