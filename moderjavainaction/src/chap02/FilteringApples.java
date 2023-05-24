package chap02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static chap02.FilteringApples.Color.GREEN;
import static chap02.FilteringApples.Color.RED;

public class FilteringApples {
    public static void main(String[] args) {
        List<Apple> inventory = Arrays.asList(
                new Apple(80, GREEN),
                new Apple(155, GREEN),
                new Apple(120, RED),
                new Apple(200, RED)
        );
        // 1. 녹색 사과 필터링
        System.out.println(filterGreenApples(inventory));
        // 2. 색을 파라미터로 전달
        System.out.println(filterApplesByColor(inventory, GREEN));
        System.out.println(filterApplesByColor(inventory, RED));
        // 3. 모든 속성으로 필터링 => 권장하지 않는 방식
        System.out.println(filterApples(inventory, GREEN, 0, true));
        System.out.println(filterApples(inventory, null, 150, false));
        // 4. 추상적 조건을 활용한 필터링
        System.out.println(filterApplesV2(inventory, new AppleGreenColorPredicate()));
        System.out.println(filterApplesV2(inventory, new AppleHeavyWeightPredicate()));
        System.out.println(filterApplesV2(inventory,new AppleRedAndHeavyPredicate()));

        // Quiz
        prettyPrintApple(inventory, new AppleWeightPrinter());
        prettyPrintApple(inventory, new AppleColorPrinter());

        // 익명 클래스
        System.out.println(filterApplesV2(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return RED == apple.getColor();
            }
        }));

        // lambda
        System.out.println(filterApplesV2(inventory, (Apple apple) -> RED == apple.getColor()));

    }

    /*
     * 1st => 녹색 사과 필터링
     * 기준을 정하는 색이 바뀔 경우 Enum의 Color 값만 변경 될 뿐 코드가 전반적으로 동일하다.
     * 비슷한 코드가 반복이 일어난다면 코드를 추상화 해야한다.
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory){
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    // 2nd => 색을 파라미터화
    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (color == apple.getColor()) {
                result.add(apple);
            }
        }
        return result;
    }

    // 새로운 조건 검색이 필요해요! => 무게
    public static List<Apple> filterAppleByWeight(List<Apple> inventory, int weight) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
     * 3rd => 가능한 모든 속성으로 필터링
     * flag를 추가 (어떠한 속성을 사용할지 결정하는 인자)
     * 실무에서는 절대 사용하지 말 것.
     * flag의 ture // false 의미를 알아보기 힘들다. (본 예제에서는 flag가 있을 경우 색, 없을 경우 무게)
     * 인자가 3개 이상일 경우에는 어떻게 나눌 것인가?
     */
    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) ||
                            (!flag && apple.getWeight() > weight)
            ) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
     * 4rd => 추상적 조건으로 필터링
     */
    public static List<Apple> filterApplesV2(List<Apple> inventory, ApplePredicate p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    static class Apple{
        private int weight = 0;
        private Color color;

        public Apple(int weight, Color color) {
            this.weight = weight;
            this.color = color;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return String.format("Apple{color='%s', weight=%d}", color, weight);
        }
    }

    static enum Color {
        RED, GREEN
    }

    interface ApplePredicate {
        boolean test(Apple apple);
    }

    // 무게가 150 이상인 사과 분류
    static class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getWeight() > 150;
        }
    }

    static class AppleGreenColorPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return apple.getColor() == GREEN;
        }
    }

    static class AppleRedAndHeavyPredicate implements ApplePredicate {
        @Override
        public boolean test(Apple apple) {
            return RED == apple.getColor() && apple.getWeight() > 150;
        }
    }

    // == Quiz == //
    public static void prettyPrintApple(List<Apple> inventory, ApplePrinterPredicate p) {
        for (Apple apple : inventory) {
            String output = p.print(apple);
            System.out.println(output);
        }
    }

    interface ApplePrinterPredicate {
        String print(Apple apple);
    }

    static class AppleWeightPrinter implements ApplePrinterPredicate {
        @Override
        public String print(Apple apple) {
            return "Weight of Apple : " + apple.getWeight();
        }
    }

    static class AppleColorPrinter implements ApplePrinterPredicate {
        @Override
        public String print(Apple apple) {
            return "Color of Apple : " + apple.getColor();
        }
    }

}
