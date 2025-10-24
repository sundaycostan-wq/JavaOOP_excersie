package library;

public class LibraryMain {
    public static void main(String[] args) {
        Library lib = new Library();
        
        // Add more books
        lib.addBook("1984", "Orwell");
        lib.addBook("Mockingbird", "Lee");
        lib.addBook("Gatsby", "Fitzgerald");
        lib.addBook("Pride and Prejudice", "Austen");
        
        // Display all
        lib.displayBooks();
        System.out.println("Total books: " + lib.getTotalBooks());
        
        // Search
        Book found = lib.searchBook("Gatsby");
        System.out.println("Found: " + (found != null ? found : "Not found"));
        
        // Remove
        lib.removeBook("1984");
        lib.displayBooks();
        System.out.println("Total books: " + lib.getTotalBooks());
    }
}

