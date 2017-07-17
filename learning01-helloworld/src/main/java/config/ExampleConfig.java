package config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.resource.ResourceUrlProvider;

/**
 * Created by liukedong on 2017/7/5.
 */
@ControllerAdvice
public class ExampleConfig {

    @Autowired
    private ResourceUrlProvider resourceUrlProvider;

    // 这里的作用就是在所有的controller返回model对象之前，将这个urls()返回的数据放入model中
    @ModelAttribute("urls")
    public ResourceUrlProvider urls(){
        System.out.println("=======ModelAttribute.");
        System.out.println(resourceUrlProvider.getForLookupPath("/js/demo.js"));
        return this.resourceUrlProvider;
    }



}
