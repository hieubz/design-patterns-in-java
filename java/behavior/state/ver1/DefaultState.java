package behavior.state.ver1;

public class DefaultState implements State {
  public DefaultState() {}

  @Override
  public void process() {
    System.out.println("Document not found! Please create a new one!!");
  }
}
