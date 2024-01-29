package behavior.strategy;

public class ExpertAuthorLevelStrategy implements AuthorLevelStrategy {

  @Override
  public String getLevelName() {
    return AuthorLevels.EXPERT;
  }

  @Override
  public long getMaxBookCount() {
    return Long.MAX_VALUE;
  }
}
