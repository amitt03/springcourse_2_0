package springcourse.solutions.exercise2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.PostConstruct;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Library {

    private Logger logger = LoggerFactory.getLogger(Library.class);

    private BookDao bookDao;

    public Library(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @PostConstruct
    public void open() {
        if (bookDao.checkConnection()) {
            logger.info("The library is now open [{}]", this.hashCode());
        } else {
            logger.info("The library is temporarily unavailable [{}]", this.hashCode());
        }
    }

    public void close() {
        logger.info("The library is now closed [{}]", this.hashCode());
    }
    
    public BookDao getBookDao() {
        return bookDao;
    }

}
