package springcourse.solutions.exercise4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author Amit Tal
 * @since 3/24/14
 */
@Configuration
@ComponentScan("springcourse.solutions.exercise4")
@PropertySource({"books-analyzer.properties", "members.properties"})
public class AppConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer configurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}