package creational_patterns.abstract_factory.factory;

import creational_patterns.abstract_factory.aircraft.Boeing747;
import creational_patterns.abstract_factory.factory_interface.TransportFactory;
import creational_patterns.abstract_factory.transport.Porsche;
import creational_patterns.abstract_factory.transport_interface.Aircraft;
import creational_patterns.abstract_factory.transport_interface.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
