package chap02.applepredicate;

import chap02.FilteringApples;

public class AppleHeavyWeightPredicate implements ApplePredicate {
    @Override
    public boolean test(FilteringApples.Apple apple) {
        return apple.getWeight() > 150;
    }
}
