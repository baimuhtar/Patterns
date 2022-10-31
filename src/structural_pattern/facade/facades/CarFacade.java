package structural_pattern.facade.facades;

import structural_pattern.facade.parts.Dver;
import structural_pattern.facade.parts.Koleso;
import structural_pattern.facade.parts.Zazhiganie;

public class CarFacade {
    private Dver dver = new Dver();
    private Koleso koleso = new Koleso();
    private Zazhiganie zazhiganie = new Zazhiganie();

    public void go(){
        dver.open();
        koleso.turn();
        zazhiganie.fire();
    }
}
