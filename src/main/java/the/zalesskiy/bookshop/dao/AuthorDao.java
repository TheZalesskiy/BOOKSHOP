package the.zalesskiy.bookshop.dao;

import the.zalesskiy.bookshop.model.Author;

import java.util.List;

/**
 * AuthorDao class
 *
 * @author Evgeniy Zalesskiy
 */
public interface AuthorDao {
    public void addAuthor(Author author);

    public void updateAuthor(Author author);

    public void removeAuthor(int id);

    public Author getAuthorById(int id);

    public List<Author> listBooks();
}
