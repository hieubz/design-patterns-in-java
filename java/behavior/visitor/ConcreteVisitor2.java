package behavior.visitor;

public class ConcreteVisitor2 implements Visitor {

  @Override
  public void visit(ConcreteElementA element) {
    System.out.println("Visitor 2: visit element A");
  }

  @Override
  public void visit(ConcreteElementB element) {
    System.out.println("Visitor 2: visit element B");
  }
}
