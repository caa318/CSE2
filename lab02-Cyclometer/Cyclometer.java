//
//Chris Alexander
//CSE2 Lab02
//Cyclometer
//
//first compile the Java Program
//      javac Cyclometer.java
//then run the program
//      java Cyclometer//

//define a class
public class Cyclometer{

//add main method
  public static void main(String[] args){
      
      
   //our input data
   int secsTrip1=480;
   int secsTrip2=3220;
   int countsTrip1=1561;
   int countsTrip2=9037;
   
   
   //our intermediate variables and output data
   double wheelDiameter=27.0,  //
   PI=3.14159, //
   feetPerMile=5280,  //
   inchesPerFoot=12,   //
   secondsPerMinute=60;  //
   double distanceTrip1, distanceTrip2,totalDistance;  //
        
    //print out the statement
    System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
    System.out.println("Trip 2 took "+(secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
    
    //calculate each trip in miles traveled
    distanceTrip1=countsTrip1*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
    //add the distances to get total miles
    totalDistance=distanceTrip1+distanceTrip2;
    
    //print the statemnt about the distances
    System.out.println("Trip 1 was a total of "+distanceTrip1+" miles.");
    System.out.println("Trip 2 was a total of "+distanceTrip2+" miles.");
    System.out.println("Together, the total distance was a whopping "+totalDistance+" miles!");

  }
  
}