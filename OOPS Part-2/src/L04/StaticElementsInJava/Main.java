package L04.StaticElementsInJava;

public class Main {

	public static void main(String[] args) {
		
		/*
		System.out.println("staticvar = "+TestStatic.getStaticVar());
		TestStatic.setStaticVar(25);
		System.out.println("staticvar = "+TestStatic.getStaticVar());
		*/
		
		ToyotaCars toyotaCars = new ToyotaCars();
		toyotaCars.nonStaticInner.model("Corolla");
		ToyotaCars.Brand.tagLine();
	}

}
