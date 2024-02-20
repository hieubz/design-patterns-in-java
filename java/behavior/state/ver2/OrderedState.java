package behavior.state.ver2;

/**
 * Concreted state class.
 * One state knows about the other. We’re making them tightly coupled and
 * create the flow as in Finite State Machine.
 */
public class OrderedState implements State {

  @Override
  public void next(Package pkg) {
    pkg.setState(new DeliveredState());
  }

  @Override
  public void prev(Package pkg) {
    System.out.println("The package is in its root state!");
  }

  @Override
  public void printStatus() {
    System.out.println("Package ordered, not delivered to the office yet.");
  }
}
