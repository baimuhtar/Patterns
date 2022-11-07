package behavioral_patterns.strategy.example1.strategy;

public class DBAuth implements AuthStrategy {

    private String dbURL;
    private Object dbRef;

    public DBAuth(String dbURL) {
        this.dbURL = dbURL;
    }

    private void createConnection(String dbURL) {
        // dbRef
    }

    @Override
    public boolean CheckLogin(String name, String password) {
        System.out.println("Checking with DB ...");

        String userHash = getHash(name);
        String passHash = getHash(password);

        return checkUser(userHash, passHash);

    }

    private boolean checkUser(String name, String password) {
        // проверка в базе данных через dbRef
        return true;
    }

    public String getHash(String value) {
        // хэширование
        return "KFUTRET";
    }
}
