/*Name : Jundel Malazarte

- Chapter 16 exercise 9 - Midnight Madness

- Data type with int

- Varibles and Data type int 
- Syntax : if else
*/
import java.util.Scanner;

public class midNight9
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    
    int nTicket = 4 ;
    int mTicket = 4 ;
    int cTicket = 4  ;
    
    System.out.println("Announcement : Theater has started a new policy charging...");
    System.out.println("Announcement : Movie tickets has been dropping!... : " + 4.00 + "$");
    
    System.out.println("Announcement : Ticket for Adult is " + nTicket + "$" );
    System.out.println("Announcement : Ticket fof 13years Above is " + mTicket + "$" );

       
    System.out.println("\nEnter your age : ");
    int Age = in.nextInt();
    System.out.println("Military time : 10:00/2200, 11:00/2300, 12:00/2400 ");
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
    
