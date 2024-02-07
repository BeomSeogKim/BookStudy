package chapter02.item01;

import java.util.Optional;
import java.util.ServiceLoader;

public class ServiceLoad {

    public static void main(String[] args) {
        /*
        ServiceLoader의 경우 주어진 경로 HelloService를 구현한 객체가 있는 지 다 찾아온 다음 있다면 실행을 한다.
        그렇기 때문에 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 됨.
         */
        ServiceLoader<HelloService> loader = ServiceLoader.load(HelloService.class);
        Optional<HelloService> helloServiceOptional = loader.findFirst();
        helloServiceOptional.ifPresent(h -> {
            System.out.println(h.hello());
        });
    }
}
