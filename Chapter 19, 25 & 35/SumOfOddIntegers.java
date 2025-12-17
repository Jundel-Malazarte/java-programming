//Chapter 24 - Exercise 2

import java.util.Scanner;

public class SumOfOddIntegers
 {
	private static Scanner sc;
	public static void main(String[] args) 
	{
		int number, i, oddSum = 0;
      double NUM;
      
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();	
      
      NUM = number * number;
		
		for(i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				oddSum = oddSum + i; 
			}
		}
		System.out.println("The Sum of Odd Numbers up to " + number + "\tis  =  " + oddSum);
      System.out.println(+ number + "\traised to the power of \t" + number + "\tis = " + NUM);
	}
}