package design.pattern;


import design.pattern.simple_factory.SimpleComputerFactory;

public class Main {


    public static void main(String[] args) {
        Integer plusResult = SimpleComputerFactory.getComputerProduct(0).compute(1, 2);
        Integer multiResult = SimpleComputerFactory.getComputerProduct(1).compute(1, 2);
        System.out.println(1);
    }
}
