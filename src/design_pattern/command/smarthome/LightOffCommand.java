package design_pattern.command.smarthome;

public class LightOffCommand implements Command{
    private Light light;

    LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }

    @Override
    public void undo() {
        this.light.on();
    }
}
