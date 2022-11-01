package behavioral_patterns.strategy.strategy;

public interface AuthStrategy {
    boolean CheckLogin(String name, String password);
}
