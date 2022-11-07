package behavioral_patterns.strategy.example2;

public class Sleeping implements Activity{
    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
}
