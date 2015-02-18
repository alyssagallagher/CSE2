// Alyssa Gallagher
// CSE2 
// Which Number Java Program
// Due 2/17/15

import java.util.Scanner;

//define a class
public class WhichNumber{

//define a main method
public static void main(String[] args){
    Scanner myScanner;
    myScanner= new Scanner (System. in);
System.out.println("Think of a number between 1 and 10 inclusive"); //prompts user to think of a number
System.out.print(
    "Is your number even? Y or N ");
String yOrN=myScanner.next();

if((yOrN.equalsIgnoreCase("Y"))||(yOrN.equalsIgnoreCase("N"))){ //only accepts answers y,Y,n,N
    if(yOrN.equalsIgnoreCase("Y")){ //if user enters that number is even the following questions will be asked
        System.out.print(
            "Is it divisible by 3? ");
            String divisibleBy3=myScanner.next();
        if(divisibleBy3.equalsIgnoreCase("Y")){
            System.out.println("Is your number 6?");
        String guess6=myScanner.next();
        if(guess6.equalsIgnoreCase("Y")){
            System.out.println("Yay!");
        } // ends if guess 6 is correct
        if(guess6.equalsIgnoreCase("N")){
            System.out.println(" :( ");
         }// ends if guess 6 is not correct
        }// ends if statement if number is divisible by 3
        if(divisibleBy3.equalsIgnoreCase("N")){
            System.out.print(
                "Is the number divisible by 4? ");
        } // ends if statement if number is not divisible by 3
        String divisibleBy4=myScanner.next();
        if(divisibleBy4.equalsIgnoreCase("Y")){
            System.out.print(
                "Is the number divided by 4 greater than 1? ");
            String dividedBy4GreaterThan1=myScanner.next();
            if(dividedBy4GreaterThan1.equalsIgnoreCase("Y")){
                System.out.print("Is your number 8?");
             }//ends if statement if number divided by four is > 1
            String guess8=myScanner.next();
            if(guess8.equalsIgnoreCase("Y")){
                System.out.println("Yay!");
             }// ends if guess 8 is correct
            if(guess8.equalsIgnoreCase("N")){
                System.out.println(" :( ");
             }// ends if guess 8 is not correct
            if(dividedBy4GreaterThan1.equalsIgnoreCase("N")){
                System.out.print("Is your number 4?");
             }// ends if number divided by 4 is < 1
            String guess4=myScanner.next();
            if(guess4.equalsIgnoreCase("Y")){
                System.out.println("Yay!");
             }// ends if guess 4 is correct
            if(guess4.equalsIgnoreCase("N")){
                System.out.println(" :( ");
            }// ends if guess 4 is not correct
         }// ends if statement if number is divisible by 4
        if(divisibleBy4.equalsIgnoreCase("N")){
            System.out.print(
                "Is the number divisible by 5?" );
            String divisibleBy5= myScanner.next();
            if(divisibleBy5.equalsIgnoreCase("Y")){
                System.out.print( "Is your number 10?");
            String guess10=myScanner.next();
            if(guess10.equalsIgnoreCase("Y")){
                System.out.println("Yay!");
            } //ends if guess10 is correct
            if(guess10.equalsIgnoreCase("N")){
                System.out.println(" :( ");
            } // ends if guess 10 is not correct
            } // ends if the number is divisible by 5
        if(divisibleBy5.equalsIgnoreCase("N")){
            System.out.print("Is your number 2?");
            String guess2=myScanner.next();
            if(guess2.equalsIgnoreCase("Y")){
                System.out.println("Yay!");
            } // ends if guess 2 is correct
            if(guess2.equalsIgnoreCase("N")){
                System.out.println(" :( ");
            } // ends if guess 2 is not correct
        } // ends if the number is not divisible by 5
        } // ends if statement if the number is not divisible by 4
        
    } // ends if statement for answered yes to is the number even
    if(yOrN.equalsIgnoreCase("N")){ //if user enters that number is not even the following questions will be asked
        System.out.print(
            "Is it divisble by 3? ");
        String divisibleBy3=myScanner.next();
        if(divisibleBy3.equalsIgnoreCase("Y")){
            System.out.print(
                "When divided by 3 is the result greater than 1? ");
            String dividedBy3GreaterThan1=myScanner.next();
            if(dividedBy3GreaterThan1.equalsIgnoreCase("Y")){
                System.out.print(
                    "Is your number 9?");
            } // ends if number divided by 3 > 1
            String guess9=myScanner.next();
                 if(guess9.equalsIgnoreCase("Y")){
                System.out.println("Yay!");
                 } // ends if guess 9 is correct
                 if(guess9.equalsIgnoreCase("N")){
                System.out.println(" :( ");
                 } // ends if guess 9 is not correct
            if(dividedBy3GreaterThan1.equalsIgnoreCase("N")){
               System.out.print(
                   "Is your number 3?");
            } // ends if number divided by 3 < 1 
            String guess3=myScanner.next();
                if(guess3.equalsIgnoreCase("Y")){
                System.out.println(" Yay! ");
            } // ends if guess3 is correct
            if(guess3.equalsIgnoreCase("N")){
                System.out.println(" :( ");
            } // ends if guess 3 is not correct
        } //ends if number is divisible by 3
        if(divisibleBy3.equalsIgnoreCase("N")){
            System.out.print("Is it greater than 6?");
        String greaterThan6=myScanner.next();
        if(greaterThan6.equalsIgnoreCase("Y")){
            System.out.print("Is your number 7?");
            String guess7=myScanner.next();
            if(guess7.equalsIgnoreCase("Y")){
                System.out.println(" Yay!");
            } // ends if guess7 is correct
            if(guess7.equalsIgnoreCase("N")){
                System.out.println("  :( ");
            } // ends if guess7 is not correct
        }// ends if number is greater than 6
        if(greaterThan6.equalsIgnoreCase("N")){
            System.out.print("Is it less than 3? ");
        String lessThan3=myScanner.next();
        if(lessThan3.equalsIgnoreCase("Y")){
            System.out.print("Is your number 1? ");
            String guess1=myScanner.next();
            if(guess1.equalsIgnoreCase("Y")){
                System.out.println("Yay!");
                return;
            }// ends if guess1 is correct
            if(guess1.equalsIgnoreCase("N")){
                System.out.println(" :( ");
            } // ends if guess1 is not correct
        } // ends if the number is less than 3
        if(lessThan3.equalsIgnoreCase("N"));
        System.out.print("Is your number 5?");
        String guess5=myScanner.next();
        if(guess5.equalsIgnoreCase("Y")){
        System.out.println("Yay!");
        } // ends if guess 5 is correct
        if(guess5.equalsIgnoreCase("N")){
            System.out.println(" :( ");
        } // ends if guess 5 is not correct
        } // ends if number is not greater than 6
        } // ends if number is not divisible by 3
    } //ends if statement for answered no to is the number even
} // ends if statment for input of Y or N case ignored
else{ //if user does not input Y,y,N,n they will get a message that input is invalid 
    System.out.println("Sorry, that is not a valid input");
} // ends else for if input is not y,Y,n,N
} // ends main method
} // ends class