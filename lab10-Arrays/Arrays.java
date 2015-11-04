/*
Chris Alexander
CSE2 Lab10
Arrays

first compile the Java Program
      javac Arrays.java
then run the program
      java Arrays
      */
      
import java.util.Scanner; 

//define a class
public class Arrays{

//add main method
  public static void main(String[] args){ 
      Scanner myScanner = new Scanner (System.in);
      int numberStudents = (int) ((Math.random()*6)+5);
      String[] Students = new String[numberStudents];
      System.out.print("Enter " + numberStudents + " names: \n");
      int i = 0;
      for(i = 0; i < numberStudents; i++){
          Students[i] = myScanner.nextLine();
      }
      int [] midterm = new int[numberStudents];
      for(i = 0; i < numberStudents; i++){
          midterm[i] = (int)(Math.random()*101);
      }
      for(i = 0; i < numberStudents; i++){
          System.out.println(Students[i] +" : " + midterm[i]);
      }
  }
}

      