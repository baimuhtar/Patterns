package structural_patterns.adapter.example2;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();

        database.insert();
        database.select();
        database.remove();
        database.update();
    }
}
