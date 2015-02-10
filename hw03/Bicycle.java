// Alyssa Gallagher
// Due 2/10/2015
// Bicycle Java Program

import java.util.Scanner;

//define a class
public class Bicycle{
    
// define a method
public static void main(String [] args) {
    Scanner myScanner; // declares an instance of the Scanner object
    myScanner = new Scanner( System. in ); // command tells Scanner an instance is created that will take input from STDIN
    System.out.print(
        "Enter the number of seconds(an integer > 0) : ");
        int nSeconds = myScanner.nextInt(); // accepts user input
        System.out.print(" Enter the number of counts( an integer >0) :");
        int nCounts = myScanner.nextInt() ;
        double wheelDiameter=27.0, // diameter of bike wheel, used for calculations in distanceTrip
PI=3.14159, // the constant PI, will be used for calculations for distanceTrip
feetPerMile=5280, // the number of feet in 1 mile, used for calculations in distanceTrip
inchesPerFoot=12, // the number of inches in 1 foot, used for calculations in distanceTrip
secondsPerMinute=60; // the number of seconds in 1 minute, used for calculations in timeTrip
double distanceTrip, timeTrip, avgMph, finalDistanceTrip, finalavgMph; //variables that will determine distance, time and average mph of trip
distanceTrip=(int)((nCounts*wheelDiameter*PI/inchesPerFoot/feetPerMile)*100); // will tell distance of trip with many decimals
finalDistanceTrip= distanceTrip/100;  // distance of trip corrected for decimal rounding
timeTrip=nSeconds/secondsPerMinute; // will tell the amount of time the trip took in minutes
avgMph=(int)((finalDistanceTrip/(timeTrip/60)*100)); // will tell the average mph over the course of the trip
finalavgMph= avgMph/100; // average mph corrected for decminal rounding

System.out.print(
    "The distance was " +
    (finalDistanceTrip)+ " miles and took "+
    (timeTrip)+ " minutes. ");

System.out.print(
    "The average mph was " +
    (finalavgMph));
}
}
