package book;


import java.util.ArrayList;
import java.util.List;
public class Book {

    private String Title; 
    private String author;
    private String isbn;
    
public Book(String Title,String outhor,String isban, String isbn){
    this.Title = Title;
    this.author = author;
    this.isbn= isbn;

}
public String getTitle(){
    return Title;
}
public String getauthor(){
    return author;
}
public String getisbn(){
    return isbn;
}

public String toString(){
  return "Title: " + Title + ", Author: " + author + ", isbn: " + isbn;
}
}

 class Library {
 private List<Book> books;

public Library() {
 books = new ArrayList<>();
}
public void addBook(Book book) {
        books.add(book);
        System.out.println("Nagdagdag ng libro: " + book.getTitle());
    }
public boolean removeBook(String isbn) {
        for (Book book : books) {
            if (book.getisbn().equals(isbn)) {
                books.remove(book);
                System.out.println("Tinanggal ang libro: " + book.getTitle());
                return true;
            }
        }
        System.out.println("Hindi nahanap ang libro na may ISBN: " + isbn);
        return false;
    }
    // Added displayBooks method to show all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("Walang libro sa library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }
}


