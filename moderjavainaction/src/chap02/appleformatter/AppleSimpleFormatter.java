package chap02.appleformatter;

import chap02.FilteringApples;

public class AppleSimpleFormatter implements AppleFormatter{
    @Override
    public String accept(FilteringApples.Apple apple) {
        return "An apple of " + apple.getWeight() + "g";
    }
}
