/*
-- 
-- Chapter 34 - Exercise 2 - char file input

---- CharCounterFile Version 2.0

---------- TEST CODE FILE
----------- TEST CODE V2.0
*/

import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

	public class charCounterFileInput3 {
   
	   public static void main(String[] args){
      
	      File file = new File("CharCounterFile.txt");
         
    String line = "Welcome to Jundel Malazarte's Website";
    int vowels = 0, consonants = 0, digits = 0, spaces = 0;

    line = line.toLowerCase();
    for (int i = 0; i < line.length(); ++i) {
    
    char ch = line.charAt(i);

      // check if character is any of A, E, I, O, U.
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        ++vowels;
      }

      // check if character is in between a to z
      else if ((ch >= 'a' && ch <= 'z')) {
        ++consonants;
      }
      
      // check if character is in between 0 to 9
      else if (ch >= '0' && ch <= '9') {
        ++digits;
      }
      
      // check if character is a white space
      else if (ch == ' ') {
        spaces++;
      }
    }

    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
    
  }
}