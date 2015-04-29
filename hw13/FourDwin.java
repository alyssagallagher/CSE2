// Alyssa Gallagher
// CSE2 HW12
// To the Fourth Dimension and Beyond! Program

import java.util.Scanner; //import Scanner utility
 
public class FourDwin{ //define a class
    public static void main (String [] args){ //define a main method
        Scanner myScanner = new Scanner(System.in); 
        int x=0;
        int y=0;
        System.out.print("Enter an integer X: ");
        x=inputCheck();
        System.out.print("Enter an integer Y: ");
        y=inputCheck();
        while(x>y){ //while loop X is greater than Y
            System.out.print("Invalid input, Y must be greater than X, re-enter Y: ");
            y=inputCheck(); //reassign Y value based on user input
        } //ends while X is greater than Y
        
        //create array
        double[][][][] Array = new double[3][][][];
        //2nd dimension of array
        for(int i = 0; i < Array.length; i++) {
            Array[i] = new double[(int)((Math.random()*y) + x )] [][];
            //3rd dmimension of array
            for(int j = 0; j < Array[i].length; j++) {
                Array[i][j] = new double[ (int) ( (Math.random()*y) + x )] [];
                //4th dimension
                for(int k = 0; k < Array[i][j].length; k++) {
                    Array[i][j][k] = new double[ (int)( (Math.random()*y) + x )];
                }
            }
        }
        //fill array
        Array = createArray(Array);
        //print original array
        System.out.println("Original array: ");
        printArray(Array);
        //print sorted array
        System.out.println("Sorted array: ");
        Array = sort4DArray(Array);
        Array = sort3DArray(Array);
        printArray(Array);
        //print array stats
        statArray(Array);
        
    } //end main method
    
    public static int inputCheck(){ //method to check for positive int
    while(true){ //continually asks for input until input is returned
        Scanner myScanner = new Scanner(System.in);
        int input = 0;
        
        if(myScanner.hasNextInt()){
            input=myScanner.nextInt(); //only accept int
            if(input > 0){ //only accept pos
                return input; //only return pos int as input
            } //ends if input is a positive int
            else{
                System.out.print("Input must be positive. ");
                System.out.println("Retry input : ");
                continue;
            } //ends else input is neg
        } //ends if input is an int 
        else{
            System.out.print("Input must be an int. ");
            System.out.println("Retry input");
            continue;
        }//ends if input is not an int
    } //ends while loop
    } //ends inputCheck method 
    
    public static double[][][][] createArray(double[][][][] Array) { //fill array method
        for(int i = 0; i < Array.length; i++) {
            for(int j = 0; j < Array[i].length; j++) {
                for(int k = 0; k < Array[i][j].length; k++) {
                    for(int m = 0; m < Array[i][j][k].length; m++) {
                        //assign random value to array
                        Array[i][j][k][m] = (Math.random()*40);
                    }
                }
            }
        }
        return Array; //returns filled array
    } //end fill Array method
    
    public static void statArray(double[][][][] Array){ //define statArray method
                                                        //that prints members, sum and mean
        //declare variables 
        int members=0; 
        double sum=0;
        for(int i=0;i < Array.length; i++){
            for(int j=0; j < Array[0].length; j++){
                for(int k=0; k < Array[0][0].length; k++){
                    for(int l=0; l < Array[0][0][0].length; l++){
                        sum+= Array[i][j][k][l];
                        members++;
                    } 
                }
            }
        }
        //Print results
        System.out.println("Members: " + members);
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + (sum/members));
    } //ends statArray method
    
    public static double[][][][] sort4DArray(double[][][][] Array){
    //method that sorts the array from its smallest to largest 3D arrays
        for(int i=1; i < Array.length; i++){
            //declare and assign variables for the size and for the smallest
            //elements 
            int sizeNow=0;
            double smallNow=41;
            for(int j=0; j < Array[i].length; j++){
                for(int k=0; k < Array[i][j].length; k++){
                    for(int l=0; l < Array[i][j][k].length; l++){
                        sizeNow++;
                        if (smallNow > Array[i][j][k][l]){
                            smallNow = Array[i][j][k][l];
                        } //ends for that re-assigns the smallNow variable
                    } 
                }
            } //ends sort4DArray method 
        }
        return Array;
    }

public static double[][][][] sort3DArray(double[][][][] Array){
        double smallest = 0;
        int index = 0;
        for (int i = 0; i < Array.length; i++){
            for (int j = 0; j < Array[0].length; j++){
                for (int k = 0; k < Array[0][0].length; k++){
                    for (int l = 0; l < Array[0][0][0].length; l++){ 
                       for (int m = l ;m < Array[0][0][0].length; m++){
                           if (Array[i][j][k][m] <= smallest){
                               smallest=Array[i][j][k][m];
                               index=m;
                           } //ends if statement finding smallest value
                       } 
                    //use temporary variable to swap values 
                    double temp=Array[i][j][k][l];
                    Array[i][j][k][l]=Array[i][j][k][index];
                    Array[i][j][k][index]=temp;
                    }
                }
            }
        }
        return Array; //return Array to the main method 
    } //ends sort3DArray method 
    
      public static void printArray(double [][][][] Array){ //method that prints array 
        System.out.print("{"); //outside bracket
        for(int i = 0; i < Array.length; i++){
            System.out.print("{"); // 2nd inside bracket
            for(int j = 0; j < Array[i].length; j++){
                System.out.print("{"); //3rd inside bracket
                for(int k =0; k < Array[i][j].length;k++){
                    System.out.print("{"); //innermost bracket
                    for(int l =0; l < Array[i][j][k].length; l++){
                        System.out.print(Array[i][j][k][l]+",");
                    } //for inner most 
                    System.out.print("}");
                } //close 3rd inner bracket
                System.out.print("}");
            } //close 2nd inner bracket
            System.out.print("} ");
        } //closes the 1st inner bracker
        System.out.print("}");
    } //ends method that prints array

} //end class
