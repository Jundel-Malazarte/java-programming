/*Name : Jundel Malazarte

- Chapter 16 exercise 7 - Your Age in Seconds

- Data type with int

- Varibles and Data type int 

*/
import java.util.Scanner;

public class yourAge7
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    
    int Hrs = 24 ;
    int Mins = 60 ;
    int Secs = 60 ;
    int days = 365 ;
    
    System.out.println("Input Year of Birth : "); // 2003
    int YB = in.nextInt();
    System.out.println("Input current Year : "); // 2022
    int cY = in.nextInt();
    int age = cY - YB ;
        
    System.out.println("Your Age in : " + age );
    System.out.println("Input Months : ");// Your Months 01 
    int M = in.nextInt();
    System.out.println("Input Days : "); // your days ex.29
    int D = in.nextInt();
    System.out.println("Input current hours : ");
    int H = in.nextInt();
    int Hr = Hrs - H ;
    System.out.println("Input current minutes : ");
    int Min = in.nextInt();
    int Minute = Mins - Min ;
    System.out.println("Input current seconds : ");
    int Sec = in.nextInt();
    int Se = Secs - Sec ; 
  
    System.out.println("You are " + age + " Years," + M +" Months," + D + " Days," + Hr + " Hours," + Minute + " Minutes," + " and " + Se + " seconds old." );
       
    }
}
