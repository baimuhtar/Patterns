package behavioral_patterns.strategy.example1.strategy;

public interface AuthStrategy {
    boolean CheckLogin(String name, String password);
}
