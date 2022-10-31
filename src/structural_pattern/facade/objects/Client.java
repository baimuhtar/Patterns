package structural_pattern.facade.objects;

import creational_patterns.factory_method.example2.Car;
import structural_pattern.facade.facades.CarFacade;
import structural_pattern.facade.parts.Dver;
import structural_pattern.facade.parts.Koleso;
import structural_pattern.facade.parts.Zazhiganie;

public class Client {
    public static void main(String[] args) {
        // Запуск машины без фасада
        Dver dver = new Dver();
        dver.open();

        Koleso koleso = new Koleso();
        koleso.turn();

        Zazhiganie zazhiganie = new Zazhiganie();
        zazhiganie.fire();

        // Запуск машины с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();



    }
}
