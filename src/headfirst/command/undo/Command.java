package headfirst.command.undo;

public interface Command {
  //interface : marker (return����)
  public void execute();
  public void undo();
}