/*
-Name : Jundel Malazarte

- Chapter 16 exercise 4 - Pie Eating contest

- Data type with Int 

- Varibles and Data type int
- Syntax : If/else
*/
import java.util.Scanner;

public class PieEating4
{
public static void main(String args[])
{  
   Scanner in = new Scanner(System.in);
   
   int P = 30 ;
   int p = 250 ; 
   
   System.out.println("Input your weight : ");
   int W1 = in.nextInt();
    
   if( P < p )  
   System.out.println("Welcome to the contest...");
   else
   {
   System.out.println("Invalid pounds...!");
   System.out.println("Exit the contest... ");
   }
   
   }
}