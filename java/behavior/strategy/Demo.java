package behavior.strategy;

/** client code */
public class Demo {

  public static void main(String[] args) {
    long bookCount = 20;
    AuthorLevelStrategyContext authorLevelStrategyContext = new AuthorLevelStrategyContext();
    String authorLevel = authorLevelStrategyContext.retrieveAuthorLevel(bookCount);
    System.out.println(authorLevel); // should be EXPERT
  }
}
