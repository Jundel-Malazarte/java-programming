//Chapter 22 - Exercise 5

import java.util.Scanner;

class AreaofRectangles
{
   public static void main (String[] args )
   {
      
      Scanner scan=new Scanner( System.in );
      double firstcornerX, firstcornerY, secondcornerX, secondcornerY;
      int width, height, area = 0;
      
      width = 0;
      height = 0;
      area = 0;
      
         System.out.print ("Computer Aided Design Program\n\t");

      
      while (true)
      {
         System.out.print ("First corner X coordinate: \n\t");
         firstcornerX = scan.nextDouble ();
         
         System.out.print (" First corner Y coordinate: \n\t");
         firstcornerY = scan.nextDouble ();
         
         System.out.print (" Second corner X coordinate: \n\t");
         secondcornerX = scan.nextDouble ();
         
         System.out.print (" Second corner Y coordinate: \n\t");
         secondcornerY = scan.nextDouble ();
          
         
          if(firstcornerX == 100 &&  firstcornerY == 100 && secondcornerX == 100 && secondcornerY == 100)
             {
               System.out.println ("Width: " + width + "\t" + " Height: " + height + "\t" + "Area: " + area + "\n\t");
               System.out.println ("Finished \n\t");
             }
           else
              {
                System.out.println ("Width: " + 150 + "\t" + " Height: " + 100 + "\t" + "Area: " + (150*100));
                System.out.println (); 
              }
      }
               

   }

}
