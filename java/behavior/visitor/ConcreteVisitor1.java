package behavior.visitor;

/** Concrete visitor class */
public class ConcreteVisitor1 implements Visitor {

  @Override
  public void visit(ConcreteElementA element) {
    System.out.println("Visitor 1: visit element A");
  }

  @Override
  public void visit(ConcreteElementB element) {
    System.out.println("Visitor 1: visit element B");
  }
}
