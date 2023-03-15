import java.util.Objects;

public class Book {
    private final String bookName;
    private final Author author;
    private int yearPublication;
    public Book(String bookName, Author author, int yearPublication) {
        this.bookName = bookName;
        this.yearPublication = yearPublication;
        this.author = author;
        }
    public String getBookName() {
        return bookName;
    }
    public int getYearPublication() {
        return yearPublication;
    }
    public Author getAuthor() {
        return author;
    }
    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }
    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author=" + author +
                ", yearPublication=" + yearPublication +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublication == book.yearPublication && Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bookName, author, yearPublication);
    }
}
