package creational_patterns.abstract_factory.start;

import creational_patterns.abstract_factory.factory.RussianFactory;
import creational_patterns.abstract_factory.factory.USAFactory;
import creational_patterns.abstract_factory.factory_interface.TransportFactory;
import creational_patterns.abstract_factory.transport_interface.Aircraft;
import creational_patterns.abstract_factory.transport_interface.Car;

public class Start {

    private static TransportFactory factory;

    public static void main(String[] args) {
        // Можно сделать создание объектов по определенным условиям
        if(true) {
            factory = new RussianFactory();
        } else {
            factory = new USAFactory();
        }
        factory.createAircraft();
        factory.createCar();


//        TransportFactory russianFactory = new RussianFactory();
//        TransportFactory usaFactory = new USAFactory();

//        Aircraft aircraft = russianFactory.createAircraft();
//        aircraft.flight();
//
//        Car car = russianFactory.createCar();
//        car.drive();
    }
}
