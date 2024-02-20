package behavior.state.ver1;

public class NewState implements State {

  @Override
  public void process() {
    System.out.println("Create a new document.");
  }
}
