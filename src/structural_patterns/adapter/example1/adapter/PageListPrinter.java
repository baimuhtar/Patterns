package structural_patterns.adapter.example1.adapter;

import java.util.List;
// интерфейс для печати списка
public interface PageListPrinter {
    void print(List<String> list);
}
