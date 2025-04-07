package L10.Polymorphism;


// Dynamic / Runtime Polymorphism
public class Dog extends Animal{
	
	/**
	 * Dynamic polymorphism occurs at runtime and is also known as method overriding. 
	 * It allows a subclass to provide a different implementation of a method defined 
	 * in its superclass.
	 */
	
	@Override
	public void makeSound() {
		super.makeSound();
		System.out.println("Dog barks.");
	}

}
