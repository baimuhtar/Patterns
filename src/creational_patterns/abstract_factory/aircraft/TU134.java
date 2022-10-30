package creational_patterns.abstract_factory.aircraft;

import creational_patterns.abstract_factory.transport_interface.Aircraft;

public class TU134 implements Aircraft {
    @Override
    public void flight() {
        System.out.println("TU134 fly");
    }
}
