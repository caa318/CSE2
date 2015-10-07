/*
Chris Alexander
CSE2 HW06
CheckDigit

first compile the Java Program
      javac CheckDigit.java
then run the program
      java CheckDigit
*/


import java.util.Scanner; 

    //define a class
    public class CheckDigit{

        //add main method
        public static void main(String[] args){
                //initialize scanner
            Scanner myScanner = new Scanner( System.in );
                //ask for 10-digit ISBN
            System.out.print("Enter the 10-digit ISBN number: ");
            String ISBN = myScanner.next();
                //Make sure ISBN is a valid length
            while(ISBN.length()!=10){
                System.out.print("Invalid Input.  Try Again: ");
                ISBN= myScanner.next();
            }
            
                //initialize variables
            char a='+';
            int aInt=0;
            int checkLast=0;
            int val=10;
            int sum=0;
                //use a for loop to calculate the sum of the first 9 products
            for (int i=0;i<9;i++){
                    //find the char value at each of the spots (0-9)
                a = (ISBN.charAt(i));
                    //convert that char value to an integer
                aInt= Character.getNumericValue(a);
                    //multiply it by the weight given to that number slot
                    //use sum as a counter to count all 9
                sum+=(val*aInt);
                    //decrease val by one so that the weight changes
                val--;
            }
            //now, just calculate the last individually because it is not counted in the sum
            a=ISBN.charAt(9);
                //if the last digit is X, we wanna change that to a 10
                //else, leave it as what it is
            if (a=='X'){
                checkLast=10;
            }
            else{
                checkLast=Character.getNumericValue(a);
            }
                //figure out what the check digit should be equal to given sum mod 11
            int checkVal=(sum%11);
                //now, compare the two values
                //if equal, print valid
            if(checkVal==checkLast){
                System.out.println("This is a VALID ISBN!");
            }
                //else, print what should be there
            else{
                    //special case to make it print X instead of 10
                if(checkVal==10){
                    System.out.println("This is NOT a valid ISBN! Check Digit should be X");
                }
                else{
                    System.out.println("This is NOT a valid ISBN! Check Digit should be "+ (checkVal));
                }
            }
        }
    }
                        /*
                        
                    case 01:
                        a = (ISBN.charAt(i));
                        two=Character.getNumericValue(a);
                        sum+=(val*two);
                        System.out.println(sum);
                        val--;
                        break;
                    case 02:
                        a = (ISBN.charAt(i));
                        three=Character.getNumericValue(a);
                        sum+=(val*three);
                        System.out.println(sum);
                        val--;
                        break;
                    case 03:
                        a = (ISBN.charAt(i));
                        four=Character.getNumericValue(a);
                        sum+=(val*four);
                        System.out.println(sum);
                        val--;
                        break;
                    case 04:
                        a = (ISBN.charAt(i));
                        five=Character.getNumericValue(a);
                        sum+=(val*five);
                        System.out.println(sum);
                        val--;
                        break;
                    case 05:
                        a = (ISBN.charAt(i));
                        six=Character.getNumericValue(a);
                        sum+=(val*six);
                        System.out.println(sum);
                        val--;
                        break;
                    case 06:
                        a = (ISBN.charAt(i));
                        seven=Character.getNumericValue(a);
                        sum+=(val*seven);
                        System.out.println(sum);
                        val--;
                        break;
                    case 07:
                        a = (ISBN.charAt(i));
                        eight=Character.getNumericValue(a);
                        sum+=(val*eight);
                        val--;
                        break;
                    case 8:
                        a = (ISBN.charAt(i));
                        nine=Character.getNumericValue(a);
                        sum+=(val*nine);
                        val--;
                        break;
                    case 9:
                        a = (ISBN.charAt(i));
                        if (a=='X'){
                            ten=10;
                        }
                        else{
                            ten=Character.getNumericValue(a);
                        }
                        break;
                        }
                        }
                        
                        */
                        
/*
                System.out.println(sum);
                System.out.println(ten);
                int checkVal=(sum%11);
                System.out.println(checkVal);
                if(checkVal==ten){
                    System.out.println("This is a VALID ISBN!");
                }
                else{
                    if(checkVal==10){
                        System.out.println("This is NOT a valid ISBN! Check Digit should be X");
                    }
                    else{
                        System.out.println("This is NOT a valid ISBN! Check Digit should be "+ (checkVal));
                    }
                }
                */
    
    
    /*
            }
            char X=0;
            if (ISBN.charAt(9)==X){
            }
            int i = Integer.parseInt(ISBN);
            int premod=1000000000;
            int product=0;
            int number=0;
            int sum=0;
            for (int digit=10;digit>1;digit--){
                number=((i)/premod)%10;
                product=number*digit;
                System.out.println(digit+ " * " +number+ " = " +product);

                sum=sum+product;
                System.out.println(digit+ " " +sum);
                premod/=10;
            }
            if(sum%11==i%10){
                System.out.println("This is a VALID ISBN!");
            }
            else{
                System.out.println("This is NOT a valid ISBN! Check Digit should be "+ (sum%11));

            }
            */