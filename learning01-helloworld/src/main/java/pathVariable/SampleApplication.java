package pathVariable;

import hello.Sample1Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by liukedong on 2017/7/3.
 */
@SpringBootApplication
@RestController
public class SampleApplication {

    @RequestMapping("/users/{username}")
    public String userProfile(@PathVariable("username") String username){
        return String.format("user: %s", username);
    }

    @RequestMapping("/posts/{id}")
    public String post(@PathVariable("id") int id) {
        return String.format("post %d", id);
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}
