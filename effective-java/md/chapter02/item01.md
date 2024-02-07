### 생성자 대신 정적 팩터리 메서드를 고려하라.

보통은 클래스의 인스턴스를 얻기 위해 public 생성자를 사용한다.   
이 외에도 정적 팩터리 메서드를 통해 인스턴스를 얻을 수 있다. 

**장점**
1. 이름을 가질 수 있다.
   - [예시 코드](..%2F..%2Fsrc%2Fmain%2Fjava%2Fchapter02%2Fitem01%2FPost.java)
2. 호출될 때 마다 인스턴스를 새로 생성하지 않아도 된다.
   - [예시 코드](..%2F..%2Fsrc%2Fmain%2Fjava%2Fchapter02%2Fitem01%2FOrder.java)
3. 반환 타입의 하위 타입 객체를 반환할 수 있는 능력이 있다.
4. 입력 매개변수에 따라 매번 다른 클래스의 객체를 반환할 수 있다.
   - [3, 4 예시코드](..%2F..%2Fsrc%2Fmain%2Fjava%2Fchapter02%2Fitem01%2FHelloService.java)
5. 정적 팩터리 메서드를 작성하는 시점에는 반환할 객체의 클래스가 존재하지 않아도 된다. 
   - [예시 코드](..%2F..%2Fsrc%2Fmain%2Fjava%2Fchapter02%2Fitem01%2FServiceLoad.java)

**단점**
1. 상속을 하려면 public이나 protected 생성자가 필요하니 정적 팩터리 메서드만 제공하면 하위 클래스를 만들 수 없다.
   - [예시 코드](..%2F..%2Fsrc%2Fmain%2Fjava%2Fchapter02%2Fitem01%2FOrderChild.java)
2. 정적 팩터리 메서드는 프로그래머가 찾기 힘들다.
   - [예시 코드](..%2F..%2Fsrc%2Fmain%2Fjava%2Fchapter02%2Fitem01%2FJavaDo.java)