package book;

public class Mian {
    public static void main(String[] args) {
        Library library = new Library();
        // Sample books
        Book book1 = new Book("1984", "George Orwell", "978-0451524935", null);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", null);
        library.addBook(book1);
        library.addBook(book2);
        System.out.println("\nMga libro sa library:");
        library.displayBooks();
        // Remove one
        library.removeBook("978-0451524935");
        System.out.println("\nPagkatapos tanggalin:");
        library.displayBooks();
    }
}


