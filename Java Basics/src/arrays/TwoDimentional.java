package arrays;

public class TwoDimentional {
	
	int[][] marks;
	
	public void dataSet() {
		/*
		marks = new int[3][3];
		marks[0][0] = 10;
		marks[0][1] = 20; */
		
		marks = new int[][] {
			{10, 20, 30}, {40, 50, 60}, {70, 80, 90}
		};
	}
	
	public void matrixPrintFormat() {
		System.out.println("Display using nested for loop...");
		// handle the row
		for (int i = 0; i < marks.length; i++) {
			
			// handle the column
			for (int j = 0; j < marks[i].length; j++) {
				// System.out.println(marks[i][j]);
				System.out.printf("%3d ", marks[i][j]);
			}
			
			// Move to the new line
			System.out.println();
		}
	}
	
	public void advancePrintFormat() {
		System.out.println("Advanced Print using forEach Loop");
		
		for(int[] r: marks) {
			for(int c: r) {
				System.out.printf("%3d ", c);
			}
			System.out.println();
		}

	}
	
	public void minmaxtotavg() {
		System.out.println("Find the minimum maximum total average...");
		System.out.printf("mark-1 mark-2 mark-3 minimum maximum total average\n");
		int min, max, tot;
		for(int[] r: marks) {
			min = r[0]; max = r[0]; tot = 0;
			for(int c: r) {
				System.out.printf("%-6d ", c);
				if(min > c) min = c;
				if(max < c) max = c;
				tot += c;
			}
			System.out.printf("%7d %7d %5d %7.3f", min, max, tot, tot/3.0);
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
