package library;
import java.util.ArrayList;
import java.util.List;
class Book {
    String title, author;
    Book(String t, String a) { title = t; author = a; }
    public String toString() { return "Book{title='" + title + "', author='" + author + "'}"; }
}
public class Library {
    List<Book> books = new ArrayList<>();
    
    void addBook(String t, String a) { 
        books.add(new Book(t, a)); 
        System.out.println("Added: " + t); 
    }
     boolean removeBook(String t) {
        for (Book b : books) 
            if (b.title.equalsIgnoreCase(t)) { 
                books.remove(b); 
                System.out.println("Removed: " + t); 
                return true; 
            }
        System.out.println("Not found: " + t); 
        return false;
    }
    
    void displayBooks() { 
        if (books.isEmpty()) System.out.println("Empty"); 
        else for (Book b : books) System.out.println(b); 
    }
    
    // New: Search by title
    Book searchBook(String t) {
        for (Book b : books) 
            if (b.title.equalsIgnoreCase(t)) return b;
        return null;
    }
    
    // New: Get total books
    int getTotalBooks() { return books.size(); }
}