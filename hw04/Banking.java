// Alyssa Gallagher
// CSE2
// hw04 Banking Java Program
// Due 2/17/15

import java.util.Scanner;

//define a class
public class Banking{ 
    // define a main method
    public static void main(String[] args){ 
        Scanner myScanner;
        myScanner=new Scanner( System. in);
 // generate a random money amount between 1000 and 5000
    int money = (int)(Math.random()*(5000-1000)+1000);
    // offer user choice of actions 
    System.out.println("To deposit money, press 1 ");
    System.out.println("To withdraw money, press 2 ");
    System.out.println("To view your balance, press 3");
   int action=myScanner.nextInt();
   switch (action){
       case 1: 
           System.out.print("How much would you like to deposit? ");
           double deposit=myScanner.nextDouble();
           if(deposit <= 0){
               System.out.println("Please enter a positive number");
               return;
           } //ends if statement user attempted deposit negative number
           else {
               System.out.println("Your new balance is $" +(money+deposit)); 
           } //ends else user deposited amount
           break;
        case 2:
            System.out.print("How much would you like to withdraw? ");
            double withdraw=myScanner.nextDouble();
            if((withdraw > money )|| (withdraw<= 0)){
                System.out.println("Invalid withdraw request");
                return;
            }//ends if withdraw is greater than amount
            else {
                System.out.println("Your new balance is $" +(money-withdraw));
            }
            break;
        case 3:
            System.out.println("Your current balance is $" +(money));
            break;
   } //ends switch 
    
    } //end main method
} // end class