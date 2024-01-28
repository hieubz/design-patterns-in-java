package creation.prototype;

import java.time.LocalDateTime;

public class Demo {

  public static void main(String[] args) {
    Document originalDoc =
        Document.builder()
            .title("My Life")
            .author("Henry")
            .category("Self Help")
            .releasedAt(LocalDateTime.now())
            .build();
    Document copiedDoc = originalDoc.clone();
    System.out.println(copiedDoc.equals(originalDoc));
  }
}
