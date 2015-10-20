/*
Chris Alexander
CSE2 hw08
Area

first compile the Java Program
      javac Area.java
then run the program
      java Area
      */
      
import java.util.Scanner; 

//define a class
public class Area{

//add main method
    public static void main(String[] args){ 
            //initialize area as a double
        double area=0;
            //use a method to accept the shape
        String shape = shapeInput();
            //use booleans to determine what the shape is
        boolean rectangle = shape.equals("rectangle");
        boolean circle = shape.equals("circle");
        boolean triangle = shape.equals("triangle");
            //if the string says 'rectangle'
        if (rectangle==true){
                //assign the rectangle method to area
            area = rectangleArea();
        }
            //if the string says 'circle'
        else if (circle==true){
                //assign the circle method to area
            area = circleArea();      
        }
            //if the string says 'triangle'
        else if (triangle==true){
                //assign the triangle method to area
            area = triangleArea();
        }
            //run the print method
        print(area, shape);
    }
      
        //method to take the shape
    public static String shapeInput(){  
            //initialize scanner
        Scanner myScanner= new Scanner(System.in);
            //initialize the string
        String shape="shape";
            //create boolean to run a while loop
        boolean allowed = false;
                //while the boolean is false
            while (!allowed){
                    //ask for shape
                System.out.print("Enter a valid shape: ");
                    //assign it to shape
                shape = myScanner.next();
                    //check to see if it is one of 3 valid inputs
                boolean rectangle = shape.equals("rectangle");
                boolean circle = shape.equals("circle");
                boolean triangle = shape.equals("triangle");
                    //if it is,
                if (rectangle==true || circle==true || triangle==true){
                        //print shape
                    System.out.println("The shape entered was a "+shape);
                        //change the boolean to exit loop
                    allowed=true;
                }
                    //if it isn't,
                else {
                        //print error and go back through the loop
                    System.out.println("Error: The shape you entered was invalid.");
                }
            }
            //return the shape
        return shape;
    }
    
        //method to make sure the input is a double
    public static double doubleInput(){
            //initialize scanner
        Scanner myScanner = new Scanner(System.in);
            //initialize allowedDouble as 1 to avoid <= 0 for later
        double allowedDouble=1;
            //create boolean to run while loop
        boolean allowed=false;
            //while boolean is false
        while (!allowed){
                //if next input is a double
            if(myScanner.hasNextDouble()){
                    //assign it to allowedDouble
                allowedDouble=myScanner.nextDouble();
                    //switch boolean
                allowed=true;
            }
                //if it isn't,
            else{
                    //print error
                System.out.print("Error: please type in a positive double. Try again: ");
                    //take value, discard, and try again
                myScanner.next();
            }
                //while it is negative
            while(allowedDouble<=0){
                    //print an error
                System.out.print("Error: please type in a positive double. Try again: ");
                    //take the value again just like above 
                if(myScanner.hasNextDouble()){
                    allowedDouble=myScanner.nextDouble();
                    allowed=true;
                }
                else{
                    myScanner.next();
                }
            }
        }
            // return an allowed double to the respective spot
        return allowedDouble;
    }
        //formula for rectangle's area
    public static double rectangleArea(){
            //ask for base
        System.out.print("Enter the base length: ");
            //get base from method
        double base = doubleInput();
            //ask for height
        System.out.print("Enter the height: ");
            //get height from method
        double height = doubleInput();
            //calculate area
        double area=base*height;
            //return area
        return area;

    }
        //formula for circle's area
    public static double circleArea(){
            //initialize pi
        double pi=3.14159;
            //ask for radius
        System.out.print("Enter the radius length: ");
            //get radius from method
        double radius = doubleInput();
            //calculate area
        double area = pi*radius*radius;
            //return area
        return area;
    }
        //formula for triangles's area
    public static double triangleArea(){
            //ask for base
        System.out.print("Enter the base length: ");
            //get base from method
        double base = doubleInput();
            //ask for height
        System.out.print("Enter the height: ");
            //get height from method
        double height = doubleInput();
            //calculate area
        double area = base*height*.5;
            //return area
        return area;
    }
    public static void print(double area, String shape){
            //print out the area of the shape
        System.out.print("The area of the " + shape + " is ");
        System.out.printf("%6.2f \n", area);
    }
        
        
        
//close class
}