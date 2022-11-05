package behavioral_patterns.state.example1.start;

import behavioral_patterns.state.example1.context.TransformerContext;
import behavioral_patterns.state.example1.state.FireState;
import behavioral_patterns.state.example1.state.MoveState;
import behavioral_patterns.state.example1.state.TransformerState;

public class Start {
    public static void main(String[] args) {
        TransformerContext context = new TransformerContext();

        TransformerState fireState = new FireState();
        TransformerState moveState = new MoveState();

        context.setState(fireState);
        context.action();

        context.setState(moveState);
        context.action();


    }
}
