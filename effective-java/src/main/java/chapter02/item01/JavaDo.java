package chapter02.item01;

/*
 * 정적 팩터리 메서드의 경우 javadoc에서 생성자 부분에 별다른 표시가 되지 않기 때문에 다른 개발자가 알아차리기 힘들다.
 * 때문에 javadoc을 통해 명시해주면 좋다.
 */
/**
 * 이 클래스의 경우 getInstance 메소드를 통해 인스턴스를 얻을 수 있습니다.
 * @see #getInstance(String)
 */
public class JavaDo {

    private String name;
    private boolean elder;

    private JavaDo() {
    }

    public JavaDo getInstance(String name) {
        JavaDo instance = new JavaDo();
        instance.name = name;
        instance.elder = true;

        return instance;
    }
}
