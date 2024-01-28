package creation.factory_method;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Product {
  private String name;
  private long price;

  public Product(String name, long price) {
    this.name = name;
    this.price = price;
  }

  public abstract long order(long amount);
}
