package headfirst.command.simpleremote;

public class LightOnCommand implements Command {
  Light light;
  public LightOnCommand(Light light) {
    this.light=light;
  }//»ý¼ºÀÚ
  public void execute() {
    light.on();
  }
}