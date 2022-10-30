package creational_patterns.factory_method.example2;

//фабрика по созданию автомобилей
public class CarSelector {

    //фабричный метод, который создает нужны автомобиль
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case CITY -> car = new Porsche();
            case OFF_ROAD -> car = new Jeep();
            case GRASS -> car = new NewJeep();
        }
        return car;
    }
}
