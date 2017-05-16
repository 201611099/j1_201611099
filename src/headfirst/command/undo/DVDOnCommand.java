package headfirst.command.undo;

public class DVDOnCommand implements Command {
  DVD dvd;
  //int level;
  public DVDOnCommand(DVD dvd) {
    this.dvd=dvd;
  }//������
  public void execute() {
    //level=light.getLevel();
    dvd.on();
  }
  public void undo() {
    //light.dim(level);
  }
}