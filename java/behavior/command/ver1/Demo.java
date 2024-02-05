package behavior.command.ver1;

/**
 * client code invoke commands via an Invoker. This Invoker will route the command to the right
 * receiver and execute
 */
public class Demo {

  public static void main(String[] args) {
    Receiver receiver = new Receiver();
    Invoker invoker = new Invoker(receiver);
    invoker.invoke("command1");
    invoker.invoke("command2");
    invoker.invoke("commands"); // wrong command
  }
}
