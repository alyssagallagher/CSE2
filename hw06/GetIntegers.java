// Alyssa Gallagher
// CSE2 hw06
// Get Integers Java Program
// Due 3/3/2015

import java.util.Scanner;
// define a class
public class GetIntegers{
    //define a main method
public static void main(String [] args){
    Scanner myScanner; //declare scanner
    myScanner=new Scanner(System. in);
System.out.print("Please enter 5 non-negative integers"
    );
// declare variables 
int number=0; 
int sum=0;

for(int i=0; i < 5; i++){
    do{
        number=-1;
        String val=myScanner.next();
        try{
            number= Integer.parseInt(val);  //try for an integer
            if(number < 0 ){ //if the integer is found check that it is positive
                System.out.println("invalid input");
            }
        }
        catch(NumberFormatException e ){ //catch the error and 
            System.out.println("invalid input"); //print this error
        }
    }
    while(number < 0 ); //while the number is positive, sum them
   sum+= number;
}
    
System.out.print("the sum is " + sum); //print the sum 
 
   
} // end main method
} // end class 