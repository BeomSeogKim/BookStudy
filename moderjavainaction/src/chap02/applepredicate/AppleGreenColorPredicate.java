package chap02.applepredicate;

import chap02.FilteringApples;

import static chap02.FilteringApples.Color.GREEN;


public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(FilteringApples.Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
