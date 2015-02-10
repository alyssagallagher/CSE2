// Alyssa Gallagher
//  CSE2 hw 03
// Due 2/10/2015
// Root Program

import java.util.Scanner;

// define a class
public class Root{
    
// define a method 
public static void main(String [] args) {
    Scanner myScanner; //declares an instance of the Scanner object
    myScanner=new Scanner( System. in ); //command tells Scanner an instance is created that will take input from STDIN
    System.out.print(
        "Enter a double, and I print its cube-"
        );
// declare variables and create calculation instructions
    double xInput = myScanner.nextDouble(); // accepts user input
    double guess= (xInput/3); //original guess of cube root, very inaccurate
    double guess2= ((guess*guess*guess+xInput)/(3*guess*guess)); // accuracy improves with each guess
    double guess3= ((2*guess2*guess2*guess2+xInput)/(3*guess2*guess2));
    double guess4= ((2*guess3*guess3*guess3+xInput)/(3*guess3*guess3));
    double cube= (guess4*guess4*guess4); //guess4 becomes accurate enough as to be able to use to calculate
    
// request user input and print calculation data
    System.out.print(
        "Enter a double, and I print its cube-"
        );
    System.out.println(
        "The cube root is "+guess4+":" );
    System.out.println(guess4+"*"+guess4+"*"+guess4+"="+cube) ; 
    
}
}