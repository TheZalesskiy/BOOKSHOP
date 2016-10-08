package the.zalesskiy.bookshop.service;

import the.zalesskiy.bookshop.model.Book;

import java.util.List;
/**
 * qwer class
 *
 * @author Evgeniy Zalesskiy
 */
public interface BookService {
    public void addBook(Book book);

    public void updateBook(Book book);

    public void removeBook(int id);

    public Book getBookById(int id);

    public List<Book> listBooks();
}
