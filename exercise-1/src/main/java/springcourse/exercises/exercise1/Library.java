package springcourse.exercises.exercise1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Library {

    private Logger logger = LoggerFactory.getLogger(Library.class);

    public void open() {
        logger.info("The library is now open");
    }

    public void close() {
        logger.info("The library is now closed");
    }

}
