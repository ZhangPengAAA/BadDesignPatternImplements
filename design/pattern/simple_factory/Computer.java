package design.pattern.simple_factory;

/**
 * 抽象计算器.
 */
public interface Computer {

    /**
     * 输入两个数字，输出一个数字.
     */
    Integer compute(Integer paramA, Integer paramB);
}
