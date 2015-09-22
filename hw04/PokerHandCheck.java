//
//Chris Alexander
//CSE2 HW04
//PokerHandCheck
//
//first compile the Java Program
//      javac PokerHandCheck.java
//then run the program
//      java PokerHandCheck//

import java.util.Scanner; 

//define a class
public class PokerHandCheck{

//add main method
  public static void main(String[] args){
      
      //create a variable with all of the random integer values from 1-52.
      int cardNumber1=(int) ((Math.random()*52)+1);
      int cardNumber2=(int) ((Math.random()*52)+1);
      int cardNumber3=(int) ((Math.random()*52)+1);
      int cardNumber4=(int) ((Math.random()*52)+1);
      int cardNumber5=(int) ((Math.random()*52)+1);
      //create a string listing the suit type to be used later.
      String card1Type = "suit";
      String card2Type = "suit";
      String card3Type = "suit";
      String card4Type = "suit";
      String card5Type = "suit";
//Use parts of Lab 04 to turn the 1-52 integer into a card value for all 5 cards.


//CARD #1
    //convert numbers 1-13 into diamonds.
      if (cardNumber1>0 && cardNumber1<=13){
          card1Type= "Diamonds";
      }
    //convert numbers 14-26 into clubs.
      else if (cardNumber1>13 && cardNumber1<=26){
          card1Type= "Clubs";
      }
    //convert numbers 27-39 into hearts.
      else if (cardNumber1>26 && cardNumber1<=39){
          card1Type= "Hearts";
      }
    //convert numbers 40-52 into spades.
      else if(cardNumber1>39){
          card1Type= "Spades";
      }
    //take the modulo 13 of the rand int to get the real card number.
      int realNumber1=cardNumber1 % 13;
    //initialize a card face name
      String card1Face = "none";
    //use switch to name the card faces for the 1-13 card numbers
      switch (realNumber1){
          case 1:
              card1Face="Ace";
          break;
          case 2:
              card1Face = "2";
          break;
          case 3:
              card1Face = "3";
          break;
          case 4:
              card1Face = "4";
          break;
          case 5:
              card1Face = "5";
          break;
          case 6:
              card1Face = "6";
          break;
          case 7:
              card1Face = "7";
          break;
          case 8:
              card1Face = "8";
          break;
          case 9:
              card1Face = "9";
          break;
          case 10:
              card1Face = "10";
          break;
          case 11:
              card1Face = "Jack";
          break;
          case 12:
              card1Face = "Queen";
          break;
          default:
              card1Face = "King";
              break;
      }
      
    //Repeat for cards 2-5
    
    
//CARD #2

      if (cardNumber2>0 && cardNumber2<=13){
          card2Type= "Diamonds";
      }
      else if (cardNumber2>13 && cardNumber2<=26){
          card2Type= "Clubs";
      }
      else if (cardNumber2>26 && cardNumber2<=39){
          card2Type= "Hearts";
      }
      else if(cardNumber2>39){
          card2Type= "Spades";
      }
      int realNumber2=cardNumber2 %13;
      String card2Face = "none";
      switch (realNumber2){
          case 1:
              card2Face="Ace";
          break;
          case 2:
              card2Face = "2";
          break;
          case 3:
              card2Face = "3";
          break;
          case 4:
              card2Face = "4";
          break;
          case 5:
              card2Face = "5";
          break;
          case 6:
              card2Face = "6";
          break;
          case 7:
              card2Face = "7";
          break;
          case 8:
              card2Face = "8";
          break;
          case 9:
              card2Face = "9";
          break;
          case 10:
              card2Face = "10";
          break;
          case 11:
              card2Face = "Jack";
          break;
          case 12:
              card2Face = "Queen";
          break;
          default:
              card2Face = "King";
              break;
      }
      
      
//CARD #3

      if (cardNumber3>0 && cardNumber3<=13){
          card3Type= "Diamonds";
      }
      else if (cardNumber3>13 && cardNumber3<=26){
          card3Type= "Clubs";
      }
      else if (cardNumber3>26 && cardNumber3<=39){
          card3Type= "Hearts";
      }
      else if(cardNumber3>39){
          card3Type= "Spades";
      }
      int realNumber3=cardNumber3%13;
      String card3Face = "none";
      switch (realNumber3){
          case 1:
              card3Face="Ace";
          break;
          case 2:
              card3Face = "2";
          break;
          case 3:
              card3Face = "3";
          break;
          case 4:
              card3Face = "4";
          break;
          case 5:
              card3Face = "5";
          break;
          case 6:
              card3Face = "6";
          break;
          case 7:
              card3Face = "7";
          break;
          case 8:
              card3Face = "8";
          break;
          case 9:
              card3Face = "9";
          break;
          case 10:
              card3Face = "10";
          break;
          case 11:
              card3Face = "Jack";
          break;
          case 12:
              card3Face = "Queen";
          break;
          default:
              card3Face = "King";
              break;
      }
      
      
//CARD #4

      if (cardNumber4>0 && cardNumber4<=13){
          card4Type= "Diamonds";
      }
      else if (cardNumber4>13 && cardNumber4<=26){
          card4Type= "Clubs";
      }
      else if (cardNumber4>26 && cardNumber4<=39){
          card4Type= "Hearts";
      }
      else if(cardNumber4>39){
          card4Type= "Spades";
      }
      int realNumber4=cardNumber4%13;
      String card4Face = "none";
      switch (realNumber4){
          case 1:
              card4Face="Ace";
          break;
          case 2:
              card4Face = "2";
          break;
          case 3:
              card4Face = "3";
          break;
          case 4:
              card4Face = "4";
          break;
          case 5:
              card4Face = "5";
          break;
          case 6:
              card4Face = "6";
          break;
          case 7:
              card4Face = "7";
          break;
          case 8:
              card4Face = "8";
          break;
          case 9:
              card4Face = "9";
          break;
          case 10:
              card4Face = "10";
          break;
          case 11:
              card4Face = "Jack";
          break;
          case 12:
              card4Face = "Queen";
          break;
          default:
              card4Face = "King";
              break;
      }
      
      
//CARD #5

      if (cardNumber5>0 && cardNumber5<=13){
          card5Type= "Diamonds";
      }
      else if (cardNumber5>13 && cardNumber5<=26){
          card5Type= "Clubs";
      }
      else if (cardNumber5>26 && cardNumber5<=39){
          card5Type= "Hearts";
      }
      else if(cardNumber5>39){
          card5Type= "Spades";
      }
      int realNumber5=cardNumber5&13;
      String card5Face = "none";
      switch (realNumber5){
          case 1:
              card5Face="Ace";
          break;
          case 2:
              card5Face = "2";
          break;
          case 3:
              card5Face = "3";
          break;
          case 4:
              card5Face = "4";
          break;
          case 5:
              card5Face = "5";
          break;
          case 6:
              card5Face = "6";
          break;
          case 7:
              card5Face = "7";
          break;
          case 8:
              card5Face = "8";
          break;
          case 9:
              card5Face = "9";
          break;
          case 10:
              card5Face = "10";
          break;
          case 11:
              card5Face = "Jack";
          break;
          case 12:
              card5Face = "Queen";
          break;
          default:
              card5Face = "King";
          break;
      }
      
      //Print out all 5 card combinations in the form of faces and suits.
      
      System.out.println("You picked the " + card1Face + " of " + card1Type);
      System.out.println("You picked the " + card2Face + " of " + card2Type);
      System.out.println("You picked the " + card3Face + " of " + card3Type);
      System.out.println("You picked the " + card4Face + " of " + card4Type);
      System.out.println("You picked the " + card5Face + " of " + card5Type);
      
      //initialize the pair counter
      //if any two cards match up as pairs in 1-13, the pair counter will +1.
      int pair=0;
      
      //do this for all 10 pair combinations
      if (realNumber1==realNumber2){
          pair=pair+1;
      }
      if (realNumber1==realNumber3){
          pair=pair+1;
      }
      if (realNumber1==realNumber4){
          pair=pair+1;
      }
      if (realNumber1==realNumber5){
          pair=pair+1;
      }
      if (realNumber2==realNumber3){
          pair=pair+1;
      }
      if (realNumber2==realNumber4){
          pair=pair+1;
      }
      if (realNumber2==realNumber5){
          pair=pair+1;
      }
      if (realNumber3==realNumber4){
          pair=pair+1;
      }
      if (realNumber3==realNumber5){
          pair=pair+1;
      }
      if (realNumber4==realNumber5){
          pair=pair+1;
      }
      
      
      //if the pair counter is still zero, there are no pairs.
      if (pair ==0){
          System.out.println("You have a high card hand!");
      }
      //if the pair counter is one, you have a pair.
      if (pair ==1){
          System.out.println("You have one pair!");
      }
      //if the pair counter is two, you have two pairs.
      if (pair ==2){
          System.out.println("You have two pair!");
      }
      //if the pair counter is 3, you have a 3 of a kind (AB,AC,BC)
      if (pair ==3){
          System.out.println("You have three of a kind!");
      }
      //If it is greater than 3, you have a better hand.
      //4 pair for full house, 6 pair for 4 of a kind.
      if (pair >3){
          System.out.println("You have a hand that is better than a three of a kind, two pair or one pair!");
      }
  }
}