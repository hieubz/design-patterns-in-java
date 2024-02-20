package behavior.state.ver1;

public class ApprovedState implements State {
  @Override
  public void process() {
    System.out.println("Approved");
  }
}
