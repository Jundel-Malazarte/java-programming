//Chapter 35 - Exercise 2

import java.util.*;

public class ImprovedSquareRootProgram 
{
   public static void main(String []args) 
   {
	   Scanner ask = new Scanner(System.in);
      
   	int num;
   	boolean check = false;
   	boolean check1 = false;
   	String react = "";
	   int n;
      
      	System.out.print("Enter a number--> ");
      	num = ask.nextInt();
	
		while(!check) 
      {
			if(num<0)
          {
				System.out.println(">>>number must be positive<<<");
				System.out.print("Enter a number--> ");
				num = ask.nextInt();
            
			}
         else
         {
				double r = (double)(Math.sqrt(num));
				System.out.println("Square root of "+(double)(num)+" is " + r);
				react = "";
				check = false;
				check1 = false;
			}	
				
			System.out.print("Do you wish to continue (yes or no)? ");	
         
			while(!check1) 
         {
				if(react.isEmpty())
             {
					react = ask.nextLine();	
               
				}
            else if(react.equals("yes"))
            {
					System.out.print("Enter a number--> ");
					num = ask.nextInt();
					check1 = true;
               
				}
            else if(react.equals("no"))
            {
					System.out.print("Bye");
					check1 = true;
					check=true;
               
				}
            else 
            {
					System.out.println(">>>Please respond with (yes or no)<<<");
					System.out.print("Do you wish to continue (yes or no)? ");
					react = ask.nextLine();
				}
			}	
		}
	}
}	


