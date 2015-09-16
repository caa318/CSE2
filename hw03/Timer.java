//
//Chris Alexander
//CSE2 HW03
//Timer
//
//first compile the Java Program
//      javac Timer.java
//then run the program
//      java Timer//

import java.util.Scanner;

//define a class
public class Timer{

//add main method
  public static void main(String[] args){
      //take the input times in the form of XXYY
      Scanner myScanner = new Scanner( System.in );
          //current time
      System.out.print("Enter the current time: ");
      int currentTime = myScanner.nextInt();
          //dinner time
      System.out.print("Enter the time that you will be eating dinner: ");
      int dinnerTime = myScanner.nextInt();
          //calculate the number of hours until dinner
      int hoursTil=((dinnerTime-currentTime)/100);
          //figure out the number of minutes
          //take the time minus the time rounded down to the nearest hour
      int dinnerTimeMinutes=((dinnerTime)-((dinnerTime/100)*100));
      int minutesFromDinner = (dinnerTimeMinutes);
          //figure out the number of minutes
          //take the time minus the time rounded down to the nearest hour
      int currentTimeMinutes=((currentTime)-((currentTime/100)*100));
          //make sure to subtract the minutes from 60
      int minutesFromCurrent = 60-(currentTimeMinutes);
          //add up the minutes to get the total minutes
      int minutesTil = minutesFromCurrent + minutesFromDinner;
          //the minutes may come out to be 60 minutes more than it should,
          //so if it is >= 60, you must subtract by 60.
      if(minutesTil>=60){
          minutesTil=minutesTil-60;
      }
          //print statement
      System.out.println("You have " + hoursTil + " hours and " + minutesTil +"  minutes until dinner.");
  }
}
