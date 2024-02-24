package behavior.visitor;

/** Common interface of base class that need to be visited */
public interface Element {
  void accept(Visitor visitor);
}
