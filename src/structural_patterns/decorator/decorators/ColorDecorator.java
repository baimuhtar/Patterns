package structural_patterns.decorator.decorators;

import structural_patterns.decorator.objects.Component;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }
}
