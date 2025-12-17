/*Name : Jundel Malazarte

- Chapter 16 exercise 5 - Y2K Problem Detector

- Data type with Int

- Varibles and Data type int

- Syntax : If/else - statement
*/
import java.util.Scanner;

public class Y2KDetector5
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in); 
    
    System.out.println("Year of Birth : "); // Input : example 2003 
    int B = in.nextInt();
    System.out.println("Current year  : "); // Input : example 2022 
    int Y = in.nextInt();
    int Age = Y - B ;
    
    if( Age <= 100 )
    {
    System.out.println("Your Age : " + Age );
    }
    else
    {
    System.out.println("\nInvalid Age...");
    }
          
    }
}   
