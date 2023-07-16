package smartbook;

import java.util.Scanner;

public class primechecker {
	public static void main(String[] args) {
		try (Scanner scanner=new Scanner(System.in)){
			System.out.println("Enter a number:");
			int number=scanner.nextInt();
			if (isprime(number)) {
				System.out.println(number +"is prime number");
				
			}else {
				System.out.println(number+"is not a prime number" );
				
			}
			
		}
	}
	public static boolean isprime(int number) {
		if (number <= 1) {
			return false;
		}
		//check divisibility from 2 to the square root of the number
		for (int i=2;i<=Math.sqrt(number);i++) {
			if(number % i==0) {
				return false;//number is divisible,not prime
			}
		}
		return true;//number is prime9685867
     
		
		
	}

}
