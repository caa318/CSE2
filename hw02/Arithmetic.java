//
//Chris Alexander
//CSE2 HW2
//Arithmetic
//
//first compile the Java Program
//      javac Arithmetic.java
//then run the program
//      java Arithmetic

//define a class
public class Arithmetic{

//add main method
  public static void main(String[] args){
      
    //Imput Variables:
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        double sockCost=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost=3.25;
        double taxPercent=0.06;
        
    //Calculate the pre-tax cost of each item
        //total cost=units*cost/unit
        double totalSockCost=nSocks*sockCost;
        double totalGlassCost=nGlasses*glassCost;
        double totalEnvelopeCost=nEnvelopes*envelopeCost;
    //Calculate the tax of each item
        //total tax= cost * tax rate
        double totalSockTax=totalSockCost*taxPercent;
        double totalGlassTax=totalGlassCost*taxPercent;
        double totalEnvelopeTax=totalEnvelopeCost*taxPercent;
    //Calculate the subtotal of all of the items
        //sum the costs
        double totalSubtotal=totalEnvelopeCost+totalGlassCost+totalSockCost;
    //Calculate the total tax
        //sum the taxes
        double totalTax=totalEnvelopeTax+totalGlassTax+totalSockTax;
    //Calculate the total of everything
        //sum the costs and taxes
        double totalTotal=totalTax+totalSubtotal;
    
    //Convert all of the calculations to dollar compatible numbers
        //Do this by multiplying the double by 100, explicitly convert
        //to int and then divide by 100.0 making it into a double with
        //2 decimals
    //The $ represents a variable as dollar compatible
        //Start with the pre-tax cost of each item
        double totalSockCost$=(((int)(totalSockCost*100))/100.0);
        double totalGlassCost$=(((int)(totalGlassCost*100))/100.0);
        double totalEnvelopeCost$=(((int)(totalEnvelopeCost*100))/100.0);
        //Now with the tax of each item
        double totalSockTax$=(((int)(totalSockTax*100))/100.0);
        double totalGlassTax$=(((int)(totalGlassTax*100))/100.0);
        double totalEnvelopeTax$=(((int)(totalEnvelopeTax*100))/100.0);
        //Finally, the subtotal, tax and total of all the goods
        double totalSubtotal$=(((int)(totalSubtotal*100))/100.0);
        double totalTax$=(((int)(totalTax*100))/100.0);
        double totalTotal$=(((int)(totalTotal*100))/100.0);
    


  //Print out the outputs 
    //start with listing the inputs
    System.out.println(nSocks + " socks at $" + sockCost + " per unit");
    System.out.println(nGlasses + " glasses at $" + glassCost + " per unit");
    System.out.println(nEnvelopes + " envelope at $" + envelopeCost + " per unit");
    //then list the costs and taxes of each item individually
    System.out.println("Socks subtotal: \t$" + totalSockCost$ + " \t socks tax: \t$"+ totalSockTax$);
    System.out.println("Glasses subtotal: \t$" + totalGlassCost$ + " \t glasses tax: \t$" + totalGlassTax$);
    System.out.println("Envelope subtotal: \t$" + totalEnvelopeCost$ + " \t envelope tax: \t$" + totalEnvelopeTax$);
    //then the subtotal, tax, and total.
    System.out.println("Subtotal: \t\t$" + totalSubtotal$);
    System.out.println("Tax: \t\t\t$" + totalTax$);
    System.out.println("Total: \t\t\t$" + totalTotal$);

  }
}