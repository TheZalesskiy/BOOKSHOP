package the.zalesskiy.bookshop.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import the.zalesskiy.bookshop.dao.AuthorDao;
import the.zalesskiy.bookshop.model.Author;

import java.util.List;

/**
 * AuthorserviceImpl class
 *
 * @author Evgeniy Zalesskiy
 */
@Service
public class AuthorserviceImpl implements AuthorService {
    private AuthorDao authorDao;

    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    @Transactional
    public void addAuthor(Author author) {
        this.authorDao.addAuthor(author);

    }

    @Override
    @Transactional
    public void updateAuthor(Author author) {
        this.authorDao.updateAuthor(author);
    }

    @Override
    @Transactional
    public void removeAuthor(int id) {
        this.authorDao.removeAuthor(id);
    }

    @Override
    @Transactional
    public Author getAuthorById(int id) {
        return this.authorDao.getAuthorById(id);
    }

    @Override
    @Transactional
    public List<Author> listAuthors() {
        return this.authorDao.listBooks();
    }
}
