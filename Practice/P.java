public class Shuffling{
  public static void main(String[] args) {
	//suits club, heart, spade or diamond
    String[] suitNames={"C","H","S","D"};   
    String[] rankNames={"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q","K","A"};
    String[] cards = new String[52];
    String[] hand = new String[5];
    for (int i=0; i<52; i++){
        cards[i]=rankNames[i%13]+suitNames[i/13];
        System.out.print(cards[i]+" ");
    }
    
    //printArray(cards);
    shuffle(cards);
    for (int i=0; i<52; i++){
        cards[index]=rankNames[index%13]+suitNames[index/13];
        System.out.print(cards[index]+" ");
    }
    //printArray(cards, );
    //hand = randomizeHand(cards);
    //printArray(hand);
  }
  
  /*
  public static void printArray(int x,String[] cards, String[] suitNames, String[] rankNames,){
      cards[x]=rankNames[x%13]+suitNames[x/13];
      System.out.print(cards[x]+" ");
  }
  */
  
  public static void shuffle(String[] cards){
      for (int i =0; i<52;i++){
          int index = (int)((Math.random()*52)+1);
          String temporary = cards[index];
          cards [index]=cards[1];
          cards[1] = temporary;
      }
      System.out.print("Shuffled cards: ");
  }
  
  /*
  public static void randomizeHand(){
      for (int i=0; i<5; i++){
          int rand = (int)((Math.random()*52)+1);
          printArray(rand);
      }
  }
 */
}