package behavior.command.ver1;

import java.util.HashMap;
import java.util.Map;

public class Invoker {

  private final Map<String, Command> commands;

  public Invoker(Receiver receiver) {
    commands = new HashMap<>();
    commands.put("command1", new ConcreteCommand1(receiver));
    commands.put("command2", new ConcreteCommand2(receiver));
  }

  public void invoke(String commandKey) {
    Command command = commands.get(commandKey);
    if (command == null) throw new IllegalArgumentException("Command not found");
    command.execute();
  }
}
