/*
Chris Alexander
CSE2 Lab06
GettingLoopy

first compile the Java Program
      javac GettingLoopy.java
then run the program
      java GettingLoopy
      */
      
import java.util.Scanner; 

//define a class
public class GettingLoopy{

//add main method
  public static void main(String[] args){      
    int counter=1;
    System.out.println("Step 1:");
    while (counter<7){
        System.out.print(counter);
        counter++;}
    while (counter>=7 && counter<15){
        System.out.print(7);
        counter++; 
    }
    System.out.print("\n");
    
    //STEP 2
    //WHILE LOOP
    counter=10;
    System.out.println("Step 2:");
    System.out.print("While loop: \t");
    while (counter>=10 && counter<=100){
            if (counter%2 !=0 && counter%3 !=0 && counter%5!=0 && counter%7!=0)
                System.out.print(counter+" ");
            counter++;
    }
    System.out.print("\n");
    
    //FOR LOOP
    counter=10;
    System.out.print("For loop: \t");
    for (counter = 10; counter<=100; counter++){
            if (counter%2 !=0 && counter%3 !=0 && counter%5!=0 && counter%7!=0)
                System.out.print(counter+" ");
    }
    System.out.print("\n");
    
    //DO WHILE LOOP
    counter=10;
    System.out.print("Do While loop: \t");
    do {
        if (counter%2 !=0 && counter%3 !=0 && counter%5!=0 && counter%7!=0)
            System.out.print(counter+" ");
        counter++;
    }
    while (counter>=10 && counter<=100);
    System.out.print("\n");
    
    
    //STEP 3
    int smileyfaces =(int)(Math.random()*196) + 5;
    counter=1;
    System.out.println("The number of hashtags should be " + smileyfaces);
    while (counter<=smileyfaces && counter<=20){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=40){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=60){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=80){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=100){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=120){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=140){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=160){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=180){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    while (counter<=smileyfaces && counter<=200){
        System.out.print("# ");
        counter++;
    }
    System.out.print("\n");
    
    
    
    
  /*  
    while (smileyfaces<=20){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>20 && smileyfaces<=40){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>40 && smileyfaces<=60){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>60 && smileyfaces<=80){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>80 && smileyfaces<=100){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
        while (smileyfaces>100 && smileyfaces<=120){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>120 && smileyfaces<=140){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>140 && smileyfaces<=160){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>160 && smileyfaces<=180){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    while (smileyfaces>180 && smileyfaces<=200){
        System.out.print("# ");
        smileyfaces--;
    }
    System.out.print("\n");
    */
    
  }
}