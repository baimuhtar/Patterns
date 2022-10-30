package structural_pattern.decorators;

import structural_pattern.objects.Component;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("... added color");
    }
}
