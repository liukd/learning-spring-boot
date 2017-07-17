package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liukedong on 2017/7/1.
 */
@SpringBootApplication
@RestController
public class SampleController {

    @RequestMapping("/")
    String home(){
        return "Index Page";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleController.class, args);
    }

}
