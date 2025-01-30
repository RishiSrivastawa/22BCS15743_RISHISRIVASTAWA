

import java.util.Scanner;
class Book {
    String title;
    String author;
    int price;
    Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails(){
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
class Fiction extends Book {
    Fiction(String title, String author, int price) {
        super(title, author, price);
    }
}

class NonFiction extends Book {
    NonFiction(String title, String author, int price) {
        super(title, author, price);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter details for Fiction book:");
        System.out.print("Title: ");
        String fictionTitle = sc.nextLine();
        System.out.print("Author: ");
        String fictionAuthor = sc.nextLine();
        System.out.print("Price: ");
        int fictionPrice = sc.nextInt();
        sc.nextLine();
        Fiction fictionBook = new Fiction(fictionTitle, fictionAuthor, fictionPrice);


        System.out.println("Enter details for Non-Fiction book:");
        System.out.print("Title: ");
        String nonFictionTitle = sc.nextLine();
        System.out.print("Author: ");
        String nonFictionAuthor = sc.nextLine();
        System.out.print("Price: ");
        int nonFictionPrice = sc.nextInt();
        NonFiction nonFictionBook = new NonFiction(nonFictionTitle, nonFictionAuthor, nonFictionPrice);


        System.out.println("Fiction Book Details:");
        fictionBook.displayDetails();

        System.out.println("Non-Fiction Book Details:");
        nonFictionBook.displayDetails();

    }
}
