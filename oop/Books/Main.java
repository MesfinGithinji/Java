import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Book bk1 = new Book("Things Fall Apart", "Chinua Achebe", "978-3-16-148410-0");
        Book bk2 = new Book("Dreams from my Father", "Barak Obama", "178-2-14-148410-2");

        Book.addBook(bk1);
        Book.addBook(bk2);
        
        ArrayList<Book> bookCollection = Book.get_BookCollection();

        for(Book book: bookCollection){
            System.out.println("\n"+ book.getTitle() + " by " + book.getAuthor() + "\nISBN: " + book.getIsbnNo());
        }
    }
}
