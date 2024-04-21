import java.util.ArrayList;
public class Book {

    //instance attributes 
    public String title;
    public String author;
    public String isbnNo;

    //create a collection of books
    private static ArrayList<Book> bookCollection = new ArrayList<Book>();

    //constructor
    public Book(String title,String author,String isbnNo){
        this.title = title;
        this.author = author;
        this.isbnNo = isbnNo;
    }

    //getter and setter methods
    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public String getIsbnNo(){
        return isbnNo;
    }

    //setter methods
    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = author;
    }

    public void setIsbnNo(String isbnNo){
        this.isbnNo = isbnNo;
    }

    //methods to add or remove books
    public static void addBook(Book book){
        bookCollection.add(book);
    }

    public static void removeBook(Book book){
        bookCollection.remove(book);
    }

    //method that returns the collection of books
    public static ArrayList < Book > get_BookCollection() {
        return bookCollection;
    }
}
