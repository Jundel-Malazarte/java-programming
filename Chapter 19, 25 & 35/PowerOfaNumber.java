//Chapter 21 - Exercise 1

import java.util.*;

 class PowerOfaNumber
   {
      public static void main (String[] args)
      {
     
         Scanner in = new Scanner (System.in);
         float x;
         int n;
         double x_n = 1.0;
     
         System.out.println ("Enter X");
         x = in.nextFloat();
     
         System.out.println ("Enter N");
         n = in.nextInt();
     
         if (n > 0)
         {

            for (int c = 1; c <= n; c++);
            {
               x_n = Math.pow(x,n);
           
            }
                
            System.out.print ("\n" + x + " raised to the power "  + n + " is: " + x_n);
         
         }
         else
            {
            System.out.print("N must be a positive integer.");
            }
            
         
       }
       
   }