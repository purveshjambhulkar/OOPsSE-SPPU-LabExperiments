/*Identify commonalities and differences between Publication, Book and Magazine classes.
 Title, Price, Copies are common instance variables and saleCopy is common method.
 The differences are, Bookclass has author and order Copies().
  Magazine Class has methods orderQty, Currentissue, receiveissue().
  Write a program to find how many copies of the given books are ordered 
  and display total sale of publication. */

import java.util.Scanner;



class Publication {
  public String title;
  public double price = 250;
  public int copies;

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getCopies() {
    return copies;
  }

  public void setCopies(int copies) {
    this.copies = copies;
  }

  public void sellCopy() {
    System.out.println("Total Sell : " + copies  * price);

  }

}

class Book extends Publication {
  private String author;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void orderCopies() {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many copies of Book you want to order");
    copies = input.nextInt();
    System.out.println("Order placed successfully");

  }

  public void sellCopy() {
    System.out.println("The total number of copies ordered is : " + copies);
    System.out.println("The price of one quantity is : " + price);
    System.out.println("Total Book Sell : " + copies * price);

  }

}

class Magazine extends Publication {
  private int orderQty;
  private String Issue;
  

  public String getcurrIssue() {
    return Issue;
  }

  public void setcurrIssue(String issue) {
    Issue = issue;
  }

  public int getOrderQty() {
    return orderQty;
  }

  public void OrderQty() {
    System.out.println("Enter the quantity of magazine you want to order");
    Scanner input = new Scanner(System.in);
    orderQty = input.nextInt();
    System.out.println("Ordered Successfully");
  }

  public void sellCopy() {
    System.out.println("The totat number of the quantity ordered is : " + orderQty);
    System.out.println("The price of one quantity is : " + price);
    System.out.println("Total Book Sell : " + orderQty * price);

  }

  public void receiveissue() {
    System.out.println("Enter new issue");
    Scanner input = new Scanner(System.in);
    String newIssue = input.nextLine();
    this.Issue = newIssue;
    System.out.println("Issue recorded");
  }

}

public class classmain {
  public static void main(String[] args) {
    Book book = new Book();
    book.orderCopies();
    book.sellCopy();
    
    System.out.println();

    Magazine magazine = new Magazine();
    magazine.OrderQty();
    magazine.sellCopy();
    magazine.receiveissue();

  }
}
