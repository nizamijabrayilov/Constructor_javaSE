package Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        System.out.println(book.toString());
        book.update();
        book.display();
    }

}
