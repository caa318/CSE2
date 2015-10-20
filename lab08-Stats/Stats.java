/*
Chris Alexander
CSE2 Lab08
Stats

first compile the Java Program
      javac Stats.java
then run the program
      java Stats
      */
      
import java.util.Scanner; 

//define a class
public class Stats{

//add main method
  public static void main(String[] args){ 
    Scanner myScanner= new Scanner(System.in);
    int count=0;
    double sum=0;
    System.out.print("Enter the first double: ");
    double first=myScanner.nextDouble();
    sum+=first;
    count+=1;
    System.out.print("Enter the second double: ");
    double second =myScanner.nextDouble();
    while(first>=second){
        System.out.print("Error: Enter a larger double than the previous double: ");
        second=myScanner.nextDouble();
    }
    sum+=second;
    count+=1;
    System.out.print("Enter the third double: ");
    double third=myScanner.nextDouble();
    while(second>=third){
        System.out.print("Error: Enter a larger double than the previous double: ");
        third=myScanner.nextDouble();
    }
    sum+=third;
    count+=1;
    System.out.print("Enter the fourth double: ");
    double fourth=myScanner.nextDouble();
    while(third>=fourth){
        System.out.print("Error: Enter a larger double than the previous double: ");
        fourth=myScanner.nextDouble();
    }
    sum+=fourth;
    count+=1;
    System.out.print("Enter the fifth double: ");
    double fifth=myScanner.nextDouble();
    while(fourth>=fifth){
        System.out.print("Error: Enter a larger double than the previous double: ");
        fifth=myScanner.nextDouble();
    }
    sum+=fifth;
    count+=1;
    
    double mean = meanMethod(sum,count);
    double median = medianMethod(third);
    print(mean, median);
  }
  
  public static double meanMethod(double sum, int count){
      double mean=(sum/count);
      return mean;
  }
  public static double medianMethod(double third){
      double median=(third);
      return median;
  }
  public static void print(double median, double mean){
      System.out.println("Mean: "+mean);
      System.out.println("Median: "+median);
  }
      
}
