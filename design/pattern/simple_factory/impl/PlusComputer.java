package design.pattern.simple_factory.impl;

import design.pattern.simple_factory.Computer;

/**
 * 加法运算.
 */
public class PlusComputer implements Computer {

    @Override
    public Integer compute(Integer paramA, Integer paramB) {
        return paramA + paramB;
    }
}
