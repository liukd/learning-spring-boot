package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liukedong on 2017/7/5.
         */
/**
 * Created by liukedong on 2017/7/4.
 */
@SpringBootApplication
@Controller
public class SampleApplication {

    @RequestMapping("/index/{name}")
    public String hello(@PathVariable("name") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }

}

