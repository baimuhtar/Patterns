package structural_patterns.facade.facades;

import structural_patterns.facade.parts.Dver;
import structural_patterns.facade.parts.Koleso;
import structural_patterns.facade.parts.Zazhiganie;

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
