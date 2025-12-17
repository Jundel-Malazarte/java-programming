/*Name : Jundel Malazarte

- Chapter 17 exercise 2 - Steam Engine Efficiency

- Data type with int & float

- Varibles and Data type int  

*/
import java.util.Scanner;

public class  steamEngine2{

public static void main(String args[]){

    Scanner in = new Scanner(System.in);
    
    int airTemp = 300 ;
    int steamTemp = 373 ;
    
    System.out.println("Input an Air temperature : ");
    int Tair = in.nextInt();
    System.out.println("Input an Steam Temperature : ");
    int Steam = in.nextInt();
    float efficiency = 1 - Tair / Steam ;
    
    if( 373 > 300 )
    {
    System.out.println("The Efficiency : " + efficiency );
    }
    if( 373 < 300)
    {
    System.out.println("The Efficiency : " + efficiency );
    }
    
    }
}
