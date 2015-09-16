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
      Scanner myScanner = new Scanner( System.in );
      System.out.print("Enter the current time: ");
      int currentTime = myScanner.nextInt();
      System.out.print("Enter the time that you will be eating dinner: ");
      int dinnerTime = myScanner.nextInt();
      int hoursTil=((dinnerTime-currentTime)/100);
      int dinnerTimeMinutes=((dinnerTime)-((dinnerTime/100)*100));
      int minutesFromDinner = (dinnerTimeMinutes);
      int currentTimeMinutes=((currentTime)-((currentTime/100)*100));
      int minutesFromCurrent = 60-(currentTimeMinutes);
      int minutesTil = minutesFromCurrent + minutesFromDinner;
      if(minutesTil>=60){
          minutesTil=minutesTil-60;
      }
      System.out.println("You have " + hoursTil + " hours and " + minutesTil +"  minutes until dinner.");
  }
}
