package com.mlamp.design.pattern.behavior.strategy;

public class Plus extends AbstractCalculator implements Icalculator {
    @Override
    public int calculate(String expression) {
        int arrayInt[] = split(expression,"\\+");
        return arrayInt[0] + arrayInt[1];
    }
}
