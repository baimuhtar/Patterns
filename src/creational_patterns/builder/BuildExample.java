package creational_patterns.builder;

public class BuildExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(new SpicyPizzaBuilder());
        waiter.constructPizza();
    }
}
