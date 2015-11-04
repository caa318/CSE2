/*
Chris Alexander
CSE2 hw10
Shuffling

first compile the Java Program
      javac Shuffling.java
then run the program
      java Shuffling
      
      */
  //define class
public class Shuffling{
    //set up main method
  public static void main(String[] args) {
        //establish array for suitnames
      String[] suitNames={"C","H","S","D"};   
        //establish array for rank names
      String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
        //sets up array with 52 elements for all of the cards
      String[] cards = new String[52];
        //sets up array with 5 elements for the cards in a hand
      String[] hand = new String[5];
        //assigns each card suit and rank to the element in the cards array
      for (int i=0; i<52; i++){
          cards[i]=rankNames[i%13]+suitNames[i/13];
      }
        //print header     
      System.out.print("\n Deck: ");
        //print the cards array using method
      printArray(cards);
        //shuffle cards using method
      shuffle(cards);
        //print the cards array using method
      printArray(cards);
        //assign a random hand to the array hand
      hand = randomizeHand(cards);
        //print the hand array using method
      printArray(hand);
  }
    //set up method to print the array
  public static void printArray(String[] array){
        //for [0, length of the array)
      for (int i=0 ; i<array.length ; i++){
            //print out the ith element of the array with a space
          System.out.print(array[i]+" ");
      }
  }
    //set up method to shuffle the deck
  public static void shuffle(String[] cards){
        //for 100 times
      for (int i =0 ; i<100 ; i++){
            //get a random number from 0 to 51
          int index = (int)((Math.random()*52));
            //assign the string from the card array of that value to an arbitrary string
          String temporary = cards[index];
            //assign the string in slot zero to the slot in card array of that value
          cards [index]=cards[0];
            //assign the temporary string to the slot zero
          cards[0] = temporary;
      }
        //print out the header befor the print method
      System.out.print("\n Shuffled Cards: ");
  }
    //set up method to get a random hand
  public static String[] randomizeHand(String[] cards){
        //reestablish the hand array in this method
      String[] hand = new String[5];
        //for 5 times
      for (int i =0 ; i<hand.length ; i++){
            //get a random number
          int index = (int)((Math.random()*52));
            //if cards[index] has been taken before
          if (cards[index].equals("Taken")){
                //subtract 1 from i to go through loop again
              i--;
                //continue
              continue;
          }
            //assing that string from cards[index] to the hand array of that i
          hand[i]=cards[index];
            //change the string from cards[index] to some arbitrary "Taken" string.
          cards[index]="Taken";
      }
        //print the header
      System.out.print("\n Randomized Hand: ");
        //return hand
      return hand;
      
  }
  
}