/*
Chris Alexander
CSE2 HW06
BarGraph

first compile the Java Program
      javac BarGraph.java
then run the program
      java BarGraph
*/


import java.util.Scanner; 

    //define a class
    public class BarGraph{

        //add main method
        public static void main(String[] args){
                //initialize scanner
            Scanner myScanner = new Scanner( System.in );
                //initialize variables
            double expense = 0.0;
            double Monday = 0.0;
            double Tuesday = 0.0;
            double Wednesday = 0.0;
            double Thursday = 0.0;
            double Friday = 0.0;
            double Saturday = 0.0;
            double Sunday = 0.0;
            int day = 0;
                //create a for loop to take the values for each day
            for (day=1;day<=7;day++){
                    //use switch to go to appropriate day
                switch (day){
                    case 1:
                            //ask for expenses
                        System.out.print("Expenses for Monday: ");
                            //make sure you are given a number
                        while(!myScanner.hasNextDouble()){
                            System.out.print("That's not even a number. Try again: ");
                            myScanner.next();
                        }
                            //set expense as the imput variable
                        expense = myScanner.nextDouble();
                            //set the imput variable to monday
                            //must have expense as middle for the rest of code to work
                        Monday = expense;
                        break;
                        //continue for cases 2-7
                    case 2:
                        System.out.print("Expenses for Tuesday: ");
                        while(!myScanner.hasNextDouble()){
                            System.out.print("That's not even a number. Try again: ");
                            myScanner.next();
                        }
                        expense = myScanner.nextDouble();
                        Tuesday = expense;
                        break;
                    case 3:
                        System.out.print("Expenses for Wednesday: ");
                        while(!myScanner.hasNextDouble()){
                            System.out.print("That's not even a number. Try again: ");
                            myScanner.next();
                        }
                        expense = myScanner.nextDouble();
                        Wednesday = expense;
                        break;
                    case 4:
                        System.out.print("Expenses for Thursday: ");
                        while(!myScanner.hasNextDouble()){
                            System.out.print("That's not even a number. Try again: ");
                            myScanner.next();
                        }
                        expense = myScanner.nextDouble();
                        Thursday = expense;
                        break;                    
                    case 5:
                        System.out.print("Expenses for Friday: ");
                        while(!myScanner.hasNextDouble()){
                            System.out.print("That's not even a number. Try again: ");
                            myScanner.next();
                        }
                        expense = myScanner.nextDouble();
                        Friday = expense;
                        break;
                    case 6:
                        System.out.print("Expenses for Saturday: ");
                        while(!myScanner.hasNextDouble()){
                            System.out.print("That's not even a number. Try again: ");
                            myScanner.next();
                        }
                        expense = myScanner.nextDouble();
                        Saturday = expense;
                        break;                        
                    case 7:
                        System.out.print("Expenses for Sunday: ");
                        while(!myScanner.hasNextDouble()){
                            System.out.print("That's not even a number. Try again: ");
                            myScanner.next();
                        }
                        expense = myScanner.nextDouble();
                        Sunday = expense;
                        break;
                }
                    //check each input to make sure that it is indeed a positive number
                if (expense < 0.0){
                        //if it isn't, print try again.
                    System.out.println("That's a negative number. Try again. ");
                        //set back the day to allow the code to run through for that day oncemore
                    day--;
                }
            }
                
                //initialize more variables
            double value=0.0;
            double sum=0.0;
                //use for loop to keep track of days 1-7
            for (day=1;day<=7;day++){
                    //switch to the appropriate day
                switch (day){
                    case 1:
                            //print the header
                        System.out.print("Mon: \t");
                            //figure out how many stars to print for each line
                        value=Monday;
                            //count all of the values into a sum for later.
                        sum+=value;
                        break;
                    //continue for 2-7
                    case 2:
                        System.out.print("Tues: \t");
                        value=Tuesday;
                        sum+=value;
                        break;
                    case 3:
                        System.out.print("Wed: \t");
                        value=Wednesday;
                        sum+=value;
                        break;
                    case 4:
                        System.out.print("Thu: \t");
                        value=Thursday;
                        sum+=value;
                        break;                    
                    case 5:
                        System.out.print("Fri: \t");
                        value=Friday;
                        sum+=value;
                        break;
                    case 6:
                        System.out.print("Sat: \t");
                        value=Saturday;
                        sum+=value;
                        break;                        
                    case 7:
                        System.out.print("Sun: \t");
                        value=Sunday;
                        sum+=value;
                        break;
                }
                    //use a for loop to print the stars
                    //dollar starts at .5 because anything from .50 to 1.49 should round to 1
                for (double dollar=.5;dollar<=value;dollar++){
                    System.out.print("*");
                }
                    //print a new line for each graph line
                System.out.print("\n");
            }
            //average=sum/7
        double average= ((sum)/7);
            //print weekly average as a formated number
        System.out.format("Your average weekly expenses are: %4.2f%n",average);
            //sum of all 208 weeks is the first week + the rest of the 208 weeks
            //start with sum equal to average
        double sum208=average;
            //because week 1 is the average and already included,
            //run a for loop from 2 to 208
        for (int week=2;week<=208;week++){
                //calculate a random number between -20 and 20
            double fluxCoef = (Math.random()*41)-20.0;
                //divide it by 100 and add that to 1 to get a number from .08 to 1.2
            double flux = 1+(fluxCoef/100.0);
                //multiply this value by the average to get a possible valuse for next week
            double nextWeek= average*flux;
                //add this value to the sum
            sum208+=nextWeek;
                //repeat
        }
            //print the sum as a formated number
        System.out.format("Estimated expenditure for 4 years: %4.2f%n",sum208);
        }
    }