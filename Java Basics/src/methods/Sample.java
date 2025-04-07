package methods;

public class Sample {

	public static void main(String[] args) {
		// Methods in Java
		loop(1, 10);
		// Return Method
		int area = areaOfRectangle(10, 15);
		System.out.println("Area of the shape :"+ area);
	}

	public static void loop(int start, int stop) {
		for(; start <= stop; start++) {
			System.out.println(start);
		}
	}
	
	public static int areaOfRectangle(int height, int width) {
		return height*width;
	}
}
