package yogurrr.basic;

import yogurrr.beans.*;

public class HelloSpring5App03 {
    // 네번째 사례
    // 인삿말을 한국어,영어,일본어로 출력하도록 기능 추가

    // 인터페이스를 도입하면
    // 확장성이 높고 유연한 코드를 작성할 수 있음
    // 또한, 객체간의 tightly coupled(응집도)를 피할 수 있고
    // 객체간의 의존성을 낮출수도 있음

    // 하지만, new 연산자로 객체를 생성하는 코드가 노출됨
    // 다시 말해, HelloSpringBean03은
    // HelloSpring5Bean03Kor, HelloSpring5Bean03Eng,
    // HelloSpring5Bean03Jpn에 의존적이라는 의미

    // 해결 : factory 패턴을 이용해서
    // 객체생성을 전담하는 클래스를 만들어
    // 객체생성 과정을 캡슐화 함

    public static void main(String[] args) {
        HelloSpring5Bean03 bean03 = null;

        bean03 = new HelloSpring5Bean03Kor();
        bean03.sayHello("스프링 5");

        bean03 = new HelloSpring5Bean03Eng();
        bean03.sayHello("Spring 5");

        bean03 = new HelloSpring5Bean03Jpn();
        bean03.sayHello("スプリング 5");
    }
}
