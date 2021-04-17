package repl_it_tasks.from1to50;


import java.util.Scanner;

public class Task022_ShoppingList {
  public static void main(String[] args) {
    //WRITE YOUR CODE HERE:
    
   // String item1,item2,item3,report;
   // double price1,price2,price3,totalPrice;
    
    Scanner scan= new Scanner(System.in);
    
    
  

      System.out.println("Enter item1 and its price:");

      String item1= scan.next();
      double price1=scan.nextDouble();


      System.out.println("Enter item2 and its price:");
      String item2= scan.next();
      double price2=scan.nextDouble();

   
      System.out.println("Enter item3 and its price:");
      String item3= scan.next();
      double price3=scan.nextDouble();
      
      
    double totalPrice=price1+price2+price3;
    
    String report="ITEM1: "+item1+" "+price1+" ITEM2: "+item2+" "+price2+ " ITEM3: "+item3+" "+price3+"\nTotal price: "+totalPrice;
    
    System.out.println(report);
  }
}