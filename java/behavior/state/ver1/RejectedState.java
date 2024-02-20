package behavior.state.ver1;

public class RejectedState implements State {

  @Override
  public void process() {
    System.out.println("Rejected");
  }
}
