package creational_patterns.abstract_factory.transport;

import creational_patterns.abstract_factory.transport_interface.Car;

public class Porsche implements Car {
    @Override
    public void drive() {
        System.out.println("Porsche drive");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stopped");

    }
}
