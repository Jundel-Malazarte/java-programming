/*Chapter 8 - Exercise4 - Daty type : Char 

--Name: Malazarte Jundel
*/
package CharAssasination4;

public class  CharAssasination4
{
public static void main ( String[] args ){

   char CH = 'A' ;// -- char contains only single character 
   char ch = ' ' ;

   //- char ch = 'AA'; - cannot because char data types contains only single character !
   //char ch = "A" ; -- it cant run when it haves a double cout
   
    System.out.println("A Character :\t" +  CH );
    System.out.println("A Character :\t" +  ch + "\n");
    
    //Example my name :
    char Name = 'J' ;
    char name = 'U' ;
    char NaMe = 'N' ;
    char naMe = 'D' ;
    char NAmE = 'E' ;
    char NAme = 'L' ;
    
    String LName = "MALAZARTE" ; 
    
    System.out.println("My Name :\t" + Name + name + NaMe + naMe + NAmE + NAme + " " + LName );
       
    /*
    Do the following:

      Change the 'A' into 'Z' and compile and run.
      Change the 'A' into 'AA' and try to compile the program.
      Change the 'A' into ' ' and compile and run the program.
      Notice carefully: there is a single space between the two ' marks.
      Change the 'A' into '' and try to compile.
      Notice carefully: there is no character between the two ' marks.
      Change the 'A' into "A" and try to compile the program.
      (The double quotes " signify a String, which is something different from a char).
      
      */
   }
}
