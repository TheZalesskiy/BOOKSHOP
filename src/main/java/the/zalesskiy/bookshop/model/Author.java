package the.zalesskiy.bookshop.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Author class
 *
 * @author Evgeniy Zalesskiy
 */
@Entity
@Table(name = "AUTHORS")
public class Author {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "AUTHOR_NAME")
    private String authorName;
    @Column(name = "BOOK_AUTHOR")
    private String bookAuthor;
    @Column(name = "DISCRIPTION")
    private String discription;

    @ManyToMany
    @JoinTable(name = "library",joinColumns =
    @JoinColumn (name = "author_id"), inverseJoinColumns = @JoinColumn(name = "book_id") )
    private Set<Book> books = new HashSet<Book>();

    public Author() {
    }


    public Author(String authorName, String bookAuthor, String discription) {
        this.authorName = authorName;
        this.bookAuthor = bookAuthor;
        this.discription = discription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", discription='" + discription + '\'' +
                '}';
    }
}
