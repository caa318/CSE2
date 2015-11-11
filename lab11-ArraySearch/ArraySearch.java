/*
Chris Alexander
CSE2 Lab11
ArraySearch

first compile the Java Program
      javac ArraySearch.java
then run the program
      java ArraySearch
      */
      
import java.util.Scanner; 

//define a class
public class ArraySearch{

//add main method
  public static void main(String[] args){ 
    Scanner myScanner = new Scanner(System.in);
    int[] array1= new int[5000];
    int[] array2=new int[5000];
    
//ARRAY 1
    int max=0;
    int min=100000;
    int index=0;
    for(int i=0;i<5000;i++){
        index = (int) (Math.random()*100001);
        array1[i]=index;
        if (index>=max){
            max=index;
        }
        if (index<=min){
            min=index;
        }
    }
    System.out.println("The maximum of array1 is: " + max);
    System.out.println("The minimum of array1 is: " + min);
//ARRAY 2    
    int n=0;
    index=0;
    for(int i=0;i<5000;i++){
        index=(int)((Math.random()*(100001-n))+n);
        array2[i]=index;
        n=index;
    }
    System.out.println("The maximum of array2 is: " + array2[4999]);
    System.out.println("The minimum of array2 is: " + array2[0]);
    
    //
    //
    //
    boolean run=true;
    while(run){
    System.out.print("Enter a number greater than or equal to zero: " );
    int input=0;
    boolean integer=false;
    while(myScanner.hasNextInt()){
        input=myScanner.nextInt();
        integer=true;
        break;
    }
    if(!integer){
        String string=myScanner.next();
        run=false;
        break;
        
    }
    
    int checkfor = input;
    int low=0;
    int high = array2.length-1;
    int count=0;
    int middle=0;
    boolean found=false;
    System.out.println("Got to 76");
    while (low<high){
        middle=((low+(high-low))/2);
        if (checkfor>array2[middle]){
            low=middle+1;
            System.out.println("low");
        }
        else if (checkfor<array2[middle]){
            high=middle-1;
            System.out.println("high");

        }
        else{
            found=true;
            break;
        }
        count++;
    }
    System.out.println("Got to 91");

    if(found){
        System.out.println("The number was found");
    }
    if(!found){
        System.out.println("The number was not found");
        System.out.println("middle+1: " + (middle+1));
        System.out.println("middle: " + (middle));
        System.out.println("middle-1 : " + (middle-1));
        String ablow="";
        if (array2[middle]<checkfor){
            ablow="below";
            System.out.println("The number above was "+ array2[middle+1]);
        }
        System.out.println("The number"+ ablow + "was "+ array2[middle]);
        if (array2[middle]>checkfor){
            ablow="above";
            System.out.println("The number below was "+ array2[middle-1]);
        }
    }
    
    run=false;
    }
  }
}
    