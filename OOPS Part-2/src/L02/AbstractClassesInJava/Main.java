package L02.AbstractClassesInJava;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Pooja();
		person.eat();
		person.speak();
		Person person2 = new John();
		person2.eat();
		person2.speak();
	}

}
