package L09.InheritanceInJava;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * Single inheritance involves a subclass inheriting from a single superclass. 
		 * It forms a direct parent-child relationship between two classes.
		 */
		/*
		Bike bike = new Bike();
		bike.handle = "Short";
		bike.engine = "Petrol";
		System.out.println(bike.engine);
		*/
		/**
		 * Multilevel Inheritance:
		 * Multilevel inheritance involves a subclass becoming the superclass
		 * for another subclass
		 */
		Dog d = new Dog();
		d.bark();
		d.displayInfo();
		d.setName("Dog");
		System.out.println(d.name);
		/**
		 * Multiple inheritance involves a subclass inheriting from multiple 
		 * super classes. However, Java does not support multiple inheritance of 
		 * classes. It can be achieved using interfaces.
		 */
		
		/**
		 * Hybrid Inheritance:
		 * Hybrid inheritance involves a combination of inheritance types, 
		 * such as multiple inheritance and hierarchical inheritance.
		 */
		
		/**
		 * Hierarchical Inheritance:
		 * Hierarchical inheritance occurs when multiple subclasses inherit from a 
		 * single superclass. It forms a tree-like structure with a single superclass 
		 * and multiple subclasses.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
