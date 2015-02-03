// Alyssa Gallagher
// Arithmetic Calculations Java Program
// Due Febuary 2, 2014
// Task: to compute the cost of items bought plus PA sales tax

//first complile the program
//      javac Arithmetic.java
// run the program
//      java Arithmetic//

//define a class
public class Arithmetic{
    
//add a main method
public static void main(String[] args){
    // Numbe of pairs of socks
    int nSocks=3;
    //Cost per pair of socks
    // ('$' is part of the variable name)
    double socksCost$=2.58;
    // cost of socks
    double totalSockCost$= nSocks*socksCost$; 
    // Tax on socks with decimal edits
    double taxPercent=0.06;
    double taxofSockCost$= (int)((totalSockCost$*taxPercent)*100);
    double finalTaxofSockCost$= taxofSockCost$/100;
    //Cost of Socks with tax
    double totalSockCostwithTax$= totalSockCost$ + finalTaxofSockCost$;
    
    //Number of drinking glasses
    int nGlasses=6;
    //Cost per glasse
    double glassCost$=2.29;
    //cost of glasses
    double totalGlassCost$= nGlasses*glassCost$;
    // tax on glasses with decimal edits
    double taxofGlassCost$= (int)((taxPercent* totalGlassCost$)*100);
    double finalTaxofGlassCost$= taxofGlassCost$/100;
    // Cost of glasses with tax
    double totalGlassCostwithTax$= totalGlassCost$ +finalTaxofGlassCost$;

    //Numbber of boxes of envelopes
    int nEnvelopes=1;
    //cost per box of envelopes
    double envelopeCost$=3.25;
    // cost of envelopes 
    double totalEnvelopeCost$= nEnvelopes*envelopeCost$;
    // tax on envelopes with decimal edits
    double taxofEnvelopeCost$= (int)((taxPercent* totalEnvelopeCost$)*100);
    double finalTaxofEnvelopeCost$= taxofEnvelopeCost$/100;
    //Cost of Envelopes with tax 
    double totalEvelopeCostwithTax$= finalTaxofEnvelopeCost$ + totalEnvelopeCost$;
    
    //Transaction total in order to edit decimals
    double transactionTotal$= (int)((totalEvelopeCostwithTax$+ totalGlassCostwithTax$ +totalSockCostwithTax$)*100);
    double finaltransactionTotal$= transactionTotal$/100;
    
// Total cost of each item, followed by the sales tax for that cost
System.out.println("Total Cost of Socks " + totalSockCost$);
System.out.println("Sales Tax for Socks " + finalTaxofSockCost$);
System.out.println("Total Cost of Glasses " + totalGlassCost$);
System.out.println("Sales Tax for Glasses " + finalTaxofGlassCost$);
System.out.println("Total Cost of Envelopes " + totalEnvelopeCost$);
System.out.println("Sales Tax for Envelopes " + finalTaxofEnvelopeCost$);
// Total cost of purchases (before tax)
System.out.println("Purchase Total (before tax) " + (totalGlassCost$ + totalSockCost$ + totalEnvelopeCost$));
//Total cost of tax 
System.out.println("Tax Total " + (finalTaxofSockCost$ + finalTaxofGlassCost$ +finalTaxofEnvelopeCost$));
// Total actually paid for this transaction (including sales tax)
System.out.println("Transaction total " + finaltransactionTotal$);

    }
}