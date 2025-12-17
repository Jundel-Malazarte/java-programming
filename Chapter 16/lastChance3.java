/*
-Name : Jundel Malazarte

- Chapter 16 exercise 3 - Last Chance Gas

- Data type with Int & Double 
- Varibles and Data type int & Double
*/
import java.util.Scanner;

public class lastChance3
{
public static void main(String args[])
{  
   Scanner in = new Scanner(System.in);
   
   double Litre = 69.550 ;
   
   System.out.println("Welcome Drivers...\n");
   System.out.println("Tank capacity : ");// Input for capacity
   int Capacity = in.nextInt(); 
   System.out.println("Gage reading  : ");// Input Gage
   int Gage = in.nextInt();
   System.out.println("Miles per gallon : ");// Input per Gallon
   int Gallon = in.nextInt();
   System.out.println("Per Litre cost : " + Litre + "Pesos."); // PHP - 69.550 per Litre
  
   
   System.out.println("\n Get Gas !! ");
   System.out.println("\n Total cost :______");// -- Total cost sample
   
   }
}
