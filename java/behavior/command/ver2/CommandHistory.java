package behavior.command.ver2;

import java.util.Stack;

/** store history to support undo */
public class CommandHistory {
  private Stack<Command> history = new Stack<>();

  public void push(Command c) {
    history.push(c);
  }

  public Command pop() {
    return history.pop();
  }

  public boolean isEmpty() {
    return history.isEmpty();
  }
}
