package L08.ExceptionHandling;

public class UserDefinedException {

	public static void main(String[] args) {
		UserDefinedException main = new UserDefinedException();
		main.doSomething();
	}
	
	public void doSomething(){
		String x = "zero";
		if(x.equals("zero")) {
			throw new RuntimeException();
		}
		System.out.println("Do something!");
	}

}
