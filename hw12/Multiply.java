// Alyssa Gallagher
// CSE2 hw12

import java.util.Scanner;

public class Multiply{
    public static void main(String [] args){
        int h=0;
        int w=0;
        int h2=0;
        int w2=0;
        while(true){ //infinite while loop that breaks when if becomes true
        System.out.println("Enter height 1:");
        h=inputCheck(); //implement method to check for valid imput
        System.out.println("Enter width 1: ");
        w=inputCheck();
        System.out.println("Enter height 2: ");
        h2=inputCheck();
        System.out.println("Enter width 2: ");
        w2=inputCheck();
        
        if(w==h2){ //loop only breaks when width 1 = height 2 
            break; //break out of loop
        } //ends if multiplication possible
        else{
            System.out.println("Cannot be multipled");
        } //ends else multiplication impossible
        }
        
        //initalize matrices
        int[][] array1=randomMatrix(h,w);
        int[][] array2=randomMatrix(h2,w2);
        int[][] array3=multiplyMatrix(array1, array2);
        
        //pre
        print(array1);
        System.out.print("");
        print(array2);
        System.out.print("The matrix is ");
        System.out.println("");
        print(array3);
        
    } //ends main method 
    
    
public static void print(int[][] array){
        int[][] matrix = array;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            } //ends for printing 
            System.out.println();
        } //ends for printing 
    } //ends print method 
    
public static int inputCheck(){ //method to check for positive int
    while(true){ //continually asks for input until input is returned
        Scanner myScanner = new Scanner(System.in);
        int input=0;
        
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
    } //ends whiel loop
} //ends inputCheck method 

public static int [][] randomMatrix(int height, int width){ 
        int [][] array= new int [height][width]; //initialize array
        for(int i=0; i < array.length; i++){ //creates rows
            for(int j=0; j < array[i].length; j++){ //creates columns
                array[i][j]=(int)((Math.random()*20)-10);
            } //ends for loops filling columns 
        } //ends for loops filling rows
        return array; //returns the matrix to the main method 
    } //end method creating matrix using user input for height and width
    
public static int [][] multiplyMatrix(int[][] one, int[][] two){
    int rows1 = one.length;
    int columns1 =one[0].length;
    int columns2 = two[0].length;
    int[][] array3= new int [rows1][columns2];
    for(int i=0; i < rows1; i++){
        for(int j=0; j < columns2; j++){
            for(int k=0; k < columns1; k++){
                array3[i][j] = array3[i][j] + one[i][k] * two[k][j];
            } //ends for k 
        } //ends for j
    } //ends for i
    return array3;
    
} //ends multipyMatrix method 
} //ends class