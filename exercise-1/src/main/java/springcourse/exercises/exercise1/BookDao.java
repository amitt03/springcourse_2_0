package springcourse.exercises.exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class BookDao {

    private Logger logger = LoggerFactory.getLogger(BookDao.class);

    public boolean checkConnection() {
        logger.info("The connection is stable");
        return true;
    }
}
