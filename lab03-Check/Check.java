//
//Chris Alexander
//CSE2 Lab03
//Check
//
//first compile the Java Program
//      javac Check.java
//then run the program
//      java Check//

import java.util.Scanner;

//define a class
public class Check{

//add main method
  public static void main(String[] args){
      //use the scanner constructor
      Scanner myScanner = new Scanner( System.in );
      //take inputs
      System.out.print("Enter the original cost of the check in the form xx.xx: ");
      double checkCost = myScanner.nextDouble();
      System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx):");
      double tipPercent = myScanner.nextDouble();
      tipPercent /= 100; //We want to convert the percentage into a decimal value
      System.out.print("Enter the number of people who went out to dinner: ");
      int numPeople = myScanner.nextInt();
      double totalCost;
      double costPerPerson;
      int dollars,   //whole dollar amount of cost 
      dimes, pennies; //for storing digits
      //to the right of the decimal point //for the cost$ 
      totalCost = checkCost * (1 + tipPercent);
      costPerPerson = totalCost / numPeople;
      //get the whole amount, dropping decimal fraction
      dollars=(int)costPerPerson;
      //do the same thing with the dimes
      dimes=(int)(costPerPerson * 10) % 10;
      //and with the pennies
      pennies=(int)(costPerPerson * 100) % 10;
      //Print out the final statement
      System.out.println("Each person in the group owes $" + dollars + "." + dimes + pennies);
  }
}



