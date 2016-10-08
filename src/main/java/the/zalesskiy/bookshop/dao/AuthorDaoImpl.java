package the.zalesskiy.bookshop.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import the.zalesskiy.bookshop.model.Author;

import java.util.List;

/**
 * AuthorDaoImpl class
 *
 * @author Evgeniy Zalesskiy
 */
@Repository
public class AuthorDaoImpl implements AuthorDao {
    private static final Logger logger = LoggerFactory.getLogger(AuthorDao.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addAuthor(Author author) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(author);
        logger.info("Author successfully saved. Author details: " + author);
    }

    @Override
    public void updateAuthor(Author author) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(author);
        logger.info("Author successfully update. Author details: " + author);
    }

    @Override
    public void removeAuthor(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Author author = (Author) session.load(Author.class, new Integer(id));

        if (author != null) {
            session.delete(author);
        }
        logger.info("Author successfully removed. Author details: " + author);
    }

    @Override
    public Author getAuthorById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Author author = (Author) session.load(Author.class, new Integer(id));
        logger.info("Author successfully loaded. Author details: " + author);

        return author;
    }

    @Override
    public List<Author> listBooks() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Author> authorList = session.createQuery("from Author").list();

        for (Author author : authorList){
            logger.info("Author list: " + author);
        }
            return authorList;
    }
}
