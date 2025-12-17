//Chapter 35 - Exercise 1

import java.util.*;

public class InputFilePrompt 
{
	public static void main(String []args) 
   {
		Scanner ask = new Scanner(System.in);
		
		String fileNames = "";
		boolean check = false;
		
		System.out.print("Input file name: ");
		fileNames = ask.nextLine();
		
		while(!check) 
      {
			if(fileNames.contains(" ")) 
         {
				System.out.println(">>>file name must not contain space<<<");
				System.out.print("Input file name: ");
				fileNames = ask.nextLine();
            
			}
         else if(!fileNames.endsWith(".dat"))
          {
				System.out.println(">>>file must end with .dat<<<");
				System.out.print("Input file name: ");
				fileNames = ask.nextLine();
            
			}
         else 
         {
				System.out.println("OK!");
				check = true;
			}
		}
	}
}
   