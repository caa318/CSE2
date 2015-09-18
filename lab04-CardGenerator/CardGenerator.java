//
//Chris Alexander
//CSE2 Lab03
//CardGenerator
//
//first compile the Java Program
//      javac CardGenerator.java
//then run the program
//      java CardGenerator//

import java.util.Scanner; 

//define a class
public class CardGenerator{

//add main method
  public static void main(String[] args){
      int cardNumber =(int) ((Math.random()*52)+1);
      int subtractor=0;
      String cardType = "suit";
      if (cardNumber>0 && cardNumber<=13){
          cardType= "Diamonds";
          subtractor = 0;
      }
      else if (cardNumber>13 && cardNumber<=26){
          cardType= "Clubs";
          subtractor = 13;
      }
      else if (cardNumber>26 && cardNumber<=39){
          cardType= "Hearts";
          subtractor = 26;
      }
      else if(cardNumber>39){
          cardType= "Spades";
          subtractor = 39;
      }
      int realNumber=cardNumber-subtractor;
      String cardFace = "none";
      switch (realNumber){
          case 1:
              cardFace="Ace";
          break;
          case 2:
              cardFace = "2";
          break;
          case 3:
              cardFace = "3";
          break;
          case 4:
              cardFace = "4";
          break;
          case 5:
              cardFace = "5";
          break;
          case 6:
              cardFace = "6";
          break;
          case 7:
              cardFace = "7";
          break;
          case 8:
              cardFace = "8";
          break;
          case 9:
              cardFace = "9";
          break;
          case 10:
              cardFace = "10";
          break;
          case 11:
              cardFace = "Jack";
          break;
          case 12:
              cardFace = "Queen";
          break;
          case 13:
              cardFace = "King";
      }
      System.out.println("You picked the " + cardFace + " of " + cardType);
      System.out.println("To check, the actual value was " + cardNumber);
      
  }
}