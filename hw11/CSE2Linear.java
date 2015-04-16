// Alyssa Gallagher
// CSE 2 hw 11
// Fun with searching java program

import java.util.Scanner; 
import java.util.Random;

public class CSE2Linear {
	public static void main(String [] arg){
		Scanner scan = new Scanner(System.in);
		int grades[] = new int[15];
		System.out.println("Enter 15 ints for final grades in CSE2:");
		int input = 0; 
		int lastInput = 0; //create last input variable for comparison 
		for (int i = 0; i < grades.length; i++) {
			while(true){
				if (scan.hasNextInt()) {
					input = scan.nextInt();
					if (input < 0 || input > 100) {
						System.out.println("Input must be between 0-100");
						continue;
					} //ends if input is in range 0-100 
					else if (input < lastInput) {
						System.out.println("Input must be greater than or equal to last input");
						continue;
					} //ends else if input last is not greater than input previous  
					else{
						grades[i] = input;
						lastInput = input;
						break;
					}
				} // ends if scanner has an integer as input  
				else {
					System.out.println("Input must be an integer");
					scan.next();
					continue;
				} //ends else input is not an integer
			} //ends while loop
		} //ends for loop 

    String printArray = "The grades, sorted, are: "; //creat a string statement to print array 
		printArray += Array(grades); //add the completed array to the string statement
		System.out.println(printArray); //print the string statement with the array
    
    System.out.println("Enter a grade to search for: ");
    int gradeToFind = scan.nextInt();
    binarySearch(grades, gradeToFind);
    
    grades = random(grades);
    System.out.println("Randomized: ");
    System.out.println(Array(grades));
    
    System.out.println("Enter a grade to search for: ");
    gradeToFind = scan.nextInt();
    linearSearch(grades, gradeToFind);
        
    } //ends main method   
  
  public static String Array(int num[]){
		String printArray="{";
		for(int j=0;j<num.length;j++){
			if(j>0){
				printArray+=", ";
			}
			printArray+=num[j];
		}
		printArray+="} ";
		return printArray;
	} // ends string array method 
  
  public static void binarySearch(int array[], int gradeToFind) {
    int size= array.length;
    int startIndex= 0;
    int endIndex= size-1; //array starts at 0 so must subtract 1
    int iterations = 0;
    
    while(startIndex < endIndex) {
      iterations++;
      int middle = (endIndex - startIndex)/2 + startIndex;
      if(array[middle] == gradeToFind) {
        System.out.println("Found " + gradeToFind + " at index " + middle + " in " + iterations + " iterations.");
        return;
      }
      else if(array[middle] < gradeToFind) {
        startIndex = middle + 1;
      } 
      else {
        endIndex= middle - 1;
      }     
    }
    iterations++;
    System.out.println(gradeToFind + " not found in " + iterations + " iterations.");
      
  } //ends binarySearch method
  
  public static int[] random(int number[]){
    
    for(int i = 0; i < 100; i++) {
      int indexA = (int) (Math.random() * number.length);
      int indexB = (int) (Math.random() * number.length);
      int temp = number[indexA];
      number[indexA] = number[indexB];
      number[indexB] = temp;
    }
    
    return number;
  } //ends random method 
  
  public static void linearSearch(int array[], int gradeToFind){
    int iterations=0;
    for(int i=0; i < array.length; i++){
      iterations++;
      if(array[i] == gradeToFind){
        System.out.println("Found " + gradeToFind + " at index " + i + " in " + iterations + " iterations.");
        return;
      }     
    }  
    iterations++;
    System.out.println(gradeToFind + " not found in " + iterations + " iterations.");    
  } //ends method linearSearch
  
  
} //ends class 