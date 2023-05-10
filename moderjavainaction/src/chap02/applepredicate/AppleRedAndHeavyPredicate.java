package chap02.applepredicate;

import static chap02.FilteringApples.Apple;
import static chap02.FilteringApples.Color.RED;

public class AppleRedAndHeavyPredicate implements ApplePredicate {

    @Override
    public boolean test(Apple apple) {
        return RED.equals(apple.getColor())
                && apple.getWeight() > 150;
    }
}
