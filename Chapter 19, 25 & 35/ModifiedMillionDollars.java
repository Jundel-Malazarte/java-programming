//Chapter 23 - Exercise 1

import java.util.Scanner;

public class ModifiedMillionDollars
{
  public static void main( String[] args ) 
  {
    double money = 1000.00 ;
    double rates;
    int    year =  1 ;     

    
    Scanner scan = new Scanner( System.in );
    System.out.print("Enter the interest rate in percent: "); 
    rates = scan.nextDouble()/100.0 ;
 
    
    while (  year <= 40 )
    {
      money =  money + money * year; 

      money = money + 1000 ;

      year =  year + 1 ;
    }

      System.out.println("After 40 years at " + rates*100 
      + " percent interest you will have " + money + " dollars" );
  }

}