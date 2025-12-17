/*Chapter 9 - Exercise2 - Daty type : Double 
- Syntax : If esle statement

Name : Malazarte Jundel
*/
package Quadratic2 ;

import java.util.Scanner;
  
public class Quadratic2 
{  
public static void main(String[] Strings)   
{  
   /*
   Variables & Data type : double
   */
   Scanner input = new Scanner(System.in);
     
   System.out.print("Enter the value of X : ");//--Enter diffirent value/number :
   double FirstX = input.nextDouble();  
   System.out.print("Enter the value of 2nd X : ");//--Enter diffirent value/number : 
   double SecondX = input.nextDouble();  
   System.out.print("Enter the value of 3rd X : ");//---Enter diffirent value/number :
   double ThirdX = input.nextDouble();  
   double X = SecondX * SecondX - 4.0 * FirstX * ThirdX ;
    
   if (X> 0.0)   
   {  
   double quad1 = (-SecondX  + Math.pow(X, 0.5 )) / ( 2.0 * FirstX );  
   double quad2 = (-SecondX - Math.pow(X, 0.5 )) / ( 2.0 * FirstX );  
   System.out.println("\nThe Value are : " + quad1 + " and " + quad2 );  
   }   
   else if (X == 2.0)   
   {  
   double quad1 = -SecondX / ( 2.0 * FirstX );  
   System.out.println("The Value is found :" + quad1 );  
   }     
   else   
   {  
   System.out.println("\nThe Value are not found...");  
      }  
   }  
}  