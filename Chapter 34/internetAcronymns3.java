/*
--- Chapter 34 ex.3

*/
import java.util.Scanner;

public class internetAcronymns3 {
    
    public static void main ( String[] args ) 
    
    {
        
    String Phrase;
    char   color  ;    
        
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter the Acronym : ");
    Phrase = scan.nextLine().trim().toUpperCase();
    String message = "Message is : ";

 
    switch ( Phrase )
    {
        
    case "GG":
        message = message + "Good Game...!" ;
            break;               
    case "WP":
        message = message + "Well Played...!" ;
            break;             
    case "TY":
        message = message + "Thank You..." ;
            break;
    case "W":
        message = message + "Wait..." ;       
            break;
    case "WFM":
        message = message + "Wait..." ;
            break;
    default:
        message = message + "Invalid Phrase..." ;
            
    }
    System.out.println ( message ) ;
    }  
}