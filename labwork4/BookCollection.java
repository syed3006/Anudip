package labwork4;

import java.util.ArrayList;

class Book {
    private int bookId;
    private String bookName;
    private String authorName;

    // Parameterized constructor
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Getter methods (optional, for better encapsulation)
    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    // Override toString() for easy display of book details
    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Book Name: \"" + bookName + "\", Author: " + authorName;
    }
}

public class BookCollection {
    public static void main(String[] args) {
        // Create an ArrayList to store Book objects
        ArrayList<Book> books = new ArrayList<>();

        // Add Book objects to the collection
        books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(4, "Pride and Prejudice", "Jane Austen"));

        // Display all book details using an advanced for loop
        System.out.println("Book Details:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}