/*Name : Jundel Malazarte

- Chapter 16 exercise 4 - Pie Eating contest

- Data type with Int & Double

- Varibles and Data type int and double
- Syntax : If - statement
*/
import java.util.Scanner;

public class groundBeef5
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in); 
    
    int a = 85 ;
    int b = 93 ;
    
    System.out.println("Price per pound package A : ");// Input 2.89
    double A = in.nextDouble();
    System.out.println("Percent lean package A : ");
    System.out.println( a );
    System.out.println("Price per pound package B : ");// Input 3.49
    double B = in.nextDouble();
    System.out.println("Percent lean package B : ");
    System.out.println( b );

        
    if(A==2.89)
    {
    System.out.println("\nPackage A cost per pound of lean : " + A * 100 / a );
    }
    if(B==3.49)
    {
    System.out.println("Package B cost per pound of lean : " + B * 100 / b );
    }
    System.out.println("Package : " + A + " is the best value");
    
    }
}
