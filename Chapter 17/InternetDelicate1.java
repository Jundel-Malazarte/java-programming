/*Name : Jundel Malazarte

- Chapter 17 exercise 1 - Internet Delicatessen

- Data type with int & double

- Varibles and Data type int 
- Syntax : if 
*/
import java.util.Scanner;

public class InternetDelicate1{

public static void main(String[] args)
{
      double regPrice1 = 2.00;
	   double overnightPrice2 = 0.00;

	   Scanner keyboard = new Scanner(System.in);

	   System.out.print("Enter the Item : ");// Input any example item : Tuna salad
	   String itemName = keyboard.nextLine();

	   System.out.println();

	   System.out.print("Enter the price : "); // Enter ex.amount price : 4.50
	   double itemPrice = keyboard.nextDouble();

	   System.out.println();

	   System.out.print("Overnight delivery ( 0 == no, 1 == yes ) : "); // Boolean : Yes or No - Select 0 for no , Select 1 for Yes
      int overnightCheck = keyboard.nextInt();

	   System.out.println();
      
	   if(overnightCheck >= 0 && overnightCheck <= 1)
	     {
	         if(overnightCheck == 1)
	           overnightPrice2 = 3.00;
	     }
	   System.out.println("             Invoice:          \n"+
	   "_________________________________________\n");

	   System.out.print(itemName);
	   System.out.printf("     " + itemPrice);

	   if(itemPrice > 10)
	      regPrice1 = 3.00 ;

	   System.out.println();

	   double totalShip = regPrice1+ overnightPrice2 ;
      System.out.printf("Delivery       " + totalShip);

	   System.out.println();

	   double totalPrice = itemPrice + totalShip;
      System.out.printf("Total         " + totalPrice);
       
      }
}