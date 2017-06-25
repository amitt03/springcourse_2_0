package springcourse.prerequisitecheck.boot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by amitt on 01/05/2017.
 */
@RestController
public class PrerequisiteCheck {

    public static String PASS = "PASSED, you are good to go";

    @RequestMapping(method = RequestMethod.GET)
    public String PrerequisiteCheck() {
        return PASS;
    }
}
