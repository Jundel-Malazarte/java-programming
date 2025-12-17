//Chapter 25 - Exercise 4

import java.util.Scanner;
class MonkeysInaTree
{
    public static void main(String[] args) 
    {
    
        int verse = 0;
        Scanner scan = new Scanner(System.in);     
        
        while (true)
        {
        System.out.print("Enter what verse: ");
        verse = scan.nextInt();
        
           if(verse == 5)
           {
           System.out.print("\n\tFive little monkeys swinging in a tree \n\tTeasing Mr Crocodile you can't catch me \n\tAlong came the crocodile as quiet as can be \n\tand SNAP! \n\t"); 
           }
           if(verse == 4)
           {
           System.out.print("\n\tFour little monkeys swinging in a tree \n\tTeasing Mr Crocodile you can't catch me \n\tAlong came the crocodile as quiet as can be \n\tand SNAP! \n\t");
           }
           if(verse == 3)
           {
           System.out.print("\n\tThree little monkeys swinging in a tree \n\tTeasing Mr Crocodile you can't catch me \n\tAlong came the crocodile as quiet as can be \n\tand SNAP! \n\t"); 
           }
           if(verse == 2)
           {
           System.out.print("\n\tTwo little monkeys swinging in a tree \n\tTeasing Mr Crocodile you can't catch me \n\tAlong came the crocodile as quiet as can be \n\tand SNAP! \n\t");
           }
           if(verse == 1)
           {
           System.out.print("\n\tOne little monkeys swinging in a tree \n\tTeasing Mr Crocodile you can't catch me \n\tAlong came the crocodile as quiet as can be \n\tand SNAP! \n\t");
           }
           if(verse == 0)
           {
           System.out.print("\n\tNo little monkeys swinging in a tree \n\tNo little monkeys swinging in a tree \n\t");
           }

         }

 
    }
     
}