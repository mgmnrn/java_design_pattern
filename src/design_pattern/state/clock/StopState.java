package design_pattern.state.clock;

public class StopState implements State {
    private State myState;

    public StopState(State state) {
        this.myState = state;
    }

    @Override
    public void started() {
        System.out.println("Started");
    }

    @Override
    public void stopped() {
        System.out.println("Already started");
    }
}
