/*
Chris Alexander
CSE2 hw11
CSE2Linear

first compile the Java Program
      javac CSE2Linear.java
then run the program
      java CSE2Linear
      
      */
      
      
import java.util.Scanner;
  //define class
public class CSE2Linear{
      //initialize main method
    public static void main(String[] args){
          //define an array as an int with 15 elements
        int[] array= new int[15];
          //initialize the previous int for taking the elements in an array
        int previous=0;
          //State that you are taking 15 ints for final grades
        System.out.println("Enter 15 ints for final grades in CSE2. ");
          //for loop to assign the 14 elements
        for (int i=0;i<15;i++){
              //assign the return from the input method of previous to 
              //the array for the ith element
            array[i]=input(previous);
              //assign the most recent input to be the new previous value.
            previous=array[i];
        }
          //print the array
        printArray(array);
          //print a new line
        System.out.print("\n");
          //State intentions for binary search
        System.out.print("Search for a number using binary search. ");
          //initialize a checkFor value to check the binary search code
              //input(0) will take an int between 0 and 100
        int checkFor=input(0);
          //run a binary search
        BinarySearch(checkFor, array);
          //randomize the array
        Randomize(array);
          //print the randomized array
        printArray(array);
          //new line
        System.out.print("\n");
          //State intentions for binary search
        System.out.print("Search for a number using linear search. ");
          //get a checkFor value to check the binary search code
        checkFor=input(0);
          //run a linear search
        LinearSearch(checkFor, array);
        
        
        
    }
      //method to print the array
    public static void printArray(int[] array){
        //for [0, length of the array)
        for (int i=0 ; i<array.length ; i++){
            //print out the ith element of the array with a space
            System.out.print(array[i]+" ");
      }
    }
      //method to take input
    public static int input(int previous){
          //Create myScanner Scanner
        Scanner myScanner = new Scanner (System.in);
          //initialize the input
        int input=0;
          //start off with allowed being false
        boolean allowed=false;
          //while not allowed (true for the first instance)
        while(!allowed){
              //ask for an integer
            System.out.print("Enter an integer " +previous+" to 100: ");
              //if an int is entered
            if(myScanner.hasNextInt()){
                  //assign it to input
                input=myScanner.nextInt();
                  //switch the boolean to not go back in the while loop
                allowed= true;
                  //but first, check to make sure its within bounds
                if(input>100 || input<0){
                      //if not, print an error
                    System.out.println("Failed to enter an int within range. Try again.");
                      //change it back to false
                    allowed=false;
                      //go back to the top
                    continue;
                }
                  //if the value isn't bigger than the previous
                if(input<previous){
                      //print error
                    System.out.println("Failed to enter an int larger than the previous ("+previous+"). Try again.");
                      //change it back to false
                    allowed=false;
                      //go back to the top
                    continue;
                }
            }
              //if it isn't an int
            else{
                  //print error
                System.out.println("Failed to enter an int.  Try again.");
                  //take and discard whatever is input.  Try again.
                myScanner.next();
            }
        }
          //return the valid int.
        return input;
    }
    
      //method to implement a linear search
    public static void LinearSearch(int checkFor, int[] array){
          //start with found being false
        boolean found=false;
          //keep track of iterations
        int iterations=0;
          //initialize an index
        int index=0;
            //for every element of the array
        for(int i=0;i<array.length;i++){
              // ++ the iterations
            iterations++;
              //make the array of i the index
            index=array[i];
              //check if it equals the check value
            if (index==checkFor){
                  //if it does, make found true
                found=true;
                  //break the for loop
                break;
            }
        }
          //if it is found
        if (found==true){
              //say it was
            System.out.println("The number was found in "+iterations+" itterations. ");
        }
          //otherwise
        else{
              //say it wasn't
            System.out.println("The number was not found with "+iterations+" ittereations.");
        }
    }
      //method to implement a binary search
    public static void BinarySearch(int checkFor, int[] array){
          //initialize low, high, middle and count as integers
        int low=0;
        int high = array.length-1;
        int count=0;
        int middle=0;
          //initialize found as a boolean
        boolean found=false;
          //while the low value is smaller than the high value
        while (low<=high){
              //count an iteration
            count++;
              //figure out the middle
            middle=(low+((high-low)/2));
              //if the check value is greater than the middleth value in the array
            if (checkFor>array[middle]){
                  //reestablish the low to be middle+1
                low=middle+1;
            }
              //if the check value is greater than the middleth value in the array
            else if (checkFor<array[middle]){
                  //reestablish the high to be middle-1
                high=middle-1;
            }
              //if they are equal
            else{
                  //change to true
                found=true;
                  //break
                break;
            }
        }
          //if found the number
        if(found){
              //print that
            System.out.println("The number was found in "+count+" iterations.");
        }
          //if number wasnt found
        if(!found){
              //print that
            System.out.println("The number was not found in the array with "+count+" iterations.");
        }
        
    }
    
    public static void Randomize(int[] array){
        //for 100 times
        for (int i =0 ; i<100 ; i++){
            //get a random number from 0 to 14
            int index = (int)((Math.random()*15));
                //assign the string from the array of that value to an arbitrary string
            int temporary = array[index];
                //assign the string in slot zero to the slot in array of that value
            array[index]=array[0];
                //assign the temporary string to the slot zero
            array[0] = temporary;
        }
            //print out the header before the print method
        System.out.print("\nRandomized order: ");
    }
        
    
}
