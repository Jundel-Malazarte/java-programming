/*Name : Jundel Malazarte

- Chapter 17 exercise 5 - Town Dump

- Data type with int & double

- Varibles and Data type int 

*/
import java.util.*;

public class townDump5 {

public static void main(String args[]) {

   Scanner scan = new Scanner( System.in );

     	int amount = 20 ;
      int pounds ;
      int totalCharges = 8;
      
      System.out.println("Enter Weight Load of Trash: ");
      pounds = scan.nextInt();

      if( pounds <= 200 )
      {
      System.out.println("Total Payment: $" + amount );
      amount = scan.nextInt();
      }
      else
      {
      System.out.println("Total Payment : $" + ( amount + ( ( pounds - 200) /100 ) *8 ) );
      }

    }
}	