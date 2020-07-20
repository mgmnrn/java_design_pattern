package design_pattern.command.smarthome;

public class GerageOpenCommand implements Command {
    private Gerage gerage;
    GerageOpenCommand(Gerage gerage) {
        this.gerage = gerage;
    }

    @Override
    public void execute() {
        this.gerage.Open();
    }

    @Override
    public void undo() {
        this.gerage.Close();
    }
}
