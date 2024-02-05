package behavior.command.ver1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteCommand1 implements Command {
  private final Receiver receiver;

  @Override
  public void execute() {
    receiver.action1();
  }
}
