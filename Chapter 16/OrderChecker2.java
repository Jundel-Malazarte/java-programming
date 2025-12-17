/*
-Name : Jundel Malazarte

- Chapter 16 exercise 2 - Discounted Price

- Data type with Int  
- Varibles and Data type int
*/
import java.util.Scanner;

public class OrderChecker2
{
public static void main(String args[])
{
     Scanner in = new Scanner(System.in);
     
     final int boltPrice = 5;
               
     System.out.println("Number of bolts : ");// Input : 12
     int Bolt = in.nextInt(); 
     System.out.println("Number of Nuts : "); // Input : 8
     int Nut = in.nextInt(); 
     System.out.println("Number of washer : ");// Input : 24
     int Washer = in.nextInt();
     int Total = Bolt * 5 + Nut * 3 + Washer ;
     String nUt = "Too few nuts" ;
     
     System.out.println("\nCheck the Order : " + nUt );
     System.out.println("\nTotal cost : " + Total );
           
   }  
}