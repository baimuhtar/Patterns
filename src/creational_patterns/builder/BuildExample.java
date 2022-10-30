package creational_patterns.builder;

import com.sun.jdi.event.MonitorWaitedEvent;

public class BuildExample {
    public static void main(String[] args) {
        Waiter waiter = new Waiter(new SpicyPizzaBuilder());
        waiter.constructPizza();


        Waiter waiter1 = new Waiter(new MashroomPizzaBuilder());
        waiter1.constructPizza();
    }
}
