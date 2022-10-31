package structural_patterns.facade.objects;

import structural_patterns.facade.facades.CarFacade;
import structural_patterns.facade.parts.Dver;
import structural_patterns.facade.parts.Koleso;
import structural_patterns.facade.parts.Zazhiganie;

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
