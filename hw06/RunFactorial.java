// Alyssa Gallagher
// CSE2 
// Run Factorial Program
import java.util.Scanner;
public class RunFactorial{ // define a class 
    public static void main(String [] args){ // define a method
        int input=0;
       int factorial= 1;
       Scanner myScanner;
       myScanner= new Scanner(System. in);

System.out.print("Enter a number");
boolean validInput=false;

while((myScanner.hasNext()) || (!validInput)){
    if(myScanner.hasNextInt()){
      input = myScanner.nextInt();
        if((input > 9) && (input < 16)){
            validInput=true;
        } // end if input is between 9 and 16
    } // end if input is an integer  
    else{
        System.out.print("invalid input, enter again");
    } //end if input is not an integer and is in range
    } // end while that determines valid int
int i=1;
while (i<= input){
    factorial= factorial * i;
    i++;
     }// end while input is accepted
    
System.out.println("Input accepted:");
System.out.println(input+"!="+factorial);


} // end main method 
} // end class 