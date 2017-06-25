package springcourse.prerequisitecheck;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Amit Tal
 * @since 4/28/2014
 */
@Configuration
@EnableWebMvc
@Import(PrerequisiteCheck.class)
public class AppConfig {
}
