/*
Chris Alexander
CSE2 hw08
StringAnalysis

first compile the Java Program
      javac StringAnalysis.java
then run the program
      java StringAnalysis
      */
      
import java.util.Scanner; 

//define a class
public class StringAnalysis{

//add main method
    public static void main(String[] args){
            //initialize an integer
        int integer=0;
            //initialize a scanner to take values
        Scanner myScanner = new Scanner(System.in);
            //ask for string
        System.out.print("enter a string: ");
            //assign the string to fullString
        String fullString=myScanner.next();
            //get the length of the string as an int
        int length = fullString.length();
            //ask for an integer (optional)
        System.out.print("Enter an integer if you want. If not, type 'n' : ");
            //if they enter an integer
        if (myScanner.hasNextInt()){    
                //assign it to integer
            integer=myScanner.nextInt();
        }
            //if not,
        else{
                //take and discard the value
            myScanner.next();
        }
            //if they give you an int, you must make sure it is positive
        while(integer<0){
                System.out.print("Error: please type in a positive integer or 'n'. Try again: ");
                if(myScanner.hasNextInt()){
                    integer=myScanner.nextInt();
                }
                else{
                    myScanner.next();
                    integer=0;
                    break;
                }
        }
            //if they give you an integer and it is less than the length of the string,
            //evaluate the string for the first (integer) characters.
            //use this itteration of fullAnalysis
        if (integer<=length && integer!=0){
                //Print "all letters" if return if test does not fail
            if (fullAnalysis(fullString,integer)==false){
                System.out.println("The first " +integer+ " characters in the string are all letters.");
            }
        }
        //else evaluate the entire string
        //use this itteration of fullAnalysis
        else{
                //Print "all letters" if return if test does not fail
            if (fullAnalysis(fullString)==false){
                System.out.println("This is a string of all letters.");
            }
        }
        
    }
        //use this if they give you an integer to evaluate
    public static boolean fullAnalysis(String fullString, int integer){
            //set length to the length of the string
        int length = fullString.length();
            //initialize booleans
        boolean letter=false;
        boolean fail =false;
            //initialize char values to check range
        char a = 'a';
        char z = 'z';
        int i=0;
            //initialize for loop to check the first [integer] characters in the string
        for (i=0; i<integer;i++){
            letter=false;
                //take the charater at the appropriate i spot in the string
                //assign it to 'character'
            char character=fullString.charAt(i);
                //if character is between [a,z], it is a letter
            if (character>=a && character<=z){
                    //make letter true
                letter=true;
            }
                //if it isn't a letter
            if (letter==false){
                    //print that the first [integer] character are not all letters
                System.out.println("The first "+integer+" characters in the string are not comprised of all letters.");
                    //change fail to true to prevent the priniting of "all letters" in the main method
                fail=true;
                    //break to avoid repitition
                break;
            }
        }
            //return the boolean
        return fail;
    }
    public static boolean fullAnalysis(String fullString){
            //set length to the length of the string
        int length = fullString.length();
            //initialize booleans
        boolean letter=false;
        boolean fail =false;
            //initialize char values to check range
        char a = 'a';
        char z = 'z';
        int i=0;
            //initialize for loop to check every character in the string
        for (i=0; i<length;i++){
            letter=false;
                //take the charater at the appropriate i spot in the string
                //assign it to 'character'
            char character=fullString.charAt(i);
                //if character is between [a,z], it is a letter
            if (character>=a && character<=z){
                    //make letter true
                letter=true;
            }
                //if it isn't a letter
            if (letter==false){
                    //print that the first string is not all letters
                System.out.println("The string is not comprised of all letters.");
                    //change fail to true to prevent the priniting of "all letters" in the main method
                fail=true;
                    //break to avoid repitition
                break;
            }
        }
            //return the boolean
        return fail;
    }
}
