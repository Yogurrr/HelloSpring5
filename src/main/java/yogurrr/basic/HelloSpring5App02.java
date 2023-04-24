package yogurrr.basic;

import yogurrr.beans.HelloSpring5Bean02;

public class HelloSpring5App02 {
    // 세번째 사례
    // 인삿말을 한국어,영어,일본어로 출력하도록 기능 추가

    // 인터페이스 프로그래밍의 장점은
    // 객체간의 의존성을 낮출수 있는 것 이외에도
    // 특정 기능 호출시 통일된 방식을 사용할 수 있다는 것임

    // 아래 코드처럼 인삿말 출력시
    // 해당기능을 제각각의 이름으로 호출하는 경우
    // 지나치게 복잡해지고, 기능에 따라 이름을
    // 일일이 외워야 하는 불편함이 존재

    public static void main(String[] args) {
        HelloSpring5Bean02 bean02 = new HelloSpring5Bean02();
        bean02.sayHelloKor("스프링 5");
        bean02.sayHelloEng("Spring 5");
        bean02.sayHelloJpn("スプリング 5");
    }
}
