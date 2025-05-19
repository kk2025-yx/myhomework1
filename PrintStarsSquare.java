package Assignment2;

import Prog1Tools.IOTools;

public class PrintStarsSquare {

	public static void main(String[] args) {
		int edge = IOTools.readInt("Enter the field size:");
		for (int i = 1; i <= edge; i++) {
			for (int j = 1; j <= edge; j++) {
				if (i == 1 || i == edge || j == 1 || j == edge) {// print star in the first line
					// or first row
					System.out.print("* ");
				} else {
					System.out.print("  ");// print two space in the middle of the square
				}
			}
			System.out.println(); // change lines
		}
	}
}
