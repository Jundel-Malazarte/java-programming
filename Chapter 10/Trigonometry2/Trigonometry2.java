/*Chapter 10 - Exercise2 - Daty type : Double

--Name: Malazarte Jundel

--Old method and New method
*/
package Trigonometry2;

import java.util.Scanner;

public class Trigonometry2
{
public static void main(String[] Strings)
{
   double sinx = 0.5236 ;
   double cosx = 0.5236 ;
   double sum = sinx + cosx ;
   
   //OLD METHOD   
   System.out.print(" Sine : " + sinx );
   System.out.print("\n Cosine : " + cosx ); 
   System.out.print("\n Sum of squares : " + sum + "\n");
   
   //NEW METHOD
   System.out.printf("\n Sine : " + sinx, Math.sin(sinx) );
   System.out.printf("\n Cosine : " + cosx, Math.cos(cosx) );  
   System.out.printf("\n Sum of squares : " + sum, Math.sqrt(sum) );
   }
}