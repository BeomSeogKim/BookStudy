package chap02.applepredicate;

import chap02.FilteringApples;

public interface ApplePredicate {
    boolean test(FilteringApples.Apple apple);
}
