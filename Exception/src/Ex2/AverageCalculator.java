package Ex2;

import java.util.Scanner;

public class AverageCalculator{
	public double calAverage(int n) throws IllegalArgumentException {
		if(n<=0) {
			throw new IllegalArgumentException("Its not a natural number, Enter the natural number");
		}
		return (n+1)/2 ;
	}
	public static void main(String[] args) throws IllegalArgumentException{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a natural number");
		int n = s.nextInt();
		AverageCalculator a = new AverageCalculator();
		double result = a.calAverage(n);
		System.out.println("Average = "+ result);
	}
}
