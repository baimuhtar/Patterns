package structural_pattern.decorator.decorators.objects;

public class TextView implements Component{
    @Override
    public void draw() {
        System.out.println("draw textview");
    }
}
