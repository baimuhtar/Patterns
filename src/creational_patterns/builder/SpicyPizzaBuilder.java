package creational_patterns.builder;

public class SpicyPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildDough() {
        pizza.setDough("pan baked");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("hot");
    }
}
