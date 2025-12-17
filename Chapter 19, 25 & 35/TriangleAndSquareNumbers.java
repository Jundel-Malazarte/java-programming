//Chapter 25 - Exercise 3

import java.util.Scanner;

public class TriangleAndSquareNumbers 
{
	public static void main(String[]args) 
   {
		Scanner ask = new Scanner(System.in);
		
		int i, number, count, square, triangle, triangleChecker;
      
		System.out.print("Enter any number: ");
		number = ask.nextInt();
		
		for(i = 1; i <= number ; i++) 
      {
			square = 0;
			triangle = 0;
			triangleChecker = 0;
		
			for(count = 1; count < i + 1; count++) 
         {
				triangleChecker += count;
            
				if(triangleChecker == i) 
            {
					triangle = 2;
				}
            if(count*count == i)
            {
				   square = 2;
				}
            
			}if(i==1) 
         {
				System.out.println(i+" is both triangle and square");
			}else if(triangle==2&&square==2&&i!=1) 
         {
				System.out.println(i+" is both triangle and square");
			}else if(triangle==2)
         {
				System.out.println(i+" is a triangle");
			}else if(square==2) 
         {
				System.out.println(i+" is a square");
			}else
         {
				System.out.println(i+" is not a square or triangle");
			}
		}	
	}	
}
