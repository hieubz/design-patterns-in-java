package behavior.memento;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * is responsible for the memento's safekeeping.
 * Never operates on or examines the contents of a memento.
 */
public class CareTaker {
  private final Deque<Originator.Memento> stack = new ArrayDeque<>();

  public void pushMemento(Originator.Memento memento) {
    stack.addFirst(memento);
  }

  public Originator.Memento popMemento() {
    return stack.pop();
  }
}
