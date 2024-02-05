package behavior.command.ver1;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ConcreteCommand2 implements Command {

  private final Receiver receiver;

  @Override
  public void execute() {
    receiver.action2();
  }
}
