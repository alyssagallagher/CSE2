// Alyssa Gallagher
// CSE2 hw06
// Make Symbols Program
// 3/3/2015

import java.util.Scanner;
// define a class
public class GetSymbols{ 
    //define a main method 
    public static void main(String[] args){
        
    Scanner myScanner; // declare instance of Scanner object
    myScanner = new Scanner(System.in); //tell Scanner to accept input
    
    int input= ((int)(Math.random()*100)); //declare variable using random Math number
    
    System.out.println(input); //print the randomly generated number
    
    if(input % 2 == 0){ //if the number is even
        for(int i = 0; i < input; i++){ //for loop to print the number of stars
            System.out.print("*"); //print the stars
        } //end loop
        
    } //end if statement
    else{ // if number is not even
        for(int i = 0; i < input; i++){ //for loop to print the number of & symbols same as number
            System.out.print("&"); //prints the & symbols
        } //end for loop
    } //end else number is odd
    
    
    } //end main method 
} //end class