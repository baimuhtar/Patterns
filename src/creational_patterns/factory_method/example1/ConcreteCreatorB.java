package creational_patterns.factory_method.example1;

public class ConcreteCreatorB extends Creator{
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}
