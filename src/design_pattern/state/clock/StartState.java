package design_pattern.state.clock;

public class StartState implements State{
    @Override
    public void started() {
        System.out.println("Already started started design_pattern.state");
    }

    @Override
    public void stopped() {
        System.out.println("Stopped design_pattern.state");
    }
}
