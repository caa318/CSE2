//
//Chris Alexander
//CSE2 HW03
//Block
//
//first compile the Java Program
//      javac Block.java
//then run the program
//      java Block//

import java.util.Scanner;

//define a class
public class Block{

//add main method
  public static void main(String[] args){
      Scanner myScanner = new Scanner( System.in );
        //take the input length, width and height as doubles
      System.out.print("Enter the length of the block: ");
      double length = myScanner.nextDouble();
      System.out.print("Enter the width of the block: ");
      double width= myScanner.nextDouble();
      System.out.print("Enter the height of the block: ");
      double height = myScanner.nextDouble();
      
      
        //volume is LxWxH of the block
      double volume = (length*width*height);
        //surface area is surface of all 6 sifes
      double surfaceArea = 2*((length*width)+(length*height)+(height*width));
      
      
        //print out the statements
      System.out.println("The volume of the block of dimensions " + length + " x " + width + " x " + height + " is " + volume);
      System.out.println("The surface area of the block is " + surfaceArea);
  }
}
