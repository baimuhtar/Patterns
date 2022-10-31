package structural_patterns.decorator.decorators;

import structural_patterns.decorator.objects.Component;
import structural_patterns.decorator.objects.TextView;
import structural_patterns.decorator.objects.Window;

public class Start {
    private static Component window;
    private static Component textView;

    public static void main(String[] args) {
        boolean showBorder = true;
        if (showBorder) {
            window = new Window();
            textView = new TextView();
        } else {
            window = new BorderDecorator(new Window());
            textView = new BorderDecorator(new TextView());
        }
        window.draw();
        textView.draw();


        Component windowWithBorderAndColor = new ColorDecorator(new BorderDecorator(new Window()));
        windowWithBorderAndColor.draw();

        Component textView = new BorderDecorator(new TextView());
        textView.draw();
    }
}
