package smartbook;

import java.util.Scanner;

public class Averagecalculator {
	public static void main(String[] args) {
		try(Scanner scanner=new Scanner(System.in)){
		
			System.out.println("enter the total number of elements (SHIREEN):");
			int n=scanner.nextInt();
			int[] numbers=new int[n];
			System.out.println("enter"+n+"numbers");
			for(int i=0;i<n;i++) {
				numbers[i]=scanner.nextInt();
				
			}
			double average = calculateaverage(numbers);
			System.out.println("the average is:"+average);
			
		}
	}
	public static double calculateaverage(int[]numbers) {
		int sum=0;
		for(int number :numbers) {
			sum +=number;
			
		}
		return (double)sum/numbers.length;
	}

}
