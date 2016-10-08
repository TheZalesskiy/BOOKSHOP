package the.zalesskiy.bookshop.dao;

import the.zalesskiy.bookshop.model.Book;

import java.util.List;
/**
 * qwer class
 *
 * @author Evgeniy Zalesskiy
 */
public interface BookDao {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}
