package httpmethod;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liukedong on 2017/7/3.
 */

@SpringBootApplication
@RestController
public class SampleApplication {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginGet(){
        return "Login page";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(){
        return "Login Post Request. ";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}
