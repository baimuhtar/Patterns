package behavioral_patterns;

import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        Subscriber1 subscriber1 = new Subscriber1();
        Subscriber2 subscriber2 = new Subscriber2();

        publisher.addListener(subscriber1);
        publisher.addListener(subscriber2);

        publisher.createNewMessage("Message");
        publisher.notifySubscribers("Surprise");

    }
}
