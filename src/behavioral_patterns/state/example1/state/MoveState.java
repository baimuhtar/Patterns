package behavioral_patterns.state.example1.state;

public class MoveState implements TransformerState{
    @Override
    public void action() {
        System.out.println("Transform to Track");
    }
}
