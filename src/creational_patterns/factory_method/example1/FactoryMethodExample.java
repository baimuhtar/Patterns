package creational_patterns.factory_method.example1;

import java.util.List;

public class FactoryMethodExample {
    public static void main(String[] args) {
        List<Creator> creators = List.of(new ConcreteCreatorA(), new ConcreteCreatorB());
        creators.stream().map(Creator::factoryMethod).map(Object::getClass).forEach(System.out::println);
    }
}
