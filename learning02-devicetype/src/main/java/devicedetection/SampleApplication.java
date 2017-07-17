package devicedetection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mobile.device.Device;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * 在POM中引入spring-mobile-device这个依赖之后，Spring Boot会自动配置好DeviceResolverHandlerInterceptor和DeviceHandlerMethodArgumentResolver，其中：

 DeviceResolverHandlerInterceptor通过Web请求头中的User-Agent属性来确定请求来自于桌面浏览器、移动浏览器还是平板浏览器。DeviceHandlerMethodArgumentResolver 则用于将DeviceResolverHandlerInterceptor拦截器捕获的信息转换为Device类，这样我们就能在Controller中，直接通过访问该类的属性就能检测出设备类型。
 * Created by liukedong on 2017/7/4.
 */
@SpringBootApplication
@Controller
public class SampleApplication {


    @RequestMapping("/")
    public @ResponseBody String detectDevice(Device device){
        String deviceType = "unknown";
        if(device.isNormal()){
            deviceType = "normal";
        }else if(device.isMobile()){
            deviceType = "mobile";
        }else if(device.isTablet()){
            deviceType = "tablet";
        }
        return "Hello " + deviceType + " browser!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SampleApplication.class, args);
    }
}
