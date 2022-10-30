package creational_patterns.builder;

public class Waiter {
    private final PizzaBuilder pizzaBuilder;

    public Waiter(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public void constructPizza() {
        pizzaBuilder.createNewPizzaProduct();
        pizzaBuilder.buildDough();
        pizzaBuilder.buildSauce();
    }
}
