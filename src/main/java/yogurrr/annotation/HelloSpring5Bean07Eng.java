package yogurrr.annotation;

import org.springframework.stereotype.Component;

@Component("Eng")
public class HelloSpring5Bean07Eng implements HelloSpring5Bean07 {
    public void sayHello(String msg) {
        System.out.println("Hello, " + msg);
    }
}
