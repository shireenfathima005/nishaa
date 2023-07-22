package shireen;

import java.util.Scanner;

public class printanumber {
	public static void main(String[] args) {
		//creates a reader instance which takes 
		//input from Standard input -keyboard
		Scanner reader =new Scanner (System.in);
		System.out.println("enter a number:");
		//nextInt() reads the next integer from the keyboard 
		int number=reader.nextInt();
		//printIn() prints the following line to the output screen 
		System.out.println("you entered:"+number);
	}

}
