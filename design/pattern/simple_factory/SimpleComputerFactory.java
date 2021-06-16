package design.pattern.simple_factory;

import design.pattern.simple_factory.impl.MultiComputer;
import design.pattern.simple_factory.impl.PlusComputer;

/**
 * 简单工厂（根据场景生产特定的计算）.
 */
public class SimpleComputerFactory {

    public static Computer getComputerProduct(Integer scene) {
        Computer computer;
        switch (scene) {
            case 0:
                computer = new PlusComputer();
                break;
            case 1:
                computer = new MultiComputer();
                break;
            default:
                computer = null;
        }
        return computer;
    }
}
