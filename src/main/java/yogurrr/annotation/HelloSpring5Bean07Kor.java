package yogurrr.annotation;

import org.springframework.stereotype.Component;

@Component("Kor")
public class HelloSpring5Bean07Kor implements HelloSpring5Bean07 {
    public void sayHello(String msg) {
        System.out.println("안녕하세요, " + msg);
    }
}
