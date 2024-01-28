package creation.factory_method;

public class ProductService {

  /**
   * Normal approach to create an instance: expose the creation logic in services
   * @param price
   * @param name
   * @return
   */
  public Product createProduct(int price, String name) {
    final Product product;
    if (price == 0) {
      product = new FreeProduct(name + " FREE", price);
    } else {
      product = new PricedProduct(name, price);
    }
    return product;
  }

  public static void main(String[] args) {
    // Parameterized Factory Method pattern: hide the creation logic in factories
    // All objects the factory method creates will extend the Product class
    final Factory factory = new Factory();
    final Product pricedProduct = factory.newProduct("book", 10);
    final Product freeProduct = factory.newProduct("book 2", 0);
  }
}
