/*Chapter 10 - Exercise1 - Daty type : Double

--Name: Malazarte Jundel
*/
package Rainfall;

import java.util.Scanner;
  
public class Rainfall
{  
public static void main(String[] Strings)
{ 
   Scanner in = new Scanner(System.in);
   
   System.out.print("Rainfall for April:\t");// input : 12
   double r1 = in.nextDouble(); 
   System.out.print("Rainfall for May:\t");// input : 14
   double r2 = in.nextDouble();
   System.out.print("Rainfall for June:\t");// input : 8
   double r3 = in.nextDouble();
   double r4 = r1 + r2 + r3 ;
   double r5 = 3.0 ;
   
   System.out.print("\nThe Avarage rainfall:\t" + (r4 / r5) + "\n\n");
   System.out.print("Sum:\t" + r4 );
   System.out.print("\nCount:\t3");
   System.out.print("\nLargest:\t" + r2 );
   System.out.print("\nSmallest:\t" + r3 );

   }
}  

