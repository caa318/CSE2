/*
Chris Alexander
CSE2 Lab07
encrypted_x

first compile the Java Program
      javac encrypted_x.java
then run the program
      java encrypted_x
      */
      
import java.util.Scanner; 

//define a class
public class encrypted_x{

//add main method
  public static void main(String[] args){ 
    Scanner myScanner= new Scanner(System.in);
    int height=0;
    boolean allowed=false;
    System.out.print("Enter an integer between 1 and 100:");
        while(!allowed){
            if(myScanner.hasNextInt()){
                height=myScanner.nextInt();
                allowed=true;
            }
            else{
                System.out.print("Error: integer must be within [0,100].  Try again: ");
                myScanner.next();
            }
            while (height<0 || height>100){
                System.out.print("Error: integer must be within [0,100].  Try again: ");
                if(myScanner.hasNextInt()){
                    height=myScanner.nextInt();
                    allowed=true;
                }
                else{
                    myScanner.next();
                }
            }
        }
       
    for( int row = 0; row < height; row++ ) {
        for( int column = 0; column < height; column++ ) {
            if( column == row || column == height - row - 1) {
                System.out.print(" ");
            }
            else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
  }
}
