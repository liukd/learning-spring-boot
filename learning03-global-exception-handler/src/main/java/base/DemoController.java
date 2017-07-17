package base;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by liukedong on 2017/7/5.
 */
@Controller
public class DemoController {


    @RequestMapping("/zeroException")
    public int zeroException(){
        return 100 / 0;
    }


}
