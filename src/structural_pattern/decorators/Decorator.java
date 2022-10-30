package structural_pattern.decorators;

import structural_pattern.objects.Component;

public abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
    public abstract void afterDraw();

    @Override
    public void draw(){
        component.draw();
        afterDraw();
    }
}
