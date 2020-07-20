package Bank.ATM;

public class Context {
    private State state;
    private ReadyState readyState;
    private ShutdownState shutdownState;
    private WorkingState workingState;

    public Context() {
        this.readyState = new ReadyState();
        this.shutdownState = new ShutdownState();
        this.workingState = new WorkingState();
        this.state = readyState;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    ReadyState getReadyState() {
        return readyState;
    }

    ShutdownState getShutdownState() {
        return shutdownState;
    }

    WorkingState getWorkingState() {
        return workingState;
    }

}
