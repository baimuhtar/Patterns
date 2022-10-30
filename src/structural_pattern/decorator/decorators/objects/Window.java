package structural_pattern.decorator.decorators.objects;

public class Window implements Component{
    @Override
    public void draw() {
        System.out.println("draw window");
    }
}
