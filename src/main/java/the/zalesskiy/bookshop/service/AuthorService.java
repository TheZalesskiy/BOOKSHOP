package the.zalesskiy.bookshop.service;

import the.zalesskiy.bookshop.model.Author;

import java.util.List;

/**
 * AuthorService class
 *
 * @author Evgeniy Zalesskiy
 */
public interface AuthorService {
    public void addAuthor(Author author);

    public void updateAuthor(Author author);

    public void removeAuthor(int id);

    public Author getAuthorById(int id);

    public List<Author> listAuthors();
}
