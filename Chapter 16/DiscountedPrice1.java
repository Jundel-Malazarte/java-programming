/*
-Name : Jundel Malazarte

- Chapter 16 exercise 1 - Discounted Price

- Data type with Int  
- Varibles and Data type int
*/
import java.util.Scanner;

public class DiscountedPrice1
{
public static void main(String args[])
{
   Scanner in = new Scanner(System.in);
   
   System.out.println("Enter amount of purchases :"); // Input a value with : 2000
   int D1 = in.nextInt(); 
   int D2 = 1800 ;
   System.out.println("Discounted price : " + D2);

   int D3 = D1 - D2 ;
   
   System.out.println("Price :\t" + D3 );
   
   }  
}