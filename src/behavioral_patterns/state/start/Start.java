package behavioral_patterns.state.start;

import behavioral_patterns.state.context.TransformerContext;
import behavioral_patterns.state.state.FireState;
import behavioral_patterns.state.state.MoveState;
import behavioral_patterns.state.state.TransformerState;

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
