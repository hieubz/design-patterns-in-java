package behavior.chain_of_responsibilities;

import java.util.ArrayList;
import java.util.List;

public class Demo {

  public static void main(String[] args) {
    List<Product> originProducts = new ArrayList<>();
    originProducts.add(Product.builder().build());
    originProducts.add(Product.builder().name("test 1").build());
    originProducts.add(Product.builder().name("test 2").price(20).build());

    // can replace by @PostConstruct and DI in Spring apps
    List<ProductFilter> productFilters = new ArrayList<>();
    productFilters.add(new InvalidProductNameFilter());
    productFilters.add(new InvalidProductPriceFilter());
    productFilters.add(new InvalidProductLocationFilter());
    AvailableProductChainCollector productChainCollector = new AvailableProductChainCollector(productFilters);

    List<Product> availableProducts = productChainCollector.handle(originProducts);
    System.out.println(availableProducts.size()); // should be 1
  }
}
