package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.aircraft.TU134;
import creational_patterns.abstract_factory.factory_interface.TransportFactory;
import creational_patterns.abstract_factory.transport.Niva;
import creational_patterns.abstract_factory.transport_interface.Aircraft;
import creational_patterns.abstract_factory.transport_interface.Car;

public class RussianFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
