package arrays;

public class OneDimensional {
	 
	int[] marks; // Array Declaration
	
	public void dataSet() {
		/*
		marks = new int[5]; // Reserve Memory
		marks[0] = 10;
		marks[1] = 2;
		marks[2] = 300;
		marks[3] = 40;
		marks[4] = 50;
		*/
		marks = new int[] { 10, 20, 30, 400, 50, 60, 70 };
	}
	
	public void displayUsigForLoop() {
		System.out.println("Display using normal for loop");
		for(int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
	}
	
	public void displayForEachLoop() {
		// TODO Auto-generated method stub

	}
	
	public void minmax() {
		System.out.println("Find Minimum Maximum: ");
		int min, max;
		min = marks[0];
		max = marks[0];
		for (int i = 0; i < marks.length; i++) {
			// find the minimum
			if(min > marks[i])  min = marks[i];
			// find the Maximum
			if(max < marks[i]) max = marks[i];
		}
		System.out.println("Minimum: " + min);
		System.out.println("Maximum: " + max);
	}
	
	
	
	
	
	
	
	
	
	
	
}
