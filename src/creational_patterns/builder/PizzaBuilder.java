package creational_patterns.builder;

abstract class PizzaBuilder {
    protected Pizza pizza;

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }
    public abstract void buildDough();

    public abstract void buildSauce();

    public abstract void buildMashroom();
}
