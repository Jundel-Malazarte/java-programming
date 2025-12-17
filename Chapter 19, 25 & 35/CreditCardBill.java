//Chapter 23 - Exercise 2

import java.util.Scanner;
import java.text.*;

public class CreditCardBill 
{
	public static void main (String [] args) 
   {
		Scanner input = new Scanner(System.in);
      DecimalFormat numform = new DecimalFormat(); 
      
		double payment, debt, balance;
		int month;

		System.out.println("Enter the monthly payment: ");
		payment = input.nextDouble();
		month = 0;
 
 
		debt = 1000;
 
 
      System.out.println("Month: " + month + "\t\t\t\t\t balance: $" + debt + "\t\t\t\t\t\t\t\t\t Total payed: $" + "0.000");
 
		while (debt > payment) 
      {
			debt = debt * 1.015;
			debt = debt - payment;
			System.out.println("Month: " + (month = month + 1) + "\t\t\t\t\t balance: $" + debt + "\t\t\t\t\t Total payed: $" + (payment * month));
		}
			System.out.println("Month: " + (month = month + 1) + "\t\t\t\t balance: $0.0" + "\t\t\t\t\t\t\t\t\t\t Total payed: $" + (payment * month - debt));
	}
}