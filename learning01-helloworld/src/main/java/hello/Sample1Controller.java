package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liukedong on 2017/7/1.
 */
@Controller
@EnableAutoConfiguration
public class Sample1Controller {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "Index Page";
    }

    public static void main(String[] args) {
        SpringApplication.run(Sample1Controller.class, args);
    }

}
