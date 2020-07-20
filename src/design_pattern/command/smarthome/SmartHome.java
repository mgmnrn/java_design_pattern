package design_pattern.command.smarthome;

public class SmartHome {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        Gerage gerage = new Gerage();

        LightOnCommand lightOnCommand = new LightOnCommand(light);
        LightOffCommand lightOfCommand = new LightOffCommand(light);

        GerageCloseCommand gerageCloseCommand = new GerageCloseCommand(gerage);
        GerageOpenCommand gerageOpenCommand = new GerageOpenCommand(gerage);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();
        remote.setCommand(lightOfCommand);
        remote.buttonWasPressed();
        remote.setCommand(gerageOpenCommand);
        remote.buttonWasPressed();
        remote.undoButtonWasPressed();
    }
}