//Chapter 22 - Exercise 2

import java.util.Scanner;

public class MilesPerGallon
{
	public static void main(String[] args) 
   {
		
		Scanner input = new Scanner(System.in);
		double bye, initialMiles, finalMiles, gallons, mpg;
      
      System.out.println("Miles Per Gallon Program");
 
		bye = 1;

		while (bye == 1)
      {
			System.out.println("\nInitial miles:: ");
			initialMiles = input.nextDouble();
			
 
			if (initialMiles >= 0)
         {
 
				System.out.println("Final miles: ");
				finalMiles = input.nextDouble();
				
				System.out.println("Gallons: ");
				gallons = input.nextDouble();
				
				mpg = (finalMiles - initialMiles)/gallons;
				System.out.println("Initial Miles:\n" + initialMiles + "\nFinal Miles:\n" + finalMiles + "\nGallons Spent:\n" + gallons + "\nMiles Per Gallon:\n" + mpg + " \n");

			}
         else 
         {
				System.out.println("bye");
				bye = ++bye;
			}
		}
	}
}