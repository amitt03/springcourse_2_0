package springcourse.solutions.exercise2;

import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Library libraryA = context.getBean("libraryA", Library.class);
        Library libraryB = context.getBean("libraryB", Library.class);
        Library libA = context.getBean("libA", Library.class);
        Library libB = context.getBean("libB", Library.class);
        Assert.assertEquals(libraryA, libA);
        Assert.assertEquals(libraryB, libB);
        Assert.assertNotEquals(libraryA, libraryB);
        
        // Prototype
        Library prototypeLibraryA = context.getBean("prototypeLibrary", Library.class);
        Library prototypeLibraryB = context.getBean("prototypeLibrary", Library.class);
        Assert.assertNotEquals(prototypeLibraryA, prototypeLibraryB);
        Assert.assertNotEquals(libraryA, prototypeLibraryA);
        Assert.assertNotEquals(libraryB, prototypeLibraryA);
        Assert.assertNotEquals(libraryA, prototypeLibraryB);
        Assert.assertNotEquals(libraryB, prototypeLibraryB);
        Assert.assertEquals(prototypeLibraryA.getBookDao(), prototypeLibraryB.getBookDao());
    }
}
