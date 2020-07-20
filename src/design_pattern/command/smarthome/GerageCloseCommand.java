package design_pattern.command.smarthome;

public class GerageCloseCommand implements Command {
    private Gerage gerage;

    GerageCloseCommand(Gerage gerage) {
        this.gerage = gerage;
    }


    @Override
    public void execute() {
        gerage.Close();
    }

    @Override
    public void undo() {
        gerage.Open();
    }
}
