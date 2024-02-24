package behavior.visitor;

/** Common interface contains visit method */
public interface Visitor {
  void visit(ConcreteElementA element);

  void visit(ConcreteElementB element);
}
