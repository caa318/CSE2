/*
Chris Alexander
CSE2 hw12
Transpose

first compile the Java Program
      javac Transpose.java
then run the program
      java Transpose
      
      */
  //import scanner
import java.util.Scanner;
  //define class
public class Transpose{
      //implement main method
    public static void main(String[] args){
          //make string as a fill-in-the blank for what we are calling the input in intInput() method.
        String id="width";
          //get the width as a valid int
        int width =intInput(id);
          //change fill-in id to height
        id="height";
          //get the width as a valid int
        int height=intInput(id);
          //initialize an array as a random matrix using height and width in the method
        int[][] array=randomMatrix(width, height);
          //print array
        printArray(array);
          //print dividing line
        System.out.println("\n------------------------------------------------\n");
          //make a new array of the previous array transposed
        int[][] transposed=transposeMatrix(array, height, width);
          //print transposed
        printArray(transposed);
    }
      //INPUT METHOD
    public static int intInput(String id){
          //initialize scanner
        Scanner myScanner=new Scanner(System.in);
          //initialize input
        int input=0;
          //check if the input is allowed (starts off as not allowed to enter loop)
        boolean allowed=false;
          //while not allowed (true for the first instance)
        while(!allowed){
              //ask for an integer (use id string for added custimization)
            System.out.print("Enter a " +id+" for the array: ");
              //if an int is entered
            if(myScanner.hasNextInt()){
                  //assign it to input
                input=myScanner.nextInt();
                  //switch the boolean to not go back in the while loop
                allowed= true;
                  //check if it is positive
                if(input<0){
                      //if not, print an error
                    System.out.println("Failed to enter positive int. Try again.");
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
          //return the int
        return input;

    }
      //MAKE RANDOM MATRIX
    public static int[][] randomMatrix(int width, int height){
          //initialize the array
        int[][] array= new int[height][width];
          //for all of the rows
        for (int i=0; i<array.length;i++){
              //and all of the collumns
            for (int j=0; j<array[i].length;j++){
                  //create a random int in [-10,10]
                int random = (int) ((Math.random()*21)-10);
                  //assign it to the array
                array[i][j]=random;
            }
        }
          //return the array
        return array;
    }
    
      //PRINT MATRIX
    public static void printArray(int[][] array){
          //initialize scanner
        Scanner myScanner=new Scanner(System.in);
          //initialize string as blank
        String decision="";
          //initialize the current array length
        int current=0;
          //check if print is still desired , initialize boolean
        boolean Print = true;
          //for all of the rows
        for (int i=0; i<array.length;i++){
              //and for all of the collumns
            for (int j=0; j<array[i].length;j++){
                  //make the current length equal to the ammount of components in each collumn
                current=array[i].length;
                  //check this with the first collumn
                if(current != array[0].length){
                      //if at any time it isnt the same as the first, it is ragged.
                      //print warning and ask if continue.
                    System.out.print("Warning: ragged array.  Continue? (Y/N): ");
                      //take the input (Y/N)?
                    decision=myScanner.next();
                      //if it is Y,
                    if (decision == "Y" || decision == "y"){
                          //give final warning an print it anyway
                        System.out.println("Evaluating Ragged Array as Rectangular.");
                          //break the check
                        break;
                    }
                      //otherwise
                    else{
                          //say it is ragged
                        System.out.print("Ragged Array.");
                          //change to true
                        Print=false;
                          //break the check
                        break;
                    }
                 }
            }
        }
          //only print if not ragged
        if (Print==true){
            //for all of the rows
          for (int i=0; i<array.length;i++, System.out.print("\n")){
                //and the collumns
              for (int j=0; j<array[i].length;j++){
                    //print the array
                  System.out.print(array[i][j]+"\t");
              }
          }
        }
    }
      //TRANSPOSE MATRIX
    public static int [][] transposeMatrix(int[][] TwoDarray1, int height, int width){
          //get total elements in the 2D array
        int product=height*width;
          //make a 1D array with that many elements
        int[] OneDarray=new int[product];
          //initialize a k value
        int k=0;
              //for all rows
        for (int i=0; i<TwoDarray1.length;i++){
              //and collumns in the 2D array | k++ changes the element in the 1D array each time
            for (int j=0; j<TwoDarray1[i].length;j++,k++){
                  //assign the 2D array element to the 1D array element
                  //left to right, top to bottom
                OneDarray[k]=TwoDarray1[i][j];
            }
        }
          //make a new 2D array called transposed with width and height switched
        int transposed[][] = new int[width][height];
              //for each collumn
            for(int i=0; i<width;i++){
                  //and each row
                for(int j=0;j<height;j++){
                      //assign the elements from the 1D array to the new (2D) transposed array
                      //from top to bottom, left to right
                    transposed[i][j] = OneDarray[(j*width) + i];
                }
            }
          //return the transposed array
        return transposed;
    }

}