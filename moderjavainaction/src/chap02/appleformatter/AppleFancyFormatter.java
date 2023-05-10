package chap02.appleformatter;

import chap02.FilteringApples;

public class AppleFancyFormatter implements AppleFormatter {
    @Override
    public String accept(FilteringApples.Apple apple) {
        String characteristics = apple.getWeight() > 150 ? "heavy" : "light";
        return "A " + characteristics + " " + apple.getColor() + " apple";
    }
}
