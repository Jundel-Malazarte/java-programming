/*
-- 
-- Chapter 34 - Exercise 2 - char file input

---- CharCounterFile
*/
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

	public class charCounterFileInput2 {
   
	   public static void main(String[] args){
      
	      File file = new File("CharCounterFile.txt");
	      
	      int consonants = 0, vowels = 0, characters = 0, spaces = 0;
	      System.out.print("Enter a String : ");
	      String string = new Scanner(System.in).nextLine();
	      for(int i=0; i < string.length(); i++){
	         switch(string.charAt(i)) {
	            case 'a':
	            case 'e':
	            case 'i':
	            case 'o':
	            case 'u':
	               vowels += 1;
	               break;
	            case ' ':
	               spaces += 1;
	               break;
	            case ',':
	            case '.':
	               characters += 1;
	               break;
	            default:
	               consonants += 1;
	         }
	      }      
	      try {
	      PrintWriter output = new PrintWriter(file);
	      output.println("Consonants: "+consonants);
	      output.println("Percentage: "+(consonants%string.length())*10);
	      output.println("Vowels: "+vowels);
	      output.println("Percentage: "+(vowels%string.length())*10);
	      output.println("Characters: "+characters);
	      output.println("Percentage: "+(characters%string.length())*10);
	      output.println("Spaces: "+spaces);  
	      output.println("Percentage: "+(spaces%string.length())*10);
	      output.close();
	      } catch (IOException ex) {
	      System.out.printf("ERROR: %s\n", ex);
	      }
	               
	   }
	}