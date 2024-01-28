package behavior.chain_of_responsibilities;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@AllArgsConstructor
public class InvalidProductLocationFilter implements ProductFilter<Product, Product> {

  @Override
  public List<Product> handle(List<Product> products) {
    return products.stream()
        .filter(p -> !Objects.equals(p.getLocation(), "Paris"))
        .collect(Collectors.toList());
  }
}
