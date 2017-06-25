package springcourse.solutions.exercise2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
@Configuration
public class AppConfig {

    @Bean
    public BookDao bookDao() {
        return new BookDao();
    }

    @Bean(name = {"libA", "libraryA"})
    public Library libraryA() {
        return new Library(bookDao());
    }

    @Bean(name = {"libB", "libraryB"})
    public Library libraryB() {
        return new Library(bookDao());
    }
    
    @Bean(name = {"prototypeLibrary"})
    @Scope("prototype")
    public Library libraryC() {
        return new Library(bookDao());
    }
}
