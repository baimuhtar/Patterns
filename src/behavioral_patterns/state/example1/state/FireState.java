package behavioral_patterns.state.example1.state;

public class FireState implements TransformerState{
    @Override
    public void action() {
        System.out.println("Transform for attack");
    }
}
