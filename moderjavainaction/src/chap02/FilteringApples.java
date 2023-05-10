package chap02;

import chap02.appleformatter.AppleFancyFormatter;
import chap02.appleformatter.AppleFormatter;
import chap02.appleformatter.AppleSimpleFormatter;
import chap02.applepredicate.ApplePredicate;
import chap02.applepredicate.AppleRedAndHeavyPredicate;

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
                new Apple(155, RED)
        );

        // Version 1
        System.out.println(filterGreenApples(inventory));
        // Version 2
        System.out.println(filterAppleByColor(inventory, GREEN));
        System.out.println(filterAppleByColor(inventory, RED));
        // Version 3
        System.out.println(filterApples(inventory, GREEN, 0, true));
        System.out.println(filterApples(inventory, null, 150, false));
        // Version 4
        System.out.println(filterApples(inventory, new AppleRedAndHeavyPredicate()));

        // Quiz
        prettyPrintApple(inventory, new AppleFancyFormatter());
        prettyPrintApple(inventory, new AppleSimpleFormatter());

        // Version 5
        // 익명 클래스
        System.out.println(
                filterApples(inventory, new ApplePredicate() {
                    @Override
                    public boolean test(Apple apple) {
                        return RED.equals(apple.getColor());
                    }
                })
        );

        // Version 6
        System.out.println(filterApples(inventory, (Apple apple) -> RED.equals(apple.getColor())));

    }

    /*
    초록색 사과만 필터링 하고 싶어!
     */
    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (GREEN.equals(apple.getColor())) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
    색을 파라미터화
     */
    public static List<Apple> filterAppleByColor(List<Apple> inventory, Color color) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getColor().equals(color)) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
    무게에 따른 필터링
     */

    public static List<Apple> filterAppleByWeight(List<Apple> inventory, int weight) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (apple.getWeight() > weight) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
    안좋은 코드 예시
    true, false => 어떠한 역할을 하는지도 모르는 쓰레기 코드!
     */
    public static List<Apple> filterApples(List<Apple> inventory, Color color, int weight, boolean flag) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if ((flag && apple.getColor().equals(color)) || (!flag && apple.getWeight() > weight)) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
    추상적 조건으로 필터링
    Predicate를 이용한 메서드
     */
    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        ArrayList<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    /*
    Quiz
     */
    public static void prettyPrintApple(List<Apple> inventory, AppleFormatter appleFormatter) {
        for (Apple apple : inventory) {
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }


    public static class Apple {
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

        @SuppressWarnings("boxing")
        @Override
        public String toString() {
            return String.format("Apple{color='%s', weight=%d", color, weight);
        }
    }

    public static enum Color {
        RED, GREEN
    }

}

