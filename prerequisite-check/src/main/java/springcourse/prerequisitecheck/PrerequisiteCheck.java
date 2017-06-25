package springcourse.prerequisitecheck;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Amit Tal
 * @since 4/28/2014
 */
@RestController
public class PrerequisiteCheck {

    public static String PASS = "PASSED, you are good to go";

    @RequestMapping(method = RequestMethod.GET)
    public String PrerequisiteCheck() {
        return PASS;
    }
}
