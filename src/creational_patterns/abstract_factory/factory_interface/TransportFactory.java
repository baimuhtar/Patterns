package creational_patterns.abstract_factory.factory_interface;

import creational_patterns.abstract_factory.transport_interface.Aircraft;
import creational_patterns.abstract_factory.transport_interface.Car;

//фабрика по созданию транспортных средств
public interface TransportFactory {

    //фабрика производит:

    Car createCar();

    Aircraft createAircraft();
}
