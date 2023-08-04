package Book;

import java.util.Scanner;

public class Book {
    Scanner sc = new Scanner(System.in);
    private String title;
    private String author;
    private int yearPublished;
    private int pageCount;

    public Book(String title, String author, int yearPublished, int pageCount) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.pageCount = pageCount;
    }

    public Book() {
        this.title = "unknown";
        this.author = "Unknown";
        this.yearPublished = 0;
        this.pageCount = 0;
    }

    public void update(){
        System.out.println("Enter the title: ");
        title = sc.nextLine();

        System.out.println("Enter the author: ");
        author = sc.nextLine();

        System.out.println("Enter the year Published: ");
        yearPublished = sc.nextInt();

        System.out.println("Enter the page Count: ");
        pageCount = sc.nextInt();

    }

    public void display(){

        System.out.println("Book details after Update: " + "\n" + "Title: " + title +
                "\n" + "Author: " + author + "\n" +
                "Year of Publishing: " + yearPublished + "\n" + "Page Count: " + pageCount);

    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", pageCount=" + pageCount +
                '}';
    }
}
