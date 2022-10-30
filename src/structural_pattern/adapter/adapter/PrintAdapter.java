package structural_pattern.adapter.adapter;

import structural_pattern.adapter.objects.Printer;

import java.util.List;

public class PrintAdapter implements PageListPrinter{
    private Printer printer = new Printer();

    @Override
    public void print(List<String> list) {
        for (String text : list) {
            printer.print(text);
        }
    }
}
