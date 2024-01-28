package behavior.chain_of_responsibilities;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class InvalidProductPriceFilter implements ProductFilter<Product, Product> {

  @Override
  public List<Product> handle(List<Product> products) {
    return products.stream().filter(p -> p.getPrice() > 0).collect(Collectors.toList());
  }
}
