//Chapter 20 - Exercise 2

import java.util.Scanner;
 
public class HarmonicSum
{
    public static void main ( String[] args )
    {
        Scanner scan = new Scanner ( System.in );
         
        int n;
        double sum = 0.0;
        
        System.out.println("Enter N: ");
        int N = scan.nextInt();
                
        while( N > 0 )
            {           
                sum +=(1.0)/N;
                  N--;
            }
             
        System.out.println(" \n Sum is: " + sum);
      }
}