package behavior.strategy;

public class ExperiencedAuthorLevelStrategy implements AuthorLevelStrategy {

  @Override
  public String getLevelName() {
    return AuthorLevels.EXPERIENCE;
  }

  @Override
  public long getMaxBookCount() {
    return 6;
  }
}
