package design_pattern.state.atm;

public class Context {
    private State state;

    private State readyState;
    private State offState;
    private State workState;

    Context() {
        this.state = null;
        this.readyState = null;
        this.offState = null;
        this.workState = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getReadyState() {
        return readyState;
    }

    public void setReadyState(State readyState) {
        this.readyState = readyState;
    }

    public State getOffState() {
        return offState;
    }

    public void setOffState(State offState) {
        this.offState = offState;
    }

    public State getWorkState() {
        return workState;
    }

    public void setWorkState(State workState) {
        this.workState = workState;
    }
}
