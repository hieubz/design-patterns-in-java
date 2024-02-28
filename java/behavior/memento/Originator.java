package behavior.memento;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Creates a memento containing a snapshot of its current internal state.
 * Uses the memento to restore its internal state.
 */
@Data
public class Originator {

  private String state;

  public Memento createMemento() {
    // Notes: can use deep clone for complex objects
    return new Memento(state);
  }

  public void restore(Memento memento) {
    state = memento.state;
  }

  /**
   * Store internal state of the Originator object.
   * Protects against access by objects other than the originator
   */
  @AllArgsConstructor
  public static class Memento {
    private String state;
  }
}
