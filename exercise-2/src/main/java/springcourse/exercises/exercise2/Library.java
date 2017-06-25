package springcourse.exercises.exercise2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Library {

    private Logger logger = LoggerFactory.getLogger(Library.class);

    // TODO Need to get reference to BookDao bean
    private BookDao bookDao;

    public void open() {
        if (bookDao.checkConnection()) {
            logger.info("The library is now open [{}]", this.hashCode());
        } else {
            logger.info("The library is temporarily unavailable [{}]", this.hashCode());
        }
    }

    public void close() {
        logger.info("The library is now closed");
    }

}
