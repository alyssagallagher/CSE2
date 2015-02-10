// Alyssa Gallagher
// CSE2 hw03
// Four Digits Java Program
// Due 2/10/2015

import java.util.Scanner;
 
// define a class
public class FourDigits{
    
// define a method
public static void main(String [] args) {
    Scanner myScanner; // declares an instance of the Scanner object
    myScanner=new Scanner( System. in ); // command tells Scanner an instace is created that will take input from STDIN
    System.out.print(
        "Enter a double and I display four digits to the right of the decimal point-");
    double xInput= myScanner.nextDouble(); // accepts user input
    int yInput= (int)xInput; //changes to an int in order to get rid of decimal
    double xDecimalInput= (xInput-yInput); //prints only the decimal
    double xNewInput= (((xDecimalInput)*10000)+.3); // prints as integer
    int xNewInputCut= (int)xNewInput; // changes to an int in order to make orginal decimal appear as an integer
    System.out.println("The four digits are " +(xNewInputCut)); // prints 4 digits right of the decimal
    System.out.print(
    "Enter a double and I display four digits to the right of the decimal point-");
    double zInput= myScanner.nextDouble(); // accepts user input
    int qInput= (int)zInput; // changes to an int in order to get rid of decimal
    double zDecimalInput= (zInput-qInput); // prints only the decimal
    double zNewInput= (((zDecimalInput)*10000)+.1); // prints as an integer
// %10 takes the last number before the decimal 
// divide by different multiples of 10 to access different digits
    int zValue1 = (int)(zNewInput/1000)%10; 
    int zValue2= (int)(zNewInput/100)%10;
    int zValue3= (int)(zNewInput/10)%10;
    int zValue4= (int)((zNewInput%10));
    System.out.println ("The four digits are " +zValue1+zValue2+zValue3+zValue4); // prints all 4 digits after the zInput's decimal place
    
}
}