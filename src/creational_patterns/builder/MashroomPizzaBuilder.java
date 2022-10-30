package creational_patterns.builder;

public class MashroomPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildDough() {
        pizza.setDough("More pan");
    }

    @Override
    public void buildSauce() {
    }

    @Override
    public void buildMashroom() {
      pizza.setMashroom("mashrooms");
    }

}
