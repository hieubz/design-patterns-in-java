package behavior.chain_of_responsibilities;

import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@AllArgsConstructor
public class InvalidProductNameFilter implements ProductFilter<Product, Product> {

  @Override
  public List<Product> handle(List<Product> products) {
    return products.stream().filter(p -> Objects.nonNull(p.getName())).collect(Collectors.toList());
  }
}
