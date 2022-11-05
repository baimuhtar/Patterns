package structural_patterns.adapter.example2;

public interface Database {
    void insert();

    void update();

    void select();

    void remove();
}
