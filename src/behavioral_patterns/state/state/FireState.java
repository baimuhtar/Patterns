package behavioral_patterns.state.state;

public class FireState implements TransformerState{
    @Override
    public void action() {
        System.out.println("Transform for attack");
    }
}
