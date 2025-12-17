//Chapter 19 - Exercise 3

import java.util.Scanner;
 
class WordsSeparatedByDots 
{
	public static void main (String [] args) 
   {
      Scanner input = new Scanner(System.in);
      
 		String first, second, result, dots;
 		int counting, periods, i;
 
		System.out.println("Enter first word: ");
		first = input.next();
 
		System.out.println("Enter second word: ");
		second = input.next();
 
		result = first + "" + second;
		counting = result.length();
		periods = 0;
 
		if(counting<=30) periods = 30-counting;
		dots =".";
		for(i=1;i<=periods;i++) dots+=".";
		System.out.println(first + dots + second);
 
	}
}