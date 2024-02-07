package chapter02.item01;

public interface HelloService {

    /*
     * 인터페이스를 반환하게 된다면 하위 타입의 객체를 자유롭게 반환할 능력이 생긴다.
     */
    static HelloService of(String lang) {
        if (lang.equals("ko")) {
            return new KoreaHelloService();
        } else {
            return new EnglishHelloService();
        }
    }

    String hello();
}
