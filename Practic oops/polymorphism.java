/*Identify commonalities and differences between Publication, Book and Magazine classes.
 Title, Price, Copies are common instance variables and saleCopy is common method.
 The differences are, Bookclass has author and order Copies().
  Magazine Class has methods orderQty, Currentissue, receiveissue().
  Write a program to find how many copies of the given books are ordered 
  and display total sale of publication. */

import java.util.Scanner;

class Publication {

    public String title;
    public float price;
    public int copies;

    public void SellCopy() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

}

class Book extends Publication {

    public String Author;
    public int Copies;
    public int Price = 251;

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public int getCopies() {
        return Copies;
    }

    public void setCopies(int copies) {
        Copies = copies;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public void OrderCopies() {
        System.out.println("Enter how many copies you want to order : ");
        Scanner input = new Scanner(System.in);
        Copies = input.nextInt();
        System.out.println("Order Placed!!");

    }

    public void SellCopy() {
        System.out.println("The number of copies ordered is : " + Copies);
        System.out.println("The price of 1 copy is : " + Price);
        System.out.println("Total Sale : " + (Copies * Price));
    }

}

class Magazine extends Publication {
    public String Issue;
    public int Copies;
    public int Price = 251;

    public void orderQty() {
        System.out.println("Enter how many copies you want to order : ");
        Scanner input = new Scanner(System.in);
        Copies = input.nextInt();
        System.out.println("Order Placed!!");

    }

    public void Currentissue() {
        System.out.println("Current Issue : " + Issue);
    }

    public void receiveissue() {
        System.out.println("Enter New Issue : ");
        Scanner input = new Scanner(System.in);
        Issue = input.nextLine();

    }

    public void SellCopy() {
        System.out.println("The number of copies ordered is : " + Copies);
        System.out.println("The price of 1 copy is : " + Price);
        System.out.println("Total Sale : " + (Copies * Price));
    }

}

public class polymorphism {

    public static void main(String args[]) {

        // Book Class Implemetation
        System.out.println("----Book----");
        Book B1 = new Book();
        B1.OrderCopies();
        B1.SellCopy();
        System.out.println("-------------");

        // Magazine Class Implementation
        System.out.println("----Magazine----");
        Magazine M1 = new Magazine();
        M1.orderQty();
        M1.receiveissue();
        M1.Currentissue();
        M1.SellCopy();
        System.out.println("-------------");

    }
}
