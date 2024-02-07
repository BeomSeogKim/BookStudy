package chapter02.item01;

public class Order {
    public Order order = new Order();

    private Order() {

    }

    /*
     만약 인스턴스가 무겁다면 인스턴스를 미리 만들어 둠으로 인해
     인스턴스를 캐싱해 재활용하는 방식으로 불필요한 객체 생성을 피할 수 있다.
     반복되는 요청에 대해 같은 객체를 반환하는 식으로 정적 팩터리 방식의 클래스는 언제 어느 인스턴스를 살아 있게 할지를
     철저히 통제 가능함.
     */
    public Order getInstance() {
        return this.order;
    }
}
