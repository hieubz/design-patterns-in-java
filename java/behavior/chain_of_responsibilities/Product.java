package behavior.chain_of_responsibilities;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
  private String name;
  private String category;
  private double price;
  private String desc;
  private String location;
}
