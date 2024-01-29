package behavior.strategy;

public class NewbieAuthorLevelStrategy implements AuthorLevelStrategy {

  @Override
  public String getLevelName() {
    return AuthorLevels.NEW_ONE;
  }

  @Override
  public long getMaxBookCount() {
    return 3;
  }
}
