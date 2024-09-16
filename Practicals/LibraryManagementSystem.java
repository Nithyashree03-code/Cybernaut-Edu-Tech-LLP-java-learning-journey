import java.util.ArrayList;
import java.util.List;
class Book {
    private String title;
    private Author author;
    private String genre;
    public Book(String title, Author author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author.getName() +
                ", genre='" + genre + '\'' +
                '}';
    }
}
class Author {
    private String name;
    private List<Book> books;
    public Author(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }
    public String getName() {
        return name;
    }

    public void addBook(Book book) {
        books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }
    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                '}';
    }
}
class Library {
    private List<Book> books;
    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        books.add(book);
        book.getAuthor().addBook(book);
    }
    public List<Book> searchByAuthor(String authorName) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(authorName)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchByTitle(String title) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }
    public List<Book> searchByGenre(String genre) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre().equalsIgnoreCase(genre)) {
                result.add(book);
            }
        }
        return result;
    }
    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Author author1 = new Author("J.K. Rowling");
        Author author2 = new Author("George R.R. Martin");
        Book book1 = new Book("Harry Potter and the Philosopher's Stone", author1, "Fantasy");
        Book book2 = new Book("A Game of Thrones", author2, "Fantasy");
        Book book3 = new Book("Harry Potter and the Chamber of Secrets", author1, "Fantasy");
        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println("Books by J.K. Rowling:");
        for (Book book : library.searchByAuthor("J.K. Rowling")) {
            System.out.println(book);
        }
        System.out.println("\nBooks titled 'A Game of Thrones':");
        for (Book book : library.searchByTitle("A Game of Thrones")) {
            System.out.println(book);
        }
        System.out.println("\nBooks in the Fantasy genre:");
        for (Book book : library.searchByGenre("Fantasy")) {
            System.out.println(book);
        }
    }
}
