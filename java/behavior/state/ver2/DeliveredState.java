package behavior.state.ver2;

public class DeliveredState implements State {

  @Override
  public void next(Package pkg) {
    pkg.setState(new ReceivedState());
  }

  @Override
  public void prev(Package pkg) {
    pkg.setState(new OrderedState());
  }

  @Override
  public void printStatus() {
    System.out.println("Package delivered to post office, not received yet.");
  }
}
