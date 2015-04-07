// Alyssa Gallagher
//CSE 2 hw10
// due 4/7/15
import java.util.Scanner;
import java.util.Random;
 
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	if(index<0){
  	  System.out.println("The index is not valid");
  	}
  	else if(index>10){
  	  System.out.println("The index is not valid");
  	}
  	else{
  	  System.out.println("Index " + index + " has been removed");
  	}
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
    System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	  }while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
 
  public static int[] randomInput() {
    int randomNums[] = new int[10];   //create a new array that can store 10 ints
    Random randy = new Random();      //initialize random object used to get random integers
    for(int i = 0; i < 10; i++) {     //loop through to fill the array
      randomNums[i] = randy.nextInt(10);   //fill array at index i with random int in range 0-9 inclusive  
    }
    return randomNums;
  }
 
  public static int[] delete(int[] list, int pos) {
  	if(pos >= list.length) {   //check if the position is out of bounds
  		return list;           //if so return the original array
  	}
    int updatedArray[] = new int[list.length - 1];   //create an array of size one less than the input array
    for(int i = 0; i < pos; i++) {    //copy all the elements to the left of the position which we dont want to keep
      updatedArray[i] = list[i];
    }
    for(int j = pos; j < list.length-1; j++) {   //copy all the elements to the right of the position which we dont want to keep
      updatedArray[j] = list[j+1];
    }
    return updatedArray;   //return the updated array
  }
 
  public static int[] remove(int[] list, int target) {
    int count = 0; //keep count of the number of occurences of target 
    for(int i = 0; i < list.length; i++) {    //loop through input array
      if(list[i] == target) {                 //check if value at index i equals target
        count++;                              //if so increment counter
      }
    }
    System.out.println("Element" +target+ " has been found");
 
    int updatedArray[] = new int[list.length - count];   //create array of proper size (original length minus number of occurences of the target value)
    int counter = 0;                                     //create counter for current index
    for(int j = 0; j < list.length; j++) {               //loop through input array
      if(list[j] != target) {                            //copy only values not equal to target
        updatedArray[counter] = list[j];                 //copy at next open location
        counter++;                                       //increment the counter 
      } 
    }  
    return updatedArray;                                //return the new array
  }  
 
}
