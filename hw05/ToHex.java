// Alyssa Gallagher
// CSE2 
// Decimal to Hexadecimal Converter Java Program
// Due 2/24/15

import java.util.Scanner; 

// define a class 
public class ToHex{
    // define a main method
public static void main(String[] args){
Scanner myScanner;
myScanner=new Scanner(System. in );
System.out.print("Please enter three numbers representing RGB values: "); //prompt the user to enter values
if(myScanner.hasNextInt()){//start if statement if user does not enter three integers
int inputOne=myScanner.nextInt();
if(myScanner.hasNextInt()){
int inputTwo=myScanner.nextInt();
if(myScanner.hasNextInt()){
int inputThree=myScanner.nextInt();
    

// set user inputs as variables


// if integers are not 0-255
if((inputOne > 255) || (inputTwo > 255) || (inputThree > 255) || (inputOne < 0) || (inputTwo < 0) || (inputThree < 0)){
    System.out.println("Sorry, your input must consist of values between 0-255");
} // ends if values are not in between 0-255
else{ //begin program if all integers are 0-255

// declare variables for first integer of input
int oneDividedBySixteen= inputOne/16;
int oneRemainder= inputOne%16;
String oneDividedBySixteenString="A";
String oneRemainderString="A"; 

// create two swtich statements to convert the first int into hexadecimal
switch (oneDividedBySixteen){ 
    case 0: oneDividedBySixteenString="0";
        break;
    case 1: oneDividedBySixteenString="1" ; 
        break;
    case 2: oneDividedBySixteenString="2";
        break;
    case 3: oneDividedBySixteenString="3";
        break;
    case 4: oneDividedBySixteenString="4"; 
        break;
    case 5: oneDividedBySixteenString="5";
        break;
    case 6: oneDividedBySixteenString="6";
        break;
    case 7: oneDividedBySixteenString="7"; 
        break;
    case 8: oneDividedBySixteenString="8";
        break;
    case 9: oneDividedBySixteenString="9";
        break;
    case 10: oneDividedBySixteenString="A"; 
        break;
    case 11: oneDividedBySixteenString="B";
        break;
    case 12: oneDividedBySixteenString="C";
        break;
    case 13: oneDividedBySixteenString="D";
        break;
    case 14: oneDividedBySixteenString="E";
        break;
    case 15: oneDividedBySixteenString="F";
        break;

} //end switch for inputOne divided by 16

switch (oneRemainder){
    case 0: oneRemainderString="0";
        break;
    case 1: oneRemainderString="1";
        break;
    case 2: oneRemainderString="2";
        break;
    case 3: oneRemainderString="3";
        break;
    case 4: oneRemainderString="4";
        break;
    case 5: oneRemainderString="5";
        break;
    case 6: oneRemainderString="6";
        break;
    case 7: oneRemainderString="7";
        break;
    case 8: oneRemainderString="8";
        break;
    case 9: oneRemainderString="9";
        break;
    case 10: oneRemainderString="A";
        break;
    case 11: oneRemainderString="B";
        break;
    case 12: oneRemainderString="C";
        break;
    case 13: oneRemainderString="D";
        break;
    case 14: oneRemainderString="E";
        break;
    case 15: oneRemainderString="F";
    
} //ends switch for input one remainder
String inputOneHex= (oneDividedBySixteenString+""+oneRemainderString); //creates variable for first input into hexadecimal

// declare variables for second input integer
int twoDividedbySixteen= inputTwo/16;
int twoRemainder= inputTwo%16;
String twoDividedBySixteenString="A";
String twoRemainderString="A";

//create two switch to convert second input into hexadecimal
switch (twoDividedbySixteen){
    case 0: twoDividedBySixteenString="0";
        break;
    case 1: twoDividedBySixteenString="1" ; 
        break;
    case 2: twoDividedBySixteenString="2";
        break;
    case 3: twoDividedBySixteenString="3";
        break;
    case 4: twoDividedBySixteenString="4"; 
        break;
    case 5: twoDividedBySixteenString="5";
        break;
    case 6: twoDividedBySixteenString="6";
        break;
    case 7: twoDividedBySixteenString="7"; 
        break;
    case 8: twoDividedBySixteenString="8";
        break;
    case 9: twoDividedBySixteenString="9";
        break;
    case 10: twoDividedBySixteenString="A"; 
        break;
    case 11: twoDividedBySixteenString="B";
        break;
    case 12: twoDividedBySixteenString="C";
        break;
    case 13: twoDividedBySixteenString="D";
        break;
    case 14: twoDividedBySixteenString="E";
        break;
    case 15: twoDividedBySixteenString="F";
        
} // end switch two divided by sixteen    
switch (twoRemainder){
    case 0: twoRemainderString="0";
        break;
    case 1: twoRemainderString="1";
        break;
    case 2: twoRemainderString="2";
        break;
    case 3: twoRemainderString="3";
        break;
    case 4: twoRemainderString="4";
        break;
    case 5: twoRemainderString="5";
        break;
    case 6: twoRemainderString="6";
        break;
    case 7: twoRemainderString="7";
        break;
    case 8: twoRemainderString="8";
        break;
    case 9: twoRemainderString="9";
        break;
    case 10: twoRemainderString="A";
        break;
    case 11: twoRemainderString="B";
        break;
    case 12: twoRemainderString="C";
        break;
    case 13: twoRemainderString="D";
        break;
    case 14: twoRemainderString="E";
        break;
    case 15: twoRemainderString="F";
        
} // ends switch two remainder

String inputTwoHex= (twoDividedBySixteenString+""+twoRemainderString);

// declare variables for second input integer
int threeDividedbySixteen= inputThree/16;
int threeRemainder= inputThree%16;
String threeDividedBySixteenString="A";
String threeRemainderString="A";

// create two swtich statements to convert third input into hexadecimal
switch (threeDividedbySixteen){
    case 0: threeDividedBySixteenString="0";
        break;
    case 1: threeDividedBySixteenString="1" ; 
        break;
    case 2: threeDividedBySixteenString="2";
        break;
    case 3: threeDividedBySixteenString="3";
        break;
    case 4: threeDividedBySixteenString="4"; 
        break;
    case 5: threeDividedBySixteenString="5";
        break;
    case 6: threeDividedBySixteenString="6";
        break;
    case 7: threeDividedBySixteenString="7"; 
        break;
    case 8: threeDividedBySixteenString="8";
        break;
    case 9: threeDividedBySixteenString="9";
        break;
    case 10: threeDividedBySixteenString="A"; 
        break;
    case 11: threeDividedBySixteenString="B";
        break;
    case 12: threeDividedBySixteenString="C";
        break;
    case 13: threeDividedBySixteenString="D";
        break;
    case 14: threeDividedBySixteenString="E";
        break;
    case 15: threeDividedBySixteenString="F";
       
} // end switch two divided by sixteen    
switch (threeRemainder){
    case 0: threeRemainderString="0";
        break;
    case 1: threeRemainderString="1";
        break;
    case 2: threeRemainderString="2";
        break;
    case 3: threeRemainderString="3";
        break;
    case 4: threeRemainderString="4";
        break;
    case 5: threeRemainderString="5";
        break;
    case 6: threeRemainderString="6";
        break;
    case 7: threeRemainderString="7";
        break;
    case 8: threeRemainderString="8";
        break;
    case 9: threeRemainderString="9";
        break;
    case 10: threeRemainderString="A";
        break;
    case 11: threeRemainderString="B";
        break;
    case 12: threeRemainderString="C";
        break;
    case 13: threeRemainderString="D";
        break;
    case 14: threeRemainderString="E";
        break;
    case 15: threeRemainderString="F";
    

} // ends switch three remainder
String inputThreeHex=(threeDividedBySixteenString+""+threeRemainderString); 

String hexadecimalNumber=(inputOneHex+""+inputTwoHex+""+inputThreeHex); //adds the three inputs into one hexadecimal number
System.out.println("The decimal numbers R:"+inputOne+", G:"+inputTwo+", B:"+inputThree+", is represented in hexadecimal as:"+hexadecimalNumber);
    
} // ends else, values are between 0-255
} // ends if third input an integer
    else{
    System.out.println("Sorry, your input must consist of integers");
    } //ends else third input not an integer
} //ends if second input an integer
    else{
    System.out.println("Sorry, your input must consist of integers");
    } // ends else second input not an integer
}//ends if first input is an integer
    else{
    System.out.println("Sorry, your input must consist of integers");
} //ends else first input not an integer

    } //end main method
} //end class
