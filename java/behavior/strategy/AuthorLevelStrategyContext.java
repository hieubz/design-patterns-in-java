package behavior.strategy;

import java.util.Arrays;
import java.util.List;

/**
 * manage and use strategies to find the level of an author ==> client code will work with context.
 * However, in some cases, client code can work directly with strategies if client understand how
 * strategies differ.
 */
public class AuthorLevelStrategyContext {
  private final List<AuthorLevelStrategy> strategies =
      Arrays.asList(
          new NewbieAuthorLevelStrategy(),
          new ExperiencedAuthorLevelStrategy(),
          new ExpertAuthorLevelStrategy());

  public String retrieveAuthorLevel(long bookCount) {
    String level = AuthorLevels.NEW_ONE;
    for (AuthorLevelStrategy s : strategies) {
      if (bookCount <= s.getMaxBookCount()) {
        level = s.getLevelName();
        break;
      }
    }
    return level;
  }
}
