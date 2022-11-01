package behavioral_patterns.state.state;

public class MoveState implements TransformerState{
    @Override
    public void action() {
        System.out.println("Transform to Track");
    }
}
