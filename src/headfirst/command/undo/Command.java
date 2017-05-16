package headfirst.command.undo;

public interface Command {
  //interface : marker (return¾øÀ½)
  public void execute();
  public void undo();
}