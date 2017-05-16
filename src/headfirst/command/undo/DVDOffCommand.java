package headfirst.command.undo;

public class DVDOffCommand implements Command {
  DVD dvd;
  //int level;
  public DVDOffCommand(DVD dvd) {
    this.dvd=dvd;
  }
  public void execute() {
    //level = light.getLevel();
    dvd.off();
  }
  public void undo() {
    //light.dim(level);
  }
}