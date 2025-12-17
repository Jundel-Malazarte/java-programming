// Chapter 34 - ex.4

import static java.lang.System.*;

import java.util.*;

public class randomNames4 {
   
		 public static void main(String[] args){
       
      Random Name = new Random();
		int Firstname;
		Firstname = Name .nextInt(4);
              
      System.out.print("First Name: ");
		switch(Firstname){
		case 0 : 
		out.println("Jundel");
		break;
		case 1 : 
		out.println("Kaye");
		break;
	   case 2 : 
      out.println("Mark");
	   break;
		case 3 : 
	   out.println("Aya");
		break;
		}
		Random Last = new Random();
	   int Lastname;
		System.out.print("last Name: ");
		Lastname = Last .nextInt(4);
		switch(Lastname){
		case 0 : 
		out.println("Malazarte");
		break;
		case 1 : 
		out.println("Bulabos");
		break;
		case 2 : 
	   out.println("Bayunas");
		break;
		case 3 : 
	   out.println("Bontuyan");
	   break;
      }
      
      }
}