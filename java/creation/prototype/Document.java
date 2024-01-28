package creation.prototype;

import lombok.Builder;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
import java.util.Objects;

@Builder
@EqualsAndHashCode
public class Document implements Cloneable {
  private String title;
  private String author;
  private String category;
  private LocalDateTime releasedAt;

  @Override
  public Document clone() {
    return Document.builder()
        .title(this.title)
        .author(this.author)
        .category(this.category)
        .releasedAt(this.releasedAt)
        .build();
  }
}
