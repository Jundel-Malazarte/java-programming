//Chapter 20 - Exercise 1

import java.util.Scanner;
 
   public class AddingUpIntegers
   {
     public static void main(String[] args) 
     {
        Scanner in = new Scanner(System.in);
        
        System.out.print("How many integers will be added: \n");
        int n = in.nextInt();
      
        int i, x, sum = 0;
        for(i = 0 ; i < n ; i++)
        {
         System.out.println("Enter integers: ");
         x = in.nextInt();
         sum +=x;
        }
        System.out.println("\n The sum is: " + sum);
     }
     
   }