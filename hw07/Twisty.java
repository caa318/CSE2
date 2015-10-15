/*
Chris Alexander
CSE2 HW07
Twisty

first compile the Java Program
      javac Twisty.java
then run the program
      java Twisty
      */
      
import java.util.Scanner;      
public class Twisty {
    //add main method
    public static void main(String[] args) {
        //tell program you want to use scanner constructor 
        Scanner myScanner = new Scanner(System.in);
            //initialize the length as an integer
        int length=0;
            //set up a boolean to tell whether it is a valid input
        boolean allowed=false;
            //header statement to take input
        System.out.print("Input your desired length: ");
                //while statement allows loop if multiple
                //bad inputs
            while (!allowed){
                    //if the next input is an int
                if (myScanner.hasNextInt()){
                        //store it to length
                    length = myScanner.nextInt();
                        //switch the boolean to exit the while loop
                    allowed = true;
                }
                    //else
                else{
                        //print error
                    System.out.println("Error: please type in an integer. ");
                    System.out.print("Input your desired length: ");
                        //take the input as a string, repeat.
                    myScanner.next();
                }
                    //while it is outside of [0,80] range,
                while (length<0 || length>80){
                        //print error
                    System.out.println("Error: need positve integer [0,80]");
                    System.out.print("Input your desired length: ");
                        //retake the number
                        //if next input is an int,
                    if (myScanner.hasNextInt()){
                            //store it as length
                        length = myScanner.nextInt();
                            //switch to exit the loop
                        allowed = true;
                    }
                        //else
                    else{
                            //store it as a string, repeat.
                        myScanner.next();
                    
                }
            }
        }
        
        //REPEAT THE SAME PROCESS FOR WIDTH
        int width=0;
        allowed=false;
        System.out.print("Input your desired width: ");
            while (!allowed){   
                if (myScanner.hasNextInt()){
                    width = myScanner.nextInt();
                    allowed = true;
                }
                else {
                    System.out.println("Error: please type in an integer. ");
                    System.out.print("Input your desired width: ");
                    myScanner.next();
                }
                while  (width < 0 || width > length){
                    System.out.println("Error: need positive width [0,Length]");
                    System.out.print("Input positive width: ");
                    if (myScanner.hasNextInt()){
                        width = myScanner.nextInt();
                        allowed = true;
                    }
                    else {
                        myScanner.next();
                    }
                }
            }
        //initialize variables
            //these are the initial positions of each symbol on the line
            //repeated over 2*width
        int pound1=0;
        int forwardSlash=width-1;
        int backSlash=width;
        int pound2=(2*width)-1;
            //let this be equivalent to 2*width for simplicity
        int twoW = (2*width);
            //first for loop takes care of printing each row
        for( int j=0;j<width;j++){
                //this loop takes care of printing something in 
                //each character spot from 0 to length-1
            for(int i=0;i<length;i++){
                    //if the character spot mod 2w is equal to the value for pound1
                    //print #
                if (i%twoW==pound1){
                    System.out.print("#");
                }
                    //else if the character spot mod 2w is equal to the value for forwardSlash
                    //print /
                else if (i%twoW==forwardSlash){
                    System.out.print("/");
                }
                    //else if the character spot mod 2w is equal to the value for backSlash
                    //print \\ (two \\ to actually print one)
                else if (i%twoW==backSlash){
                    System.out.print("\\");
                }
                    //else if the character spot mod 2w is equal to the value for pound2
                    //print #
                else if (i%twoW==pound2){
                    System.out.print("#");
                }
                    //else print a space
                else{
                    System.out.print(" ");
                }
            }
            //modify each of the initial positions to reflact the change line to line
                //pound1 scoots the right one each time
            pound1++;
                //forwardSlash scoots to the left each time
            forwardSlash--;
                //backSlash scoots to the right each time
            backSlash++;
                //pound2 scoots to the left each time
            pound2--;
                //print a new line to start the row repetition
            System.out.print("\n");
        }
    }
}
