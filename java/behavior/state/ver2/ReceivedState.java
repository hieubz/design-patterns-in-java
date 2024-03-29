package behavior.state.ver2;

public class ReceivedState implements State {

  @Override
  public void next(Package pkg) {
    System.out.println("This package is already received by a client.");
  }

  @Override
  public void prev(Package pkg) {
    pkg.setState(new DeliveredState());
  }

  @Override
  public void printStatus() {
    System.out.println("Package was received by client.");
  }
}
