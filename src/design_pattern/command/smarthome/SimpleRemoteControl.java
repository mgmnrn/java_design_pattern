package design_pattern.command.smarthome;

public class SimpleRemoteControl {
    Command slot;

    SimpleRemoteControl() {
    }

    void setCommand(Command slot) {
        this.slot = slot;
    }

    void buttonWasPressed() {
        this.slot.execute();
    }

    void undoButtonWasPressed() {
        this.slot.undo();
    }
}