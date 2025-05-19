package Assignment2;

public class PrintLetters {

	public static void main(String[] args) {
		for(int i=0; i<=8; i++) {//there are 8 rows and starts form
			//the first row
			for(int n=0; n<=8; n++) {//there are 8 lines and 
				//starts from the first line
			char letter = (char)('A'+(i+n));//give the next letter to 
			//the letter which begins from A
			System.out.print(letter+"  ");
			}System.out.println();	//change a line				
		}
	}
}

