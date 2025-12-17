//Chapter 19 - Exercise 1

import java.util.Scanner;
class RunOfIntegers 
{
    public static void main(String[] args) 
    {
        Scanner keyBoard = new Scanner(System.in);
        
        System.out.print("Enter Start: "); 
        int start=keyBoard.nextInt();
        System.out.print("Enter End:"); 
        int end=keyBoard.nextInt();
        int counter=start;
        int sum=0;
        do{
            System.out.println(counter);
            sum+=counter;
            counter++;
        }while(counter<=end);
 
    }
     
}