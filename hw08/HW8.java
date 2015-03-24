//Alyssa Gallagher
//CSE 2 HW08
//Due 3/24/15
// MG's Adventure World Java Program
import java.util.Scanner;
public class HW8{
    public static void main(String [] args){
    char option;
    Scanner scan=new Scanner(System.in);
    System.out.println("Welcome to MG's adventure world. Now your jounrye begins. Good luck!");
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
    String input=getInput(scan, "Cc");
    System.out.println("You are in a dead valley.");
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit");
    input= getInput(scan,"Cc");
    System.out.println("You walked and walked and walked and you saw a cave!");
    cave();
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
    input=getInput(scan,"Cc");
    System.out.println("You entered a cave!");
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit");
    input=getInput(scan, "Cc");
    System.out.println("Unforutunately, you ran into a GIANT!");
    giant();
    System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to yield");
    input=getInput(scan, "AeEe", 10);
    System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
    System.out.println("There are 3 treasure boxes in front of you! Enter the box number you want to open!");
    box();
    input=getInput(scan);
    System.out.println("Hero! Have a good day!");
    
    } //ends main method
    
    public static String getInput(Scanner scan, String string){ // get input method to accept user C or c
        if(scan.hasNext()){
            String choice=scan.next();
            if(choice.equalsIgnoreCase(string.charAt(0)+ "")){
                return choice;
            } // ends if input is C or c
            else{
                System.out.println("YEA right loser!");
                System.exit(0); //terminates program
            } //ends else user does not enter C or c 
        } //ends if scan.hasNext  
        System.exit(0);
        return "";
    } //ends getInput method 
    
    public static String getInput(Scanner scan, String string, int trial){
        int hits=0;
        while(scan.hasNext()){
            String option=scan.next();
            if(option.equalsIgnoreCase(string.charAt(0)+"")){
                int hitOrMiss=(int)(Math.random()*2);
                if(hitOrMiss==0){
                    hits+=1;
                    System.out.println("Critical hit!");
                    if(hits==trial){
                        return option;
                    } //ends if hits gets to 10
                } //ends if hitOrMiss=0
                else{
                    System.out.println("Gosh! How can you miss it!");
                } //ends else hitOrMiss=1 
            }//ends if user inputs attack
            else if(option.equalsIgnoreCase(string.charAt(2)+"")){ //else if user choses trying to escape
                int escape=(int)(Math.random()*11); //int 1-10 
                if(escape==10){ 
                    System.out.println("You escaped the giant successfully");
                    System.exit(0);
                } //ends if escape=10 and user escapes
                else{
                    System.out.println("You did not escape");
                } //ends else user does not escape
            }//ends else if user tries to escape
            else{
                System.out.println("Executed by the GIANT! Game Over!");
                System.exit(0);
            } //ends else user did not enter AaEe
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to yield");
        } //ends if scan.hasNext
        return "";
    } //ends method getInput AaEe
    
    public static String getInput(Scanner scan){
        if(scan.hasNextInt()){
            int box=scan.nextInt();
            switch(box){
                case 1: System.out.println("It is $100! Have a good day!");
                    break;
                case 2: System.out.println("It is a GPA 4.00! Have a good day!");
                    break;
                case 3: System.out.println("You get Pikachu as a pet! YAYAY!");
                    break;
                default: System.out.println("Wrong number, you get nothing! Better restart the game LOL!");
            } // ends switch box choice
        } //ends if scan.hasNextInt box choice
        return "";
    } //ends method getInput box
    
     public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

}// ends class