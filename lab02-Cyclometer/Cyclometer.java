// Alyssa Gallagher
// 1/30/2015
// Cyclometer Lab CSE2 
// Program will (given time and rotation count) print the number of minutes for each trip, print the number of counts for each trip, print the distance of each trip in miles and print the distance of two trips combined.
//
public class Cyclometer {
    // main method required for every java program
    public static void main(String [] args) {
        // our input data 
        int secsTrip1=480; //
        int secsTrip2=3220; //
        int countsTrip1=1561; //
        int countsTrip2=9037; //
    // our intermediate variables and output data
    double wheelDiameter=27.0, //
    PI=3.14159, //
    feetPerMile=5280, //
    inchesPerFoot= 12, //
    secondsPerMinute= 60; //
    double distanceTrip1, distanceTrip2, totalDistance; //
    System.out.println("Trip 1 took ")+
        (secsTrip1/secondsPerMinute)+ " minutes and had " +
        countsTrip1+" counts.");
    System.out.println("Trip 2 took ")+ 
        (secsTrip2/secondsPerMinute)+" minutes and had"+
        countsTrip2+" counts.");
        
// run the calculations; store the values. Document your
// calcuations here. What are you calculating?
//
//
distanceTrip1=countsTrip1*wheelDiameter*PI;
// Above gives distance in inches
// (for each count, a rotation of the wheel travels the 
// diamter in inches times PI)
distanceTrip1/=inchesPerFoot*feetPerMile; // Gives the distance
// in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    // Print out the output data.
System.out.println("Trip 1 was "+distanceTrip1+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");

    } // end of main method 
} //end of class
