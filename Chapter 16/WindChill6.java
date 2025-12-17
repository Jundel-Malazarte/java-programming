/*Name : Jundel Malazarte

- Chapter 16 exercise 6 - Wind Chill Index

- Data type with Double

- Varibles and Data type double
- Syntax : if-else statement

*/
import java.util.Scanner;
import java.lang.Math;

public class WindChill6
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
        
    System.out.println("Enter Wind Speed : "); // Input : 15
    double V = in.nextDouble();
    System.out.println("Enter Temperature : "); // Input : 20
    double temp = in.nextDouble();
    double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75) * Math.pow(V, 0.16);
       
    if(V < 3)
    {
    System.out.println("Current temperature : " + V );
    }
    if( V > 50 )
    {
    System.out.println("Current temperature : " + temp );
    } 
    //-- otherwise 
    else
    {
    System.out.println("\nWind Chill : " + w );
    }        
       
    }    
}