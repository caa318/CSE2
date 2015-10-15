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
                System.out.println("Error: need a positive integer.  Try again: ");
                myScanner.next();
            }
            if (height<0 || height>100){
                System.out.println("Error: integer must be within desired range.  Try again: ");
                myScanner.next();
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
       /* 
        int count=0; 
        int i=0;
        int j=0;
        for(i=0;i<input;i++){
            count++; 
            for(j=0;j<count;j++){
                  System.out.print("*"); 
            }
          System.out.print(" ");   
          System.out.println(); 
        }
        /*
        for (int i=0; i<(input/2)-1; i++){
            int a=((input)-((input)-i));
            int b=(((input)-i)-2);
            
            
            
            
            for (int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.print(" ");
            for(int j=0;j<2*b;j++){
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for (int i=input/2; i>0; i--){
            int a=((input)-((input)-i));
            int b=(((input)-i)-2);
            
            
            
            
            for (int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.print(" ");
            for(int j=0;j<2*b;j++){
                System.out.print("*");
            }
            System.out.print(" ");
            for (int j=0;j<a;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        */
  }
}