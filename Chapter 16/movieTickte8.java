/*Name : Jundel Malazarte

- Chapter 16 exercise 8 - Matinee Movie Tickets

- Data type with int

- Varibles and Data type int 

*/
import java.util.Scanner;

public class movieTickte8
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    
    int nTicket = 8 ;
    int mTicket = 5 ;
    int cTicket = 4 ; 
    
    System.out.println("Enter your age : ");
    int Age = in.nextInt();
    System.out.println("Military time : 12:00pm/1200 ,1:30/13:30, 4:30/1630.");
    System.out.println("Enter a time : ");
    int Time = in.nextInt();
    
    if(Age > 17 )
    {
    System.out.println("Ticket Price for Adult : " + nTicket + "$" );
    }
    else if(Age > 13 )
    {
    System.out.println("Ticket price for 13years old above :  " + mTicket + "$" );
    }
    else
    {
    System.out.println("Ticket price for below 13years old : " + cTicket + "$" ); 
    }
    
    System.out.println("Your Age : " + Age );
    System.out.println("Selected Time : " + Time  );
    System.out.println("Enter amout of purchase : ");
    int P1 = in.nextInt();
    int P2 = P1 - nTicket ;
    int P3 = P1 - mTicket ;
    int P4 = P1 - cTicket ;
    
    if(Age > 17)
    {
    System.out.println("Your Balance : " + P2 );
    }
    else if(Age < 18 )
    {
    System.out.println("Your Balance : " + P3 );
    }
    else if(Age < 13)
    {
    System.out.println("Your Balance : " + P4 );
    }
  
   }    
}
