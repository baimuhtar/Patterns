package structural_pattern.decorator.decorators;

import structural_pattern.decorator.decorators.objects.Component;

public class BorderDecorator extends Decorator{

    public BorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added border");
    }
}
