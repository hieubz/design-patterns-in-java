package behavior.chain_of_responsibilities;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class AvailableProductChainCollector implements OperationChainCollectable<Product> {

  private List<ProductFilter> productFilters = new ArrayList<>();

  public AvailableProductChainCollector(List<ProductFilter> productFilters) {
    this.productFilters = productFilters;
  }

  //  @PostConstruct
  //  public void init() {
  //    // can replace the creation code by DI in Spring Boot
  //    productFilters.add(new InvalidProductNameFilter());
  //    productFilters.add(new InvalidProductPriceFilter());
  //    productFilters.add(new InvalidProductLocationFilter());
  //  }

  @Override
  public List<Product> handle(List<Product> products) {
    List<Product> validProducts = new ArrayList<>(products);
    for (ProductFilter filter : productFilters) {
      validProducts = filter.handle(validProducts);
    }
    return validProducts;
  }
}
