package creational_patterns.abstract_factory.aircraft;

import creational_patterns.abstract_factory.transport_interface.Aircraft;

public class Boeing747 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("Boeing 747 fly");
    }
}
