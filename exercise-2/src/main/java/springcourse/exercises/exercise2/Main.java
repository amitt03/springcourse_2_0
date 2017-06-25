package springcourse.exercises.exercise2;

import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Main {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        // TODO Use AnnotationConfigApplicationContext in order to create a spring container

        // TODO Retrieve "libraryA" from the container and call close method
        // TODO Retrieve the "libA" from the container
        // TODO Verify that the two beans are actually the same bean (use org.junit.Assert.assertEquals method)

        // TODO Retrieve the "libraryB" from the container and call close method
        // TODO Retrieve the "libB" from the container
        // TODO Verify that the two beans are actually the same bean (may use org.junit.Assert.assertEquals method)

        // TODO Verify that libraryA and LibraryB are NOT the same bean (may use org.junit.Assert.assertNotEquals method);
        
        // TODO Retrieve "prototypeLibrary" bean from the container
        // TODO Retrieve another "prototypeLibrary" bean from the container
        // TODO Verify that the two prototype beans are NOT the same bean (use org.junit.Assert.assertNotEquals method)
        // TODO Verify that the two prototype beans are NOT the same as "libraryA" or "libraryB"

        // TODO From each prototype bean fetch it's inner BookDao (add a getter inside Library code)
        // TODO and verify that both BookDaos are actually the same bean (use org.junit.Assert.assertEquals method)
    }
}
