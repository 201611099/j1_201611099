package headfirst.command.undo;
//receiver�� ���� command (null object pattern)
public class NoCommand implements Command {
  public void execute() {
    //System.out.println("Do nothing...");
  }
  public void undo() {}
}