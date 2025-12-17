/*Name : Jundel Malazarte

- Chapter 17 exercise 3 - Microwave Oven Heating Time

- Data type with int & double

- Varibles and Data type int 

*/
import java.util.Scanner;

public class microwaveOven3 {

public static void main(String args[]) {

    Scanner in = new Scanner(System.in);
    
      double addSum = 1.5 ;
      
      System.out.println("How many items to heat : ");
      int item = in.nextInt();
      System.out.println("Time for one item : ");
      int time = in.nextInt();
     
    
      if(item == 1)
      {
      System.out.println("Heating for " + time + " seconds");
      }
      if(item == 2)
      {
      System.out.println("Heating for " + time * addSum + " seconds");
      }
      if(item == 3)
      {
      System.out.println("Heating for " + time * addSum + " seconds");
      }
      else
      {
      System.out.println("Oven is Overheating...");
      }
      
      
      
    }
}
