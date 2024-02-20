package behavior.state.ver1;

public class SubmittedState implements State {

  @Override
  public void process() {
    System.out.println("Submitted");
  }
}
