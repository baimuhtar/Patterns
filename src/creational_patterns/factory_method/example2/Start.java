package creational_patterns.factory_method.example2;

public class Start {
    public static void main(String[] args) {
        CarSelector carSelector = new CarSelector();

        Car car = carSelector.getCar(RoadType.CITY);
        car.drive();
        car.stop();

        car = carSelector.getCar(RoadType.GRASS);
        car.drive();
        car.stop();

    }
}
